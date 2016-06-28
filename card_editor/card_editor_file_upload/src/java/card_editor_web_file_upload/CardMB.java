/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor_web_file_upload;

import br.com.card_editor.acesso.CardServiceAcesso;
import br.com.card_editor.acesso.SystemUserServiceAcesso;
import br.com.card_editor.ejb.card.InSalvarCard;
import br.com.card_editor.ejb.system_user.OutVerificaAcessoUsuario;
import br.com.card_editor.ejb.system_user.SystemUser;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author lucas.santos
 */
@ManagedBean(name = "cardMB")
@ViewScoped
public class CardMB implements Serializable {

    private final String COOKIE_USER = "USER_NAME_JSF";

    private SystemUser systemUser;

    @PostConstruct
    public void init() {
        systemUser = new SystemUser();
    }

    public void uploadFile(FileUploadEvent event) {
        if (getUserName() != null) {
            try {
                // write the card.getInputstream() to a FileOutputStream
                CardServiceAcesso acesso = new CardServiceAcesso();
                InSalvarCard inSalvarCard = new InSalvarCard();
                inSalvarCard.setTemplate(event.getFile().getContents());
                inSalvarCard.setUserName(getUserName());
                acesso.uploadImage(inSalvarCard);
                FacesContext.getCurrentInstance().addMessage("info", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Carta exportada com sucesso!"));
                RequestContext.getCurrentInstance().execute("verificarGrowl();");
            } catch (Exception e) {
                FacesContext.getCurrentInstance().validationFailed();
                Logger.getLogger(CardMB.class.getName()).log(Level.SEVERE, null, e);
                FacesContext.getCurrentInstance().addMessage("error", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Erro ao exportar carta!"));
                RequestContext.getCurrentInstance().execute("verificarGrowl();");
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
                    FacesContext.getCurrentInstance().validationFailed();
                }

            }
        } else {
            FacesContext.getCurrentInstance().validationFailed();
            FacesContext.getCurrentInstance().addMessage("error", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Você deve fazer o login para acessar essa funcuonalidade!"));
            RequestContext.getCurrentInstance().execute("verificarGrowl();");
        }
        RequestContext.getCurrentInstance().update("messages");
    }

    public void efetuarLogin() {
        OutVerificaAcessoUsuario out = null;
        try {
            out = new SystemUserServiceAcesso().verificaAcessoUsuario(systemUser);
        } catch (Exception ex) {
            Logger.getLogger(CardMB.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("error", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Erro ao efetuar login!"));
            RequestContext.getCurrentInstance().execute("verificarGrowl();");
        }
        if (out != null && out.isPossuiAcesso()) {
            FacesContext.getCurrentInstance().addMessage("info", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário logado com sucesso!"));
            RequestContext.getCurrentInstance().execute("verificarGrowl();");
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            request.getSession().setAttribute(COOKIE_USER, systemUser.getUserName());
        } else if (out != null && !out.isPossuiAcesso()) {
            FacesContext.getCurrentInstance().addMessage("error", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Dados de usuário inválidos!"));
            RequestContext.getCurrentInstance().execute("verificarGrowl();");
        }
        RequestContext.getCurrentInstance().update("messages");
    }

    public String getUserName() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if (request.getSession().getAttribute(COOKIE_USER) != null) {
            return request.getSession().getAttribute(COOKIE_USER).toString();
        }
        return null;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
    }

}
