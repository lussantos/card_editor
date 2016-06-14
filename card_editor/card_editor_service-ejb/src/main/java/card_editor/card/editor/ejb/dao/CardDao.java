/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.ejb.dao;

import br.com.card_editor.entity.Card;
import card_editor.card.editor.util.DaoBase;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author lucas.santos
 */
public class CardDao extends DaoBase {

    public static void uploadCard(Card card, MongoDatabase db) throws IllegalAccessException {
        card.insert(db);
    }
}
