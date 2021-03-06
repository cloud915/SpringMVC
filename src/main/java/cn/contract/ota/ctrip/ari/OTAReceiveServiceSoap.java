package cn.contract.ota.ctrip.ari;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-06T11:05:48.863+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "OTAReceiveServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OTAReceiveServiceSoap {

    @WebResult(name = "OTA_HotelInvCountNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelInvCountNotifResult")
    @WebMethod(operationName = "HotelInvCountNotif", action = "http://www.opentravel.org/OTA/2003/05/HotelInvCountNotif")
    public OTAHotelInvCountNotifRS hotelInvCountNotif(
            @WebParam(partName = "request", name = "OTA_HotelInvCountNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelInvCountNotifRQ request
    );

    @WebResult(name = "OTA_HotelAvailNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelAvailNotifResult")
    @WebMethod(operationName = "HotelAvailNotif", action = "http://www.opentravel.org/OTA/2003/05/HotelAvailNotif")
    public OTAHotelAvailNotifRS hotelAvailNotif(
            @WebParam(partName = "request", name = "OTA_HotelAvailNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelAvailNotifRQ request
    );

    @WebResult(name = "OTA_HotelResCheckOutNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelCheckOutNotifResult")
    @WebMethod(operationName = "HotelCheckOutNotif", action = "http://www.opentravel.org/OTA/2003/05/HotelCheckOutNotif")
    public OTAHotelResCheckOutNotifRS hotelCheckOutNotif(
            @WebParam(partName = "request", name = "OTA_HotelResCheckOutNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelResCheckOutNotifRQ request
    );

    @WebResult(name = "OTA_HotelRateAmountNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelRateAmountNotifResult")
    @WebMethod(operationName = "HotelRateAmountNotif", action = "http://www.opentravel.org/OTA/2003/05/HotelRateAmountNotif")
    public OTAHotelRateAmountNotifRS hotelRateAmountNotif(
            @WebParam(partName = "request", name = "OTA_HotelRateAmountNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelRateAmountNotifRQ request
    );

    @WebResult(name = "OTA_HotelResCheckInNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelCheckInNotifResult")
    @WebMethod(operationName = "HotelCheckInNotif", action = "http://www.opentravel.org/OTA/2003/05/HotelCheckInNotif")
    public OTAHotelResCheckInNotifRS hotelCheckInNotif(
            @WebParam(partName = "request", name = "OTA_HotelResCheckInNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelResCheckInNotifRQ request
    );

    @WebResult(name = "OTA_NotifReportRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "NotifReportResult")
    @WebMethod(operationName = "NotifReport", action = "http://www.opentravel.org/OTA/2003/05/NotifReport")
    public OTANotifReportRS notifReport(
            @WebParam(partName = "request", name = "OTA_NotifReportRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTANotifReportRQ request
    );

    @WebResult(name = "OTA_HotelRatePlanRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "HotelRatePlanResult")
    @WebMethod(operationName = "HotelRatePlan", action = "http://www.opentravel.org/OTA/2003/05/HotelRatePlan")
    public OTAHotelRatePlanRS hotelRatePlan(
            @WebParam(partName = "request", name = "OTA_HotelRatePlanRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelRatePlanRQ request
    );
}
