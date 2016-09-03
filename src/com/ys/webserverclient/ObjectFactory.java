
package com.ys.webserverclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ys.webserverclient package. 
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

    private final static QName _QueryTheWeatherResponse_QNAME = new QName("http://diywebserver.ys.com/", "queryTheWeatherResponse");
    private final static QName _QueryTheWeather_QNAME = new QName("http://diywebserver.ys.com/", "queryTheWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ys.webserverclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryTheWeather }
     * 
     */
    public QueryTheWeather createQueryTheWeather() {
        return new QueryTheWeather();
    }

    /**
     * Create an instance of {@link QueryTheWeatherResponse }
     * 
     */
    public QueryTheWeatherResponse createQueryTheWeatherResponse() {
        return new QueryTheWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTheWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diywebserver.ys.com/", name = "queryTheWeatherResponse")
    public JAXBElement<QueryTheWeatherResponse> createQueryTheWeatherResponse(QueryTheWeatherResponse value) {
        return new JAXBElement<QueryTheWeatherResponse>(_QueryTheWeatherResponse_QNAME, QueryTheWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTheWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diywebserver.ys.com/", name = "queryTheWeather")
    public JAXBElement<QueryTheWeather> createQueryTheWeather(QueryTheWeather value) {
        return new JAXBElement<QueryTheWeather>(_QueryTheWeather_QNAME, QueryTheWeather.class, null, value);
    }

}
