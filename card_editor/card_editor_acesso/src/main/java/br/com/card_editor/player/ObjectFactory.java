
package br.com.card_editor.player;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.card_editor.player package. 
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

    private final static QName _ExcluirPlayer_QNAME = new QName("http://player.card_editor.com.br/", "excluirPlayer");
    private final static QName _AlterarPlayer_QNAME = new QName("http://player.card_editor.com.br/", "alterarPlayer");
    private final static QName _CadastrarPlayerResponse_QNAME = new QName("http://player.card_editor.com.br/", "cadastrarPlayerResponse");
    private final static QName _AlterarPlayerResponse_QNAME = new QName("http://player.card_editor.com.br/", "alterarPlayerResponse");
    private final static QName _ExcluirPlayerResponse_QNAME = new QName("http://player.card_editor.com.br/", "excluirPlayerResponse");
    private final static QName _CadastrarPlayer_QNAME = new QName("http://player.card_editor.com.br/", "cadastrarPlayer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.card_editor.player
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlterarPlayer }
     * 
     */
    public AlterarPlayer createAlterarPlayer() {
        return new AlterarPlayer();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link IdPlayer }
     * 
     */
    public IdPlayer createIdPlayer() {
        return new IdPlayer();
    }

    /**
     * Create an instance of {@link ExcluirPlayerResponse }
     * 
     */
    public ExcluirPlayerResponse createExcluirPlayerResponse() {
        return new ExcluirPlayerResponse();
    }

    /**
     * Create an instance of {@link CadastrarPlayerResponse }
     * 
     */
    public CadastrarPlayerResponse createCadastrarPlayerResponse() {
        return new CadastrarPlayerResponse();
    }

    /**
     * Create an instance of {@link CadastrarPlayer }
     * 
     */
    public CadastrarPlayer createCadastrarPlayer() {
        return new CadastrarPlayer();
    }

    /**
     * Create an instance of {@link ExcluirPlayer }
     * 
     */
    public ExcluirPlayer createExcluirPlayer() {
        return new ExcluirPlayer();
    }

    /**
     * Create an instance of {@link AlterarPlayerResponse }
     * 
     */
    public AlterarPlayerResponse createAlterarPlayerResponse() {
        return new AlterarPlayerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://player.card_editor.com.br/", name = "excluirPlayer")
    public JAXBElement<ExcluirPlayer> createExcluirPlayer(ExcluirPlayer value) {
        return new JAXBElement<ExcluirPlayer>(_ExcluirPlayer_QNAME, ExcluirPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://player.card_editor.com.br/", name = "alterarPlayer")
    public JAXBElement<AlterarPlayer> createAlterarPlayer(AlterarPlayer value) {
        return new JAXBElement<AlterarPlayer>(_AlterarPlayer_QNAME, AlterarPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://player.card_editor.com.br/", name = "cadastrarPlayerResponse")
    public JAXBElement<CadastrarPlayerResponse> createCadastrarPlayerResponse(CadastrarPlayerResponse value) {
        return new JAXBElement<CadastrarPlayerResponse>(_CadastrarPlayerResponse_QNAME, CadastrarPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://player.card_editor.com.br/", name = "alterarPlayerResponse")
    public JAXBElement<AlterarPlayerResponse> createAlterarPlayerResponse(AlterarPlayerResponse value) {
        return new JAXBElement<AlterarPlayerResponse>(_AlterarPlayerResponse_QNAME, AlterarPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://player.card_editor.com.br/", name = "excluirPlayerResponse")
    public JAXBElement<ExcluirPlayerResponse> createExcluirPlayerResponse(ExcluirPlayerResponse value) {
        return new JAXBElement<ExcluirPlayerResponse>(_ExcluirPlayerResponse_QNAME, ExcluirPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://player.card_editor.com.br/", name = "cadastrarPlayer")
    public JAXBElement<CadastrarPlayer> createCadastrarPlayer(CadastrarPlayer value) {
        return new JAXBElement<CadastrarPlayer>(_CadastrarPlayer_QNAME, CadastrarPlayer.class, null, value);
    }

}
