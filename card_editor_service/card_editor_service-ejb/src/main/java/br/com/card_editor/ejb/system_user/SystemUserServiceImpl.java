/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_user;

import br.com.card_editor.entity.Player;
import br.com.card_editor.entity.SystemUser;
import card_editor.card.editor.ejb.dao.SystemUserDao;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
import java.lang.instrument.IllegalClassFormatException;
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
@WebService(serviceName = "SystemUserService")
@Stateless()
public class SystemUserServiceImpl extends ServiceBase implements SystemUserService {

    private SystemUserDao dao;

    @Override
    @WebResult(name = "Resultado")
    public void salvarUsuario(
            @WebParam(name = "systemUser") SystemUser user, @WebParam(name = "player") Player p) {

        MongoClient client = new MongoClient(uri);
        try {
            if (user != null) {
                user.update(getConnetcion(client));
            }
            if (p != null) {
                p.update(getConnetcion(client));
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    @WebResult(name = "Resultado")
    public void excluirUsuario(
            @WebParam(name = "systemUser") SystemUser user, @WebParam(name = "player") Player p) {

        MongoClient client = new MongoClient(uri);
        try {
            if (user != null) {
                user.delete(getConnetcion(client));
            }
            if (p != null) {
                p.delete(getConnetcion(client));
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }
}
