/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card_editor_web_file_upload;

import br.com.card_editor.acesso.CardServiceAcesso;
import br.com.card_editor.ejb.card.CardBean;
import br.com.card_editor.ejb.card.InSalvarCard;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author lucas.santos
 */
@ManagedBean(name = "cardMB")
@ViewScoped
public class CardMB implements Serializable {

    private UploadedFile card;

    public void uploadFile() {
        OutputStream outputStream = null;
        try {
            // write the card.getInputstream() to a FileOutputStream
            byte[] file = new byte[card.getContents().length];
            System.arraycopy(card.getContents(), 0, file, 0, card.getContents().length);
            CardServiceAcesso acesso = new CardServiceAcesso();
            InSalvarCard inSalvarCard = new InSalvarCard();
            CardBean bean = new CardBean();
            bean.setTemplate(file);
            acesso.uploadImage(inSalvarCard);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(CardMB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (card.getInputstream() != null) {
                    try {
                        card.getInputstream().close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException iOException) {
            }

            if (outputStream != null) {
                try {
                    // outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public UploadedFile getCard() {
        return card;
    }

    public void setCard(UploadedFile card) {
        this.card = card;
    }

}
