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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

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
        try {
            //        MongoCollection collection = getConnetcion(client).getCollection("SystemUser");
//        Document doc = new Document();
//        doc.put("userName", "teste2");
//        doc.put("userPassword", "abc");
//        collection.insertOne(doc);
            user.insert(getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

}
