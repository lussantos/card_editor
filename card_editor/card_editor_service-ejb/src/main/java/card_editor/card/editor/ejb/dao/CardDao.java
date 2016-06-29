/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.ejb.dao;

import br.com.card_editor.entity.Card;
import br.com.card_editor.input.InSearchImage;
import card_editor.card.editor.util.DaoBase;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.File;
import java.util.List;

/**
 *
 * @author lucas.santos
 */
public class CardDao extends DaoBase {

    public static void insertCard(Card card, DB db) throws Exception {
        try {
            GridFS gfsPhoto = new GridFS(db, "photo");
            GridFSInputFile gfsFile = gfsPhoto.createFile(card.getTemplate());
            gfsFile.setFilename(card.getTemplate().getName());
            gfsFile.put("name", card.getName());
            gfsFile.put("text", card.getText());
            gfsFile.put("userName", card.getUserName());
            gfsFile.save();

            File pathRemove = new File(card.getTemplate().getParent());
            pathRemove.mkdir();
            if (card.getTemplate().exists()) {
                card.getTemplate().delete();
            }
            if (pathRemove.exists()) {
                pathRemove.delete();
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage(), e.getCause());
        }
    }

    public static List<GridFSDBFile> searchCards(GridFS gfsPhoto, InSearchImage inSearchImage) {

        BasicDBObject filter = new BasicDBObject();
        if (inSearchImage.getCardName() != null) {
            filter.put("name", inSearchImage.getCardName());
        }
        if (inSearchImage.getUserName() != null) {
            filter.put("userName", inSearchImage.getUserName());
        }
        if (inSearchImage.getIdImage() != null) {
            filter.put("_id", new BasicDBObject("oid", inSearchImage.getIdImage()));
        }

        List<GridFSDBFile> imagesForOutput = gfsPhoto.find(filter);

        return imagesForOutput;
    }
}
