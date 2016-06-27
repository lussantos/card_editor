/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.card;

import br.com.card_editor.bean.CardBean;
import br.com.card_editor.entity.Card;
import br.com.card_editor.input.InSalvarCard;
import br.com.card_editor.input.InSearchImage;
import card_editor.card.editor.ejb.dao.CardDao;
import card_editor.card.editor.util.CompressedFilesUtil;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;
import org.codehaus.plexus.archiver.UnArchiver;
import org.codehaus.plexus.archiver.tar.TarGZipUnArchiver;
import org.codehaus.plexus.archiver.tar.TarUnArchiver;
import org.codehaus.plexus.archiver.zip.AbstractZipUnArchiver;
import org.codehaus.plexus.archiver.zip.ZipUnArchiver;
import org.codehaus.plexus.logging.console.ConsoleLogger;

/**
 *
 * @author lucas.santos
 */
@WebService(serviceName = "CardService")
@Stateless()
public class CardServiceImpl extends ServiceBase implements CardService {

    @Override
    public void insertCard(InSalvarCard inSalvarCard) throws Exception {

        MongoClient client = new MongoClient(uri);
        CompressedFilesUtil.convertByteFToFile(inSalvarCard.getTemplate(), "user");
        CompressedFilesUtil.decompressArchive("user");
        try {
            CardDao.insertCard(convertCard(inSalvarCard), getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CardServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    public List<CardBean> searchImage(InSearchImage inSearchImage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Card convertCard(InSalvarCard inSalvarCard) {
        Card card = new Card();
        if (inSalvarCard != null) {
            card.setDescription(inSalvarCard.getDescription());
            card.setName(inSalvarCard.getName());
            card.setNickName(inSalvarCard.getUserName());
        }
        return card;

    }

}
