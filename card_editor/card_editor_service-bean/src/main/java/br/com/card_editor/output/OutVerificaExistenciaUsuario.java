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
public class OutVerificaExistenciaUsuario implements Serializable {

    private boolean existe;

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }
}
