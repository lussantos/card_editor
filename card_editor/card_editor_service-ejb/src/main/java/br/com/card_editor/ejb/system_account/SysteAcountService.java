/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_account;

import br.com.card_editor.input.InSalvarUsuarioPlayer;

/**
 *
 * @author lucas.santos
 */
public interface SysteAcountService {

    void criarContaUsuario(InSalvarUsuarioPlayer user);

}
