
package br.com.card_editor.ejb.system_user;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SystemUserServiceImpl", targetNamespace = "http://system_user.ejb.card_editor.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SystemUserServiceImpl {


    /**
     * 
     * @param systemUser
     */
    @WebMethod
    @RequestWrapper(localName = "alterarUsuario", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.AlterarUsuario")
    @ResponseWrapper(localName = "alterarUsuarioResponse", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.AlterarUsuarioResponse")
    public void alterarUsuario(
        @WebParam(name = "SystemUser", targetNamespace = "")
        SystemUser systemUser);

    /**
     * 
     * @param systemUser
     */
    @WebMethod
    @RequestWrapper(localName = "excluirUsuario", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.ExcluirUsuario")
    @ResponseWrapper(localName = "excluirUsuarioResponse", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.ExcluirUsuarioResponse")
    public void excluirUsuario(
        @WebParam(name = "SystemUser", targetNamespace = "")
        SystemUser systemUser);

    /**
     * 
     * @param systemUser
     */
    @WebMethod
    @RequestWrapper(localName = "cadastrarUsuario", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.CadastrarUsuario")
    @ResponseWrapper(localName = "cadastrarUsuarioResponse", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.CadastrarUsuarioResponse")
    public void cadastrarUsuario(
        @WebParam(name = "SystemUser", targetNamespace = "")
        SystemUser systemUser);

    /**
     * 
     * @param systemUser
     * @return
     *     returns br.com.card_editor.ejb.system_user.OutVerificaAcessoUsuario
     */
    @WebMethod
    @WebResult(name = "OutVerificaAcessoUsuario", targetNamespace = "")
    @RequestWrapper(localName = "verificaAcessoUsuario", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.VerificaAcessoUsuario")
    @ResponseWrapper(localName = "verificaAcessoUsuarioResponse", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.VerificaAcessoUsuarioResponse")
    public OutVerificaAcessoUsuario verificaAcessoUsuario(
        @WebParam(name = "SystemUser", targetNamespace = "")
        SystemUser systemUser);

    /**
     * 
     * @param systemUser
     * @return
     *     returns br.com.card_editor.ejb.system_user.OutVerificaExistenciaUsuario
     */
    @WebMethod
    @WebResult(name = "OutVerificaExistenciaUsuario", targetNamespace = "")
    @RequestWrapper(localName = "verificaExistenciaUsuario", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.VerificaExistenciaUsuario")
    @ResponseWrapper(localName = "verificaExistenciaUsuarioResponse", targetNamespace = "http://system_user.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.system_user.VerificaExistenciaUsuarioResponse")
    public OutVerificaExistenciaUsuario verificaExistenciaUsuario(
        @WebParam(name = "SystemUser", targetNamespace = "")
        SystemUser systemUser);

}
