/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor_web_file_upload;

import br.com.card_editor.acesso.CardServiceAcesso;
import br.com.card_editor.ejb.card.InSalvarCard;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author lucas.santos
 */
@ManagedBean(name = "cardMB")
@ViewScoped
public class CardMB implements Serializable {

    public void uploadFile(FileUploadEvent event) {
        try {
            // write the card.getInputstream() to a FileOutputStream
            CardServiceAcesso acesso = new CardServiceAcesso();
            InSalvarCard inSalvarCard = new InSalvarCard();
            inSalvarCard.setTemplate(event.getFile().getContents());
            acesso.uploadImage(inSalvarCard);
            FacesContext.getCurrentInstance().addMessage("info", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Sucesso ao fazer o upload do projeto."));
        } catch (Exception e) {
            Logger.getLogger(CardMB.class.getName()).log(Level.SEVERE, null, e);
            FacesContext.getCurrentInstance().addMessage("error", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Erro ao fazer o upload do projeto."));
        } finally {
            try {
                if (event.getFile().getInputstream() != null) {
                    try {
                        event.getFile().getInputstream().close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException iOException) {
            }

        }
    }
}
