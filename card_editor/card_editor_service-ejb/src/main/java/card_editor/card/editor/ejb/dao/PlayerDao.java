/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.ejb.dao;

import br.com.card_editor.entity.Player;
import card_editor.card.editor.util.DaoBase;
import com.mongodb.client.MongoDatabase;
import java.lang.instrument.IllegalClassFormatException;

/**
 *
 * @author lucas.santos
 */
public class PlayerDao extends DaoBase {

    public static void cadastrarPlayer(Player player, MongoDatabase db) throws IllegalAccessException {
        player.insert(db);
    }

    public static void excluirPlayer(Player player, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        player.delete(db);
    }

    public static void alterarPlayer(Player player, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        player.update(db);
    }

}
