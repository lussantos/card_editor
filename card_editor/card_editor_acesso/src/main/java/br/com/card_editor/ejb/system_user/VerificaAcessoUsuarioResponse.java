
package br.com.card_editor.ejb.system_user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificaAcessoUsuarioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificaAcessoUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutVerificaAcessoUsuario" type="{http://system_user.ejb.card_editor.com.br/}outVerificaAcessoUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaAcessoUsuarioResponse", propOrder = {
    "outVerificaAcessoUsuario"
})
public class VerificaAcessoUsuarioResponse
    implements Serializable
{

    @XmlElement(name = "OutVerificaAcessoUsuario")
    protected OutVerificaAcessoUsuario outVerificaAcessoUsuario;

    /**
     * Gets the value of the outVerificaAcessoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link OutVerificaAcessoUsuario }
     *     
     */
    public OutVerificaAcessoUsuario getOutVerificaAcessoUsuario() {
        return outVerificaAcessoUsuario;
    }

    /**
     * Sets the value of the outVerificaAcessoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVerificaAcessoUsuario }
     *     
     */
    public void setOutVerificaAcessoUsuario(OutVerificaAcessoUsuario value) {
        this.outVerificaAcessoUsuario = value;
    }

}
