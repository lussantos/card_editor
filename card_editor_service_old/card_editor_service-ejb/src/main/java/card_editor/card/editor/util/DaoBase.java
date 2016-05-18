/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.util;


import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 *
 * @author lucas.santos
 */
public class DaoBase {

    public static void insertData(EntityBase entity, DB connection) {
        entity.persistData();
        DBCollection collection = connection.getCollection(entity.getCollectionName());
        collection.insert(entity);
    }
}
