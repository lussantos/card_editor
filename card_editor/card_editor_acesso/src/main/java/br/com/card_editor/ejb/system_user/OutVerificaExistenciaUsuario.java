
package br.com.card_editor.ejb.system_user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVerificaExistenciaUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVerificaExistenciaUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVerificaExistenciaUsuario", propOrder = {
    "existe"
})
public class OutVerificaExistenciaUsuario
    implements Serializable
{

    protected boolean existe;

    /**
     * Gets the value of the existe property.
     * 
     */
    public boolean isExiste() {
        return existe;
    }

    /**
     * Sets the value of the existe property.
     * 
     */
    public void setExiste(boolean value) {
        this.existe = value;
    }

}
