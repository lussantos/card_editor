/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.output;

import java.io.Serializable;

/**
 *
 * @author lucas.santos
 */
public class OutVerificaAcessoUsuario implements Serializable{

    private boolean possuiAcesso;

    public boolean isPossuiAcesso() {
        return possuiAcesso;
    }

    public void setPossuiAcesso(boolean possuiAcesso) {
        this.possuiAcesso = possuiAcesso;
    }

}
