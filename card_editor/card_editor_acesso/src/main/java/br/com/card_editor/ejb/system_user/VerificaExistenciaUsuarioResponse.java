
package br.com.card_editor.ejb.system_user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificaExistenciaUsuarioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificaExistenciaUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutVerificaExistenciaUsuario" type="{http://system_user.ejb.card_editor.com.br/}outVerificaExistenciaUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaExistenciaUsuarioResponse", propOrder = {
    "outVerificaExistenciaUsuario"
})
public class VerificaExistenciaUsuarioResponse
    implements Serializable
{

    @XmlElement(name = "OutVerificaExistenciaUsuario")
    protected OutVerificaExistenciaUsuario outVerificaExistenciaUsuario;

    /**
     * Gets the value of the outVerificaExistenciaUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link OutVerificaExistenciaUsuario }
     *     
     */
    public OutVerificaExistenciaUsuario getOutVerificaExistenciaUsuario() {
        return outVerificaExistenciaUsuario;
    }

    /**
     * Sets the value of the outVerificaExistenciaUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVerificaExistenciaUsuario }
     *     
     */
    public void setOutVerificaExistenciaUsuario(OutVerificaExistenciaUsuario value) {
        this.outVerificaExistenciaUsuario = value;
    }

}
