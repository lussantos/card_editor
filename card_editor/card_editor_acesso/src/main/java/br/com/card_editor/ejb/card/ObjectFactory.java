
package br.com.card_editor.ejb.card;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.card_editor.ejb.card package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadCard_QNAME = new QName("http://card.ejb.card_editor.com.br/", "uploadCard");
    private final static QName _UploadCardResponse_QNAME = new QName("http://card.ejb.card_editor.com.br/", "uploadCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.card_editor.ejb.card
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardBean }
     * 
     */
    public CardBean createCardBean() {
        return new CardBean();
    }

    /**
     * Create an instance of {@link UploadCard }
     * 
     */
    public UploadCard createUploadCard() {
        return new UploadCard();
    }

    /**
     * Create an instance of {@link UploadCardResponse }
     * 
     */
    public UploadCardResponse createUploadCardResponse() {
        return new UploadCardResponse();
    }

    /**
     * Create an instance of {@link InSalvarCard }
     * 
     */
    public InSalvarCard createInSalvarCard() {
        return new InSalvarCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "uploadCard")
    public JAXBElement<UploadCard> createUploadCard(UploadCard value) {
        return new JAXBElement<UploadCard>(_UploadCard_QNAME, UploadCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "uploadCardResponse")
    public JAXBElement<UploadCardResponse> createUploadCardResponse(UploadCardResponse value) {
        return new JAXBElement<UploadCardResponse>(_UploadCardResponse_QNAME, UploadCardResponse.class, null, value);
    }

}
