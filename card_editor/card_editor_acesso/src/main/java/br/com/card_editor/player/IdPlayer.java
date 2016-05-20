
package br.com.card_editor.player;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idPlayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idPlayer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nick_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tp_conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idPlayer", propOrder = {
    "nickName",
    "tpConta"
})
public class IdPlayer
    implements Serializable
{

    @XmlElement(name = "nick_name")
    protected String nickName;
    @XmlElement(name = "tp_conta")
    protected String tpConta;

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the tpConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpConta() {
        return tpConta;
    }

    /**
     * Sets the value of the tpConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpConta(String value) {
        this.tpConta = value;
    }

}
