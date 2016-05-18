/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_user;

import br.com.card_editor.entity.SystemUser;
import card_editor.card.editor.ejb.dao.SystemUserDao;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.bson.Document;

/**
 *
 * @author lucas.santos
 */
@WebService
@Stateless()
public class SystemUserServiceImpl extends ServiceBase implements SystemUserService {

    private SystemUserDao dao;

    @Override
    @WebResult(name = "resposta")
    public void salvarUsuario(
            @WebParam(name = "user") SystemUser user) {

        MongoClient client = new MongoClient(uri);
        MongoCollection collection = getConnetcion(client).getCollection("SystemUser");
        Document doc = new Document();
        doc.put("userName", "teste2");
        doc.put("userPassword", "abc");
        collection.insertOne(doc);
        client.close();
    }

}
