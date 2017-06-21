package cn.contract.ota.ctrip.ari;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-04-29T15:16:56.598+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "HotelAvailNotif", 
                  wsdlLocation = "https://vendor.ctrip.com/Hotel/OTAReceive/HotelAvailNotif.asmx?Wsdl",
                  targetNamespace = "http://www.opentravel.org/OTA/2003/05") 
public class HotelAvailNotif extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.opentravel.org/OTA/2003/05", "HotelAvailNotif");
    public final static QName HotelAvailNotifSoap12 = new QName("http://www.opentravel.org/OTA/2003/05", "HotelAvailNotifSoap12");
    public final static QName HotelAvailNotifSoap = new QName("http://www.opentravel.org/OTA/2003/05", "HotelAvailNotifSoap");
    static {
        URL url = null;
        try {
            url = new URL("https://vendor.ctrip.com/Hotel/OTAReceive/HotelAvailNotif.asmx?Wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelAvailNotif.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://vendor.ctrip.com/Hotel/OTAReceive/HotelAvailNotif.asmx?Wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelAvailNotif(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelAvailNotif(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelAvailNotif() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HotelAvailNotif(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HotelAvailNotif(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HotelAvailNotif(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HotelAvailNotifSoap
     */
    @WebEndpoint(name = "HotelAvailNotifSoap12")
    public HotelAvailNotifSoap getHotelAvailNotifSoap12() {
        return super.getPort(HotelAvailNotifSoap12, HotelAvailNotifSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelAvailNotifSoap
     */
    @WebEndpoint(name = "HotelAvailNotifSoap12")
    public HotelAvailNotifSoap getHotelAvailNotifSoap12(WebServiceFeature... features) {
        return super.getPort(HotelAvailNotifSoap12, HotelAvailNotifSoap.class, features);
    }


    /**
     *
     * @return
     *     returns HotelAvailNotifSoap
     */
    @WebEndpoint(name = "HotelAvailNotifSoap")
    public HotelAvailNotifSoap getHotelAvailNotifSoap() {
        return super.getPort(HotelAvailNotifSoap, HotelAvailNotifSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelAvailNotifSoap
     */
    @WebEndpoint(name = "HotelAvailNotifSoap")
    public HotelAvailNotifSoap getHotelAvailNotifSoap(WebServiceFeature... features) {
        return super.getPort(HotelAvailNotifSoap, HotelAvailNotifSoap.class, features);
    }

}
