
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

    private final static QName _Exception_QNAME = new QName("http://card.ejb.card_editor.com.br/", "Exception");
    private final static QName _InsertCardResponse_QNAME = new QName("http://card.ejb.card_editor.com.br/", "insertCardResponse");
    private final static QName _InsertCard_QNAME = new QName("http://card.ejb.card_editor.com.br/", "insertCard");
    private final static QName _SearchImageResponse_QNAME = new QName("http://card.ejb.card_editor.com.br/", "searchImageResponse");
    private final static QName _SearchImage_QNAME = new QName("http://card.ejb.card_editor.com.br/", "searchImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.card_editor.ejb.card
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InSalvarCard }
     * 
     */
    public InSalvarCard createInSalvarCard() {
        return new InSalvarCard();
    }

    /**
     * Create an instance of {@link SearchImage }
     * 
     */
    public SearchImage createSearchImage() {
        return new SearchImage();
    }

    /**
     * Create an instance of {@link InsertCardResponse }
     * 
     */
    public InsertCardResponse createInsertCardResponse() {
        return new InsertCardResponse();
    }

    /**
     * Create an instance of {@link InSearchImage }
     * 
     */
    public InSearchImage createInSearchImage() {
        return new InSearchImage();
    }

    /**
     * Create an instance of {@link CardBean }
     * 
     */
    public CardBean createCardBean() {
        return new CardBean();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link InsertCard }
     * 
     */
    public InsertCard createInsertCard() {
        return new InsertCard();
    }

    /**
     * Create an instance of {@link SearchImageResponse }
     * 
     */
    public SearchImageResponse createSearchImageResponse() {
        return new SearchImageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "insertCardResponse")
    public JAXBElement<InsertCardResponse> createInsertCardResponse(InsertCardResponse value) {
        return new JAXBElement<InsertCardResponse>(_InsertCardResponse_QNAME, InsertCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "insertCard")
    public JAXBElement<InsertCard> createInsertCard(InsertCard value) {
        return new JAXBElement<InsertCard>(_InsertCard_QNAME, InsertCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "searchImageResponse")
    public JAXBElement<SearchImageResponse> createSearchImageResponse(SearchImageResponse value) {
        return new JAXBElement<SearchImageResponse>(_SearchImageResponse_QNAME, SearchImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.ejb.card_editor.com.br/", name = "searchImage")
    public JAXBElement<SearchImage> createSearchImage(SearchImage value) {
        return new JAXBElement<SearchImage>(_SearchImage_QNAME, SearchImage.class, null, value);
    }

}
