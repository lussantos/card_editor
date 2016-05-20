
package br.com.card_editor.ejb.system_user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for excluirUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="excluirUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemUser" type="{http://system_user.ejb.card_editor.com.br/}systemUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "excluirUsuario", propOrder = {
    "systemUser"
})
public class ExcluirUsuario
    implements Serializable
{

    protected SystemUser systemUser;

    /**
     * Gets the value of the systemUser property.
     * 
     * @return
     *     possible object is
     *     {@link SystemUser }
     *     
     */
    public SystemUser getSystemUser() {
        return systemUser;
    }

    /**
     * Sets the value of the systemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemUser }
     *     
     */
    public void setSystemUser(SystemUser value) {
        this.systemUser = value;
    }

}
