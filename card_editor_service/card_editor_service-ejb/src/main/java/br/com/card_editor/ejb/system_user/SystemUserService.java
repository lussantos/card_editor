/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_user;

import br.com.card_editor.entity.SystemUser;

/**
 *
 * @author lucas.santos
 */
public interface SystemUserService {

    void salvarUsuario(SystemUser user);
}
