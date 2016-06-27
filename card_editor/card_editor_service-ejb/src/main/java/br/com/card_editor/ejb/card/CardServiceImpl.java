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
    public void uploadCard(InSalvarCard inSalvarCard) {
        try {
            File path = new File("pastaCard2");
            path.mkdir();
            if (!path.exists()) {
                path.createNewFile();
            }
            File compressed = new File(path, "card.tgz");
            FileOutputStream fos = new FileOutputStream(compressed);
            fos.write(inSalvarCard.getCardBean().getTemplate());
            fos.close();
            compressed = new File(path, "card.tgz");
        } catch (Exception e) {

        }
        try {
            File path = new File("pastaCard2");
            path.mkdir();
            File compressed = new File(path, "card.tgz");
            if (compressed.exists()) {

                final UnArchiver unarchiver;
                final ConsoleLogger consoleLogger
                        = new ConsoleLogger(org.codehaus.plexus.logging.Logger.LEVEL_INFO, "console");
                if (compressed.getAbsolutePath().endsWith(".tgz")
                        || compressed.getAbsolutePath().endsWith(".tar.gz")) {
                    unarchiver = new TarGZipUnArchiver();
                    ((TarUnArchiver) unarchiver).enableLogging(consoleLogger);
                } else if (compressed.getAbsolutePath().endsWith(".zip")) {
                    unarchiver = new ZipUnArchiver();
                    ((AbstractZipUnArchiver) unarchiver).enableLogging(consoleLogger);
                } else {
                    throw new RuntimeException(String
                            .format("Compressed file must end in .zip, .tgz, or .tar.gz, but path is %s", compressed));
                }

                unarchiver.setSourceFile(compressed);
                final File destDir = new File("card_decompressed");
                destDir.mkdir();
                destDir.createNewFile();
                unarchiver.setDestDirectory(destDir);
                unarchiver.extract();
            }
        } catch (Exception e) {
            e.printStackTrace();
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
