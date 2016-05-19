/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.ejb.dao;

import br.com.card_editor.annotation.Tabela;
import br.com.card_editor.entity.SystemUser;
import card_editor.card.editor.util.DaoBase;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.lang.instrument.IllegalClassFormatException;

/**
 *
 * @author lucas.santos
 */
public class SystemUserDao extends DaoBase {

    public static void cadastrarUsuario(SystemUser user, MongoDatabase db) throws IllegalAccessException {
        MongoCollection collection = db.getCollection(user.getClass().getAnnotation(Tabela.class).collectionName());
        if (collection.count(new BasicDBObject("userName", user.getUserName())) <= 0) {
            user.insert(db);
        } else {
            throw new IllegalAccessException("Deve ser inserido um usuáio com nome ainda não usado.");
        }
    }

    public static void excluirUsuario(SystemUser user, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        user.delete(db);
    }

    public static void alterarUsuario(SystemUser user, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        user.update(db);
    }

}
