
package br.com.card_editor.ejb.card;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CardService", targetNamespace = "http://card.ejb.card_editor.com.br/", wsdlLocation = "http://localhost:7004/CardServiceImpl/CardService?WSDL")
public class CardService
    extends Service
{

    private final static URL CARDSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.com.card_editor.ejb.card.CardService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.com.card_editor.ejb.card.CardService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:7004/CardServiceImpl/CardService?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:7004/CardServiceImpl/CardService?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CARDSERVICE_WSDL_LOCATION = url;
    }

    public CardService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardService() {
        super(CARDSERVICE_WSDL_LOCATION, new QName("http://card.ejb.card_editor.com.br/", "CardService"));
    }

    /**
     * 
     * @return
     *     returns CardServiceImpl
     */
    @WebEndpoint(name = "CardServiceImplPort")
    public CardServiceImpl getCardServiceImplPort() {
        return super.getPort(new QName("http://card.ejb.card_editor.com.br/", "CardServiceImplPort"), CardServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardServiceImpl
     */
    @WebEndpoint(name = "CardServiceImplPort")
    public CardServiceImpl getCardServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://card.ejb.card_editor.com.br/", "CardServiceImplPort"), CardServiceImpl.class, features);
    }

}
