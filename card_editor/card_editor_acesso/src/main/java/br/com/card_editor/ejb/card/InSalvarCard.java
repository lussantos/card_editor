
package br.com.card_editor.ejb.card;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inSalvarCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inSalvarCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardBean" type="{http://card.ejb.card_editor.com.br/}cardBean" minOccurs="0"/>
 *         &lt;element name="nickNameUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inSalvarCard", propOrder = {
    "cardBean",
    "nickNameUser"
})
public class InSalvarCard
    implements Serializable
{

    protected CardBean cardBean;
    protected String nickNameUser;

    /**
     * Gets the value of the cardBean property.
     * 
     * @return
     *     possible object is
     *     {@link CardBean }
     *     
     */
    public CardBean getCardBean() {
        return cardBean;
    }

    /**
     * Sets the value of the cardBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBean }
     *     
     */
    public void setCardBean(CardBean value) {
        this.cardBean = value;
    }

    /**
     * Gets the value of the nickNameUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickNameUser() {
        return nickNameUser;
    }

    /**
     * Sets the value of the nickNameUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickNameUser(String value) {
        this.nickNameUser = value;
    }

}
