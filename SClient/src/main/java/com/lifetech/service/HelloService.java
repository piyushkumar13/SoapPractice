package com.lifetech.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2015-02-08T01:46:19.555+05:30
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "helloService", 
                  wsdlLocation = "http://localhost:8085/SoapService/hello?wsdl",
                  targetNamespace = "http://service.lifetech.com/") 
public class HelloService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.lifetech.com/", "helloService");
    public final static QName HelloPort = new QName("http://service.lifetech.com/", "helloPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8085/SoapService/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8085/SoapService/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloWorldService
     */
    @WebEndpoint(name = "helloPort")
    public HelloWorldService getHelloPort() {
        return super.getPort(HelloPort, HelloWorldService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldService
     */
    @WebEndpoint(name = "helloPort")
    public HelloWorldService getHelloPort(WebServiceFeature... features) {
        return super.getPort(HelloPort, HelloWorldService.class, features);
    }

}
