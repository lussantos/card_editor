/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.acesso;

import br.com.card_editor.ejb.system_user.OutVerificaAcessoUsuario;
import br.com.card_editor.ejb.system_user.SystemUser;
import br.com.card_editor.ejb.system_user.SystemUserServiceImpl;
import br.com.card_editor.locate.SystemUserLocate;

/**
 *
 * @author lucas.santos
 */
public class SystemUserServiceAcesso {

    private SystemUserServiceImpl service;

    public SystemUserServiceAcesso() throws Exception {
        this.service = new SystemUserLocate().get();
    }

    public OutVerificaAcessoUsuario verificaAcessoUsuario(SystemUser systemUser) {
        return service.verificaAcessoUsuario(systemUser);
    }
}
