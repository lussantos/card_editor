/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card_editor_web;

import br.com.card_editor.acesso.PlayerImplAcesso;
import br.com.card_editor.locate.PlayerServiceLocate;
import br.com.card_editor.player.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;

/**
 *
 * @author lucas.santos
 */
@ManagedBean(name = "usuarioMB")
public class UsuarioMB {

    private PlayerImplAcesso servico;

    private Player player;

    @PostConstruct
    public void init() {
        try {
            servico = new PlayerImplAcesso();
            player = new Player();
        } catch (Exception ex) {
            Logger.getLogger(UsuarioMB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salvar() {
        try {
            servico.cadastrarPlayer(player);
        } catch (Exception ex) {
            RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Erro ao salvar"));
        }
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Salvo com sucesso"));
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
