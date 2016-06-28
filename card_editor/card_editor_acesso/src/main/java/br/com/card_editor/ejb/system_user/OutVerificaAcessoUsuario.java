
package br.com.card_editor.ejb.system_user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVerificaAcessoUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVerificaAcessoUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="possuiAcesso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVerificaAcessoUsuario", propOrder = {
    "possuiAcesso"
})
public class OutVerificaAcessoUsuario
    implements Serializable
{

    protected boolean possuiAcesso;

    /**
     * Gets the value of the possuiAcesso property.
     * 
     */
    public boolean isPossuiAcesso() {
        return possuiAcesso;
    }

    /**
     * Sets the value of the possuiAcesso property.
     * 
     */
    public void setPossuiAcesso(boolean value) {
        this.possuiAcesso = value;
    }

}
