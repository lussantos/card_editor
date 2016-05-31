/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_user;

import br.com.card_editor.entity.SystemUser;
import br.com.card_editor.output.OutVerificaAcessoUsuario;
import br.com.card_editor.output.OutVerificaExistenciaUsuario;
import card_editor.card.editor.ejb.dao.SystemUserDao;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
import java.lang.instrument.IllegalClassFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author lucas.santos
 */
@WebService(serviceName = "SystemUserService")
@Stateless()
public class SystemUserServiceImpl extends ServiceBase implements SystemUserService {

    @Override
    @WebResult(name = "Resultado")
    public void cadastrarUsuario(
            @WebParam(name = "SystemUser") SystemUser user) {
        MongoClient client = new MongoClient(uri);
        try {
            SystemUserDao.cadastrarUsuario(user, getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    @WebResult(name = "Resultado")
    public void alterarUsuario(
            @WebParam(name = "SystemUser") SystemUser user) {
        MongoClient client = new MongoClient(uri);
        try {
            SystemUserDao.alterarUsuario(user, getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    @WebResult(name = "Resultado")
    public void excluirUsuario(
            @WebParam(name = "SystemUser") SystemUser user) {
        MongoClient client = new MongoClient(uri);
        try {
            SystemUserDao.excluirUsuario(user, getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    @WebResult(name = "OutVerificaExistenciaUsuario")
    public OutVerificaExistenciaUsuario verificaExistenciaUsuario(
            @WebParam(name = "SystemUser") SystemUser user) {
        MongoClient client = new MongoClient(uri);
        OutVerificaExistenciaUsuario retorno = new OutVerificaExistenciaUsuario();
        try {
            retorno.setExiste(SystemUserDao.verificaExistenciaUsuario(user, getConnetcion(client)));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
        return retorno;
    }

    @Override
    @WebResult(name = "OutVerificaAcessoUsuario")
    public OutVerificaAcessoUsuario verificaAcessoUsuario(
            @WebParam(name = "SystemUser") SystemUser user) {
        MongoClient client = new MongoClient(uri);
        OutVerificaAcessoUsuario retorno = new OutVerificaAcessoUsuario();
        try {
            retorno.setPossuiAcesso(SystemUserDao.verificaAcessoUsuario(user, getConnetcion(client)));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
        return retorno;
    }

}
