/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.locate;

import br.com.card_editor.ejb.system_user.SystemUserService;
import br.com.card_editor.ejb.system_user.SystemUserServiceImpl;

/**
 *
 * @author lucas.santos
 */
public class SystemUserLocate {

    private SystemUserServiceImpl service;

    public SystemUserServiceImpl get() throws Exception {
        if (service == null) {
            service = new SystemUserService().getSystemUserServiceImplPort();
        }
        return service;
    }
}
