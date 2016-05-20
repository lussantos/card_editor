/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.acesso;

import br.com.card_editor.ejb.system_user.SystemUser;
import br.com.card_editor.ejb.system_user.SystemUserServiceImpl;
import br.com.card_editor.locate.SystemUserServiceLocate;
import br.com.card_editor.util.ConstantesAcesso;
import sun.rmi.runtime.Log;

/**
 *
 * @author lucas.santos
 */
public class SystemUserImplAcesso {

    private final SystemUserServiceImpl service;
    private static Log log;

    public SystemUserImplAcesso() throws Exception {
        this.service = new SystemUserServiceLocate().get();
        log = Log.getLog(SystemUserImplAcesso.class.getName(), ConstantesAcesso.APP_NAME, true);
    }

    public void cadastrarUsuario(SystemUser user) {
        this.service.cadastrarUsuario(user);
    }

    public void alterarUsuario(SystemUser user) {
        this.service.alterarUsuario(user);
    }

    public void excluirUsuario(SystemUser user) {
        this.service.excluirUsuario(user);
    }

}
