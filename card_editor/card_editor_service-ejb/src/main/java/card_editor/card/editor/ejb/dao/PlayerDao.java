/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.ejb.dao;

import br.com.card_editor.annotation.Tabela;
import br.com.card_editor.entity.Player;
import card_editor.card.editor.util.DaoBase;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.lang.instrument.IllegalClassFormatException;

/**
 *
 * @author lucas.santos
 */
public class PlayerDao extends DaoBase {

    public static void cadastrarPlayer(Player player, MongoDatabase db) throws IllegalAccessException {
        MongoCollection collection = db.getCollection(player.getClass().getAnnotation(Tabela.class).collectionName());
        if (collection.count(new BasicDBObject("idPlayer", player.getIdPlayer())) <= 0) {
            player.insert(db);
        } else {
            throw new IllegalAccessException("Deve ser inserido um usuáio com nome ainda não usado.");
        }
    }

    public static void excluirPlayer(Player player, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        player.delete(db);
    }

    public static void alterarPlayer(Player player, MongoDatabase db) throws IllegalAccessException, IllegalClassFormatException {
        player.update(db);
    }

}
