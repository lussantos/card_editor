/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.ejb.dao;

import br.com.card_editor.entity.SystemUser;
import card_editor.card.editor.util.DaoBase;
import com.mongodb.client.MongoDatabase;
import java.lang.instrument.IllegalClassFormatException;

/**
 *
 * @author lucas.santos
 */
public class SystemUserDao extends DaoBase {

    public static void cadastrarUsuario(SystemUser user, MongoDatabase db) throws IllegalAccessException {
        user.insert(db);
    }

    public static void excluirUsuario(SystemUser user, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        user.delete(db);
    }

    public static void alterarUsuario(SystemUser user, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        user.update(db);
    }
}
