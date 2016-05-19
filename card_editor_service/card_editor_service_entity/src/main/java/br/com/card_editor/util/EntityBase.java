/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.util;

import br.com.card_editor.annotation.Coluna;
import br.com.card_editor.annotation.ID;
import br.com.card_editor.annotation.Tabela;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.Serializable;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Field;
import org.bson.Document;

/**
 *
 * @author lucas.santos
 */
@Tabela(collectionName = "EntityBase")
public abstract class EntityBase implements Serializable {

    private final String ID_COLUMN = "_id";

    public void insert(MongoDatabase db) throws IllegalAccessException {
        Document doc = new Document();
        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Coluna.class)) {
                f.setAccessible(Boolean.TRUE);
                doc.put(f.getAnnotation(Coluna.class).name(), f.get(this));
                f.setAccessible(Boolean.FALSE);
            } else if (f.isAnnotationPresent(ID.class)) {
                f.setAccessible(Boolean.TRUE);
                doc.put(ID_COLUMN, f.get(this));
                f.setAccessible(Boolean.FALSE);
            }
        }
        MongoCollection collection = db.getCollection(getClass().getAnnotation(Tabela.class).collectionName());
        collection.insertOne(doc);
    }

    public void update(MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        Document doc = new Document();
        Document query = new Document();
        boolean possuiId = Boolean.FALSE;
        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Coluna.class)) {
                f.setAccessible(Boolean.TRUE);
                doc.put(f.getAnnotation(Coluna.class).name(), f.get(this));
                f.setAccessible(Boolean.FALSE);
            } else if (f.isAnnotationPresent(ID.class)) {
                possuiId = Boolean.TRUE;
                f.setAccessible(Boolean.TRUE);
                query.put(ID_COLUMN, f.get(this));
                doc.put(ID_COLUMN, f.get(this));
                f.setAccessible(Boolean.FALSE);
            }
        }
        if (possuiId) {
            MongoCollection collection = db.getCollection(getClass().getAnnotation(Tabela.class).collectionName());
            collection.updateOne(query, doc);
        } else {
            throw new IllegalClassFormatException("É obrigatória a definição de uma chave primária");
        }
    }

    public void delete(MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        Document query = new Document();
        boolean possuiId = Boolean.FALSE;
        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(ID.class)) {
                possuiId = Boolean.TRUE;
                f.setAccessible(Boolean.TRUE);
                query.put(ID_COLUMN, f.get(this));
                f.setAccessible(Boolean.FALSE);
            }
        }
        if (possuiId) {
            MongoCollection collection = db.getCollection(getClass().getAnnotation(Tabela.class).collectionName());
            collection.deleteOne(query);
        } else {
            throw new IllegalClassFormatException("É obrigatória a definição de uma chave primária");
        }
    }
}
