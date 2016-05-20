
package br.com.card_editor.ejb.system_user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.card_editor.ejb.system_user package. 
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

    private final static QName _AlterarUsuarioResponse_QNAME = new QName("http://system_user.ejb.card_editor.com.br/", "alterarUsuarioResponse");
    private final static QName _ExcluirUsuario_QNAME = new QName("http://system_user.ejb.card_editor.com.br/", "excluirUsuario");
    private final static QName _CadastrarUsuarioResponse_QNAME = new QName("http://system_user.ejb.card_editor.com.br/", "cadastrarUsuarioResponse");
    private final static QName _ExcluirUsuarioResponse_QNAME = new QName("http://system_user.ejb.card_editor.com.br/", "excluirUsuarioResponse");
    private final static QName _CadastrarUsuario_QNAME = new QName("http://system_user.ejb.card_editor.com.br/", "cadastrarUsuario");
    private final static QName _AlterarUsuario_QNAME = new QName("http://system_user.ejb.card_editor.com.br/", "alterarUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.card_editor.ejb.system_user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExcluirUsuario }
     * 
     */
    public ExcluirUsuario createExcluirUsuario() {
        return new ExcluirUsuario();
    }

    /**
     * Create an instance of {@link SystemUser }
     * 
     */
    public SystemUser createSystemUser() {
        return new SystemUser();
    }

    /**
     * Create an instance of {@link AlterarUsuario }
     * 
     */
    public AlterarUsuario createAlterarUsuario() {
        return new AlterarUsuario();
    }

    /**
     * Create an instance of {@link CadastrarUsuario }
     * 
     */
    public CadastrarUsuario createCadastrarUsuario() {
        return new CadastrarUsuario();
    }

    /**
     * Create an instance of {@link CadastrarUsuarioResponse }
     * 
     */
    public CadastrarUsuarioResponse createCadastrarUsuarioResponse() {
        return new CadastrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link AlterarUsuarioResponse }
     * 
     */
    public AlterarUsuarioResponse createAlterarUsuarioResponse() {
        return new AlterarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ExcluirUsuarioResponse }
     * 
     */
    public ExcluirUsuarioResponse createExcluirUsuarioResponse() {
        return new ExcluirUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://system_user.ejb.card_editor.com.br/", name = "alterarUsuarioResponse")
    public JAXBElement<AlterarUsuarioResponse> createAlterarUsuarioResponse(AlterarUsuarioResponse value) {
        return new JAXBElement<AlterarUsuarioResponse>(_AlterarUsuarioResponse_QNAME, AlterarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://system_user.ejb.card_editor.com.br/", name = "excluirUsuario")
    public JAXBElement<ExcluirUsuario> createExcluirUsuario(ExcluirUsuario value) {
        return new JAXBElement<ExcluirUsuario>(_ExcluirUsuario_QNAME, ExcluirUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://system_user.ejb.card_editor.com.br/", name = "cadastrarUsuarioResponse")
    public JAXBElement<CadastrarUsuarioResponse> createCadastrarUsuarioResponse(CadastrarUsuarioResponse value) {
        return new JAXBElement<CadastrarUsuarioResponse>(_CadastrarUsuarioResponse_QNAME, CadastrarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://system_user.ejb.card_editor.com.br/", name = "excluirUsuarioResponse")
    public JAXBElement<ExcluirUsuarioResponse> createExcluirUsuarioResponse(ExcluirUsuarioResponse value) {
        return new JAXBElement<ExcluirUsuarioResponse>(_ExcluirUsuarioResponse_QNAME, ExcluirUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://system_user.ejb.card_editor.com.br/", name = "cadastrarUsuario")
    public JAXBElement<CadastrarUsuario> createCadastrarUsuario(CadastrarUsuario value) {
        return new JAXBElement<CadastrarUsuario>(_CadastrarUsuario_QNAME, CadastrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://system_user.ejb.card_editor.com.br/", name = "alterarUsuario")
    public JAXBElement<AlterarUsuario> createAlterarUsuario(AlterarUsuario value) {
        return new JAXBElement<AlterarUsuario>(_AlterarUsuario_QNAME, AlterarUsuario.class, null, value);
    }

}
