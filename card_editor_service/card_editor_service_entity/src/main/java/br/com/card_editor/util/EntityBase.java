/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.util;

import com.mongodb.client.MongoDatabase;
import java.lang.reflect.Field;
import org.bson.Document;

/**
 *
 * @author lucas.santos
 */
public class EntityBase<E> {

    public void insert(MongoDatabase db) {
        Document doc = new Document();
        for (Field f : getClass().getFields()) {

        }
    }

}
