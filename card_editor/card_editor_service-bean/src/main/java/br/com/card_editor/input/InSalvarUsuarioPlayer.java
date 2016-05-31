/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.input;

import java.io.Serializable;

/**
 *
 * @author lucas.santos
 */
public class InSalvarUsuarioPlayer implements Serializable {

    private PlayerBean playerBean;

    private SystemUserBean systemUserBean;

    public PlayerBean getPlayerBean() {
        return playerBean;
    }

    public void setPlayerBean(PlayerBean playerBean) {
        this.playerBean = playerBean;
    }

    public SystemUserBean getSystemUserBean() {
        return systemUserBean;
    }

    public void setSystemUserBean(SystemUserBean systemUserBean) {
        this.systemUserBean = systemUserBean;
    }

}
