/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.card;

import br.com.card_editor.entity.Card;
import br.com.card_editor.input.InSalvarCard;
import card_editor.card.editor.ejb.dao.CardDao;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author lucas.santos
 */
@WebService(serviceName = "CardService")
@Stateless()
public class CardServiceImpl extends ServiceBase implements CardService {

    @Override
    public void uploadCard(InSalvarCard inSalvarCard) {
        try {
            File path = new File("pastaCard2");
            path.mkdir();
            path.createNewFile();
            File file2 = new File(path, "card.tgz");
            FileOutputStream fos = new FileOutputStream(file2);
            fos.write(inSalvarCard.getCardBean().getTemplate());
            fos.close();
        } catch (Exception e) {

        }
        MongoClient client = new MongoClient(uri);
        try {
            CardDao.uploadCard(convertCard(inSalvarCard), getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CardServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    private Card convertCard(InSalvarCard inSalvarCard) {
        Card card = new Card();
        if (inSalvarCard.getCardBean() != null) {
            card.setId(inSalvarCard.getCardBean().getId());
            card.setDescription(inSalvarCard.getCardBean().getDescription());
            card.setName(inSalvarCard.getCardBean().getName());
            card.setNickName(inSalvarCard.getNickNameUser());
        }
        return card;

    }

}
