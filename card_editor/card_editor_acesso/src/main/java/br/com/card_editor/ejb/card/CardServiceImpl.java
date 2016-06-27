
package br.com.card_editor.ejb.card;

import java.util.List;
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
@WebService(name = "CardServiceImpl", targetNamespace = "http://card.ejb.card_editor.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CardServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<br.com.card_editor.ejb.card.CardBean>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchImage", targetNamespace = "http://card.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.card.SearchImage")
    @ResponseWrapper(localName = "searchImageResponse", targetNamespace = "http://card.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.card.SearchImageResponse")
    public List<CardBean> searchImage(
        @WebParam(name = "arg0", targetNamespace = "")
        InSearchImage arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "insertCard", targetNamespace = "http://card.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.card.InsertCard")
    @ResponseWrapper(localName = "insertCardResponse", targetNamespace = "http://card.ejb.card_editor.com.br/", className = "br.com.card_editor.ejb.card.InsertCardResponse")
    public void insertCard(
        @WebParam(name = "arg0", targetNamespace = "")
        InSalvarCard arg0)
        throws Exception_Exception
    ;

}