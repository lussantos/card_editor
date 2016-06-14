/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.util;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author lucas.santos
 */
public class ServiceBase {

    protected final MongoClientURI uri = new MongoClientURI("mongodb://developer:developer@ds053874.mlab.com:53874/card_set_db");

    protected MongoDatabase getConnetcion(MongoClient client) {
//        MongoDatabase db = client.getDatabase(uri.getDatabase());
        return null;
    }

}
