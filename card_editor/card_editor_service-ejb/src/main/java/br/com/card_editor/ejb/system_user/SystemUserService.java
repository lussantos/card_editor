/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_user;

import br.com.card_editor.entity.SystemUser;
import br.com.card_editor.output.OutVerificaAcessoUsuario;
import br.com.card_editor.output.OutVerificaExistenciaUsuario;

/**
 *
 * @author lucas.santos
 */
public interface SystemUserService {

    void cadastrarUsuario(SystemUser user);

    void excluirUsuario(SystemUser user);

    void alterarUsuario(SystemUser user);

    OutVerificaExistenciaUsuario verificaExistenciaUsuario(SystemUser user);

    OutVerificaAcessoUsuario verificaAcessoUsuario(SystemUser user);

}
