
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ctrip.ssp.contract.ota package.
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

    private final static QName _OTAHotelRatePlanRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelRatePlanRS");
    private final static QName _OTAHotelAvailNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelAvailNotifRS");
    private final static QName _OTAHotelInvCountNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelInvCountNotifRS");
    private final static QName _OTAHotelRateAmountNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelRateAmountNotifRS");
    private final static QName _OTANotifReportRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_NotifReportRS");
    private final static QName _OTAHotelResCheckInNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResCheckInNotifRS");
    private final static QName _OTAHotelResCheckOutNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResCheckOutNotifRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctrip.ssp.contract.ota
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRQ }
     * 
     */
    public OTAHotelAvailNotifRQ createOTAHotelAvailNotifRQ() {
        return new OTAHotelAvailNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelRateAmountNotifRQ }
     * 
     */
    public OTAHotelRateAmountNotifRQ createOTAHotelRateAmountNotifRQ() {
        return new OTAHotelRateAmountNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelResCheckInNotifRQ }
     * 
     */
    public OTAHotelResCheckInNotifRQ createOTAHotelResCheckInNotifRQ() {
        return new OTAHotelResCheckInNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelResCheckOutNotifRQ }
     * 
     */
    public OTAHotelResCheckOutNotifRQ createOTAHotelResCheckOutNotifRQ() {
        return new OTAHotelResCheckOutNotifRQ();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoomType }
     * 
     */
    public ArrayOfGuestRoomType createArrayOfGuestRoomType() {
        return new ArrayOfGuestRoomType();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoomType.GuestRoom }
     * 
     */
    public ArrayOfGuestRoomType.GuestRoom createArrayOfGuestRoomTypeGuestRoom() {
        return new ArrayOfGuestRoomType.GuestRoom();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoomType.GuestRoom.ResGuest }
     * 
     */
    public ArrayOfGuestRoomType.GuestRoom.ResGuest createArrayOfGuestRoomTypeGuestRoomResGuest() {
        return new ArrayOfGuestRoomType.GuestRoom.ResGuest();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoom }
     * 
     */
    public ArrayOfGuestRoom createArrayOfGuestRoom() {
        return new ArrayOfGuestRoom();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoom.GuestRoom }
     * 
     */
    public ArrayOfGuestRoom.GuestRoom createArrayOfGuestRoomGuestRoom() {
        return new ArrayOfGuestRoom.GuestRoom();
    }

    /**
     * Create an instance of {@link ArrayOfHotelID }
     * 
     */
    public ArrayOfHotelID createArrayOfHotelID() {
        return new ArrayOfHotelID();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservationID }
     * 
     */
    public ArrayOfHotelReservationID createArrayOfHotelReservationID() {
        return new ArrayOfHotelReservationID();
    }

    /**
     * Create an instance of {@link ArrayOfRateAmountMessageTypeRate }
     * 
     */
    public ArrayOfRateAmountMessageTypeRate createArrayOfRateAmountMessageTypeRate() {
        return new ArrayOfRateAmountMessageTypeRate();
    }

    /**
     * Create an instance of {@link RateUploadType }
     * 
     */
    public RateUploadType createRateUploadType() {
        return new RateUploadType();
    }

    /**
     * Create an instance of {@link ArrayOfBaseInvCountTypeInvCount }
     * 
     */
    public ArrayOfBaseInvCountTypeInvCount createArrayOfBaseInvCountTypeInvCount() {
        return new ArrayOfBaseInvCountTypeInvCount();
    }

    /**
     * Create an instance of {@link LengthsOfStayType }
     * 
     */
    public LengthsOfStayType createLengthsOfStayType() {
        return new LengthsOfStayType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay }
     * 
     */
    public LengthsOfStayType.LengthOfStay createLengthsOfStayTypeLengthOfStay() {
        return new LengthsOfStayType.LengthOfStay();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType }
     * 
     */
    public AvailStatusMessageType createAvailStatusMessageType() {
        return new AvailStatusMessageType();
    }

    /**
     * Create an instance of {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     * 
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt createArrayOfRateUploadTypeBaseByGuestAmt() {
        return new ArrayOfRateUploadTypeBaseByGuestAmt();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeRate }
     * 
     */
    public ArrayOfHotelRatePlanTypeRate createArrayOfHotelRatePlanTypeRate() {
        return new ArrayOfHotelRatePlanTypeRate();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRef }
     * 
     */
    public ArrayOfHotelRef createArrayOfHotelRef() {
        return new ArrayOfHotelRef();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidate }
     * 
     */
    public ArrayOfRatePlanCandidate createArrayOfRatePlanCandidate() {
        return new ArrayOfRatePlanCandidate();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanRS }
     * 
     */
    public OTAHotelRatePlanRS createOTAHotelRatePlanRS() {
        return new OTAHotelRatePlanRS();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelRatePlanRQRatePlan }
     * 
     */
    public ArrayOfOTAHotelRatePlanRQRatePlan createArrayOfOTAHotelRatePlanRQRatePlan() {
        return new ArrayOfOTAHotelRatePlanRQRatePlan();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan }
     * 
     */
    public ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan createArrayOfOTAHotelRatePlanRQRatePlanRatePlan() {
        return new ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanRQ }
     * 
     */
    public OTAHotelRatePlanRQ createOTAHotelRatePlanRQ() {
        return new OTAHotelRatePlanRQ();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRQ.AvailStatusMessages }
     * 
     */
    public OTAHotelAvailNotifRQ.AvailStatusMessages createOTAHotelAvailNotifRQAvailStatusMessages() {
        return new OTAHotelAvailNotifRQ.AvailStatusMessages();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRS }
     * 
     */
    public OTAHotelAvailNotifRS createOTAHotelAvailNotifRS() {
        return new OTAHotelAvailNotifRS();
    }

    /**
     * Create an instance of {@link OTAHotelInvCountNotifRQ }
     * 
     */
    public OTAHotelInvCountNotifRQ createOTAHotelInvCountNotifRQ() {
        return new OTAHotelInvCountNotifRQ();
    }

    /**
     * Create an instance of {@link InvCountType }
     * 
     */
    public InvCountType createInvCountType() {
        return new InvCountType();
    }

    /**
     * Create an instance of {@link OTAHotelInvCountNotifRS }
     * 
     */
    public OTAHotelInvCountNotifRS createOTAHotelInvCountNotifRS() {
        return new OTAHotelInvCountNotifRS();
    }

    /**
     * Create an instance of {@link OTAHotelRateAmountNotifRQ.RateAmountMessages }
     * 
     */
    public OTAHotelRateAmountNotifRQ.RateAmountMessages createOTAHotelRateAmountNotifRQRateAmountMessages() {
        return new OTAHotelRateAmountNotifRQ.RateAmountMessages();
    }

    /**
     * Create an instance of {@link OTAHotelRateAmountNotifRS }
     * 
     */
    public OTAHotelRateAmountNotifRS createOTAHotelRateAmountNotifRS() {
        return new OTAHotelRateAmountNotifRS();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ }
     * 
     */
    public OTANotifReportRQ createOTANotifReportRQ() {
        return new OTANotifReportRQ();
    }

    /**
     * Create an instance of {@link MessageAcknowledgementType }
     * 
     */
    public MessageAcknowledgementType createMessageAcknowledgementType() {
        return new MessageAcknowledgementType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link OTANotifReportRS }
     * 
     */
    public OTANotifReportRS createOTANotifReportRS() {
        return new OTANotifReportRS();
    }

    /**
     * Create an instance of {@link OTAHotelResCheckInNotifRQ.ResCheckIn }
     * 
     */
    public OTAHotelResCheckInNotifRQ.ResCheckIn createOTAHotelResCheckInNotifRQResCheckIn() {
        return new OTAHotelResCheckInNotifRQ.ResCheckIn();
    }

    /**
     * Create an instance of {@link OTAHotelResCheckInNotifRS }
     * 
     */
    public OTAHotelResCheckInNotifRS createOTAHotelResCheckInNotifRS() {
        return new OTAHotelResCheckInNotifRS();
    }

    /**
     * Create an instance of {@link OTAHotelResCheckOutNotifRQ.ResCheckOut }
     * 
     */
    public OTAHotelResCheckOutNotifRQ.ResCheckOut createOTAHotelResCheckOutNotifRQResCheckOut() {
        return new OTAHotelResCheckOutNotifRQ.ResCheckOut();
    }

    /**
     * Create an instance of {@link OTAHotelResCheckOutNotifRS }
     * 
     */
    public OTAHotelResCheckOutNotifRS createOTAHotelResCheckOutNotifRS() {
        return new OTAHotelResCheckOutNotifRS();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link HotelRatePlanType }
     * 
     */
    public HotelRatePlanType createHotelRatePlanType() {
        return new HotelRatePlanType();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link DailyRateType }
     * 
     */
    public DailyRateType createDailyRateType() {
        return new DailyRateType();
    }

    /**
     * Create an instance of {@link ExtraPersonChargeType }
     * 
     */
    public ExtraPersonChargeType createExtraPersonChargeType() {
        return new ExtraPersonChargeType();
    }

    /**
     * Create an instance of {@link StatusApplicationControlType }
     * 
     */
    public StatusApplicationControlType createStatusApplicationControlType() {
        return new StatusApplicationControlType();
    }

    /**
     * Create an instance of {@link ArrayOfCancelPenaltyType }
     * 
     */
    public ArrayOfCancelPenaltyType createArrayOfCancelPenaltyType() {
        return new ArrayOfCancelPenaltyType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link CancelPenaltyTypeDeadline }
     * 
     */
    public CancelPenaltyTypeDeadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyTypeDeadline();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link BaseInvCountType }
     * 
     */
    public BaseInvCountType createBaseInvCountType() {
        return new BaseInvCountType();
    }

    /**
     * Create an instance of {@link RateAmountMessageType }
     * 
     */
    public RateAmountMessageType createRateAmountMessageType() {
        return new RateAmountMessageType();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee }
     * 
     */
    public ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee createArrayOfGuestRoomTypeGuestRoomResGuestTotalOtherFee() {
        return new ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoom.GuestRoom.ResGuest }
     * 
     */
    public ArrayOfGuestRoom.GuestRoom.ResGuest createArrayOfGuestRoomGuestRoomResGuest() {
        return new ArrayOfGuestRoom.GuestRoom.ResGuest();
    }

    /**
     * Create an instance of {@link ArrayOfHotelID.HotelID }
     * 
     */
    public ArrayOfHotelID.HotelID createArrayOfHotelIDHotelID() {
        return new ArrayOfHotelID.HotelID();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservationID.HotelReservationID }
     * 
     */
    public ArrayOfHotelReservationID.HotelReservationID createArrayOfHotelReservationIDHotelReservationID() {
        return new ArrayOfHotelReservationID.HotelReservationID();
    }

    /**
     * Create an instance of {@link ArrayOfRateAmountMessageTypeRate.Rate }
     * 
     */
    public ArrayOfRateAmountMessageTypeRate.Rate createArrayOfRateAmountMessageTypeRateRate() {
        return new ArrayOfRateAmountMessageTypeRate.Rate();
    }

    /**
     * Create an instance of {@link RateUploadType.MealsIncluded }
     * 
     */
    public RateUploadType.MealsIncluded createRateUploadTypeMealsIncluded() {
        return new RateUploadType.MealsIncluded();
    }

    /**
     * Create an instance of {@link ArrayOfBaseInvCountTypeInvCount.InvCount }
     * 
     */
    public ArrayOfBaseInvCountTypeInvCount.InvCount createArrayOfBaseInvCountTypeInvCountInvCount() {
        return new ArrayOfBaseInvCountTypeInvCount.InvCount();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay.LOSPattern }
     * 
     */
    public LengthsOfStayType.LengthOfStay.LOSPattern createLengthsOfStayTypeLengthOfStayLOSPattern() {
        return new LengthsOfStayType.LengthOfStay.LOSPattern();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.RestrictionStatus }
     * 
     */
    public AvailStatusMessageType.RestrictionStatus createAvailStatusMessageTypeRestrictionStatus() {
        return new AvailStatusMessageType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt }
     * 
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt createArrayOfRateUploadTypeBaseByGuestAmtBaseByGuestAmt() {
        return new ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeRate.Rate }
     * 
     */
    public ArrayOfHotelRatePlanTypeRate.Rate createArrayOfHotelRatePlanTypeRateRate() {
        return new ArrayOfHotelRatePlanTypeRate.Rate();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRef.HotelRef }
     * 
     */
    public ArrayOfHotelRef.HotelRef createArrayOfHotelRefHotelRef() {
        return new ArrayOfHotelRef.HotelRef();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidate.RatePlanCandidate }
     * 
     */
    public ArrayOfRatePlanCandidate.RatePlanCandidate createArrayOfRatePlanCandidateRatePlanCandidate() {
        return new ArrayOfRatePlanCandidate.RatePlanCandidate();
    }

    /**
     * Create an instance of {@link SourceType.RequestorID }
     * 
     */
    public SourceType.RequestorID createSourceTypeRequestorID() {
        return new SourceType.RequestorID();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanRS.RatePlans }
     * 
     */
    public OTAHotelRatePlanRS.RatePlans createOTAHotelRatePlanRSRatePlans() {
        return new OTAHotelRatePlanRS.RatePlans();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange }
     * 
     */
    public ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange createArrayOfOTAHotelRatePlanRQRatePlanRatePlanDateRange() {
        return new ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelRatePlanRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelRatePlanRS")
    public JAXBElement<OTAHotelRatePlanRS> createOTAHotelRatePlanRS(OTAHotelRatePlanRS value) {
        return new JAXBElement<OTAHotelRatePlanRS>(_OTAHotelRatePlanRS_QNAME, OTAHotelRatePlanRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelAvailNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelAvailNotifRS")
    public JAXBElement<OTAHotelAvailNotifRS> createOTAHotelAvailNotifRS(OTAHotelAvailNotifRS value) {
        return new JAXBElement<OTAHotelAvailNotifRS>(_OTAHotelAvailNotifRS_QNAME, OTAHotelAvailNotifRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelInvCountNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelInvCountNotifRS")
    public JAXBElement<OTAHotelInvCountNotifRS> createOTAHotelInvCountNotifRS(OTAHotelInvCountNotifRS value) {
        return new JAXBElement<OTAHotelInvCountNotifRS>(_OTAHotelInvCountNotifRS_QNAME, OTAHotelInvCountNotifRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelRateAmountNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelRateAmountNotifRS")
    public JAXBElement<OTAHotelRateAmountNotifRS> createOTAHotelRateAmountNotifRS(OTAHotelRateAmountNotifRS value) {
        return new JAXBElement<OTAHotelRateAmountNotifRS>(_OTAHotelRateAmountNotifRS_QNAME, OTAHotelRateAmountNotifRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTANotifReportRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_NotifReportRS")
    public JAXBElement<OTANotifReportRS> createOTANotifReportRS(OTANotifReportRS value) {
        return new JAXBElement<OTANotifReportRS>(_OTANotifReportRS_QNAME, OTANotifReportRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelResCheckInNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelResCheckInNotifRS")
    public JAXBElement<OTAHotelResCheckInNotifRS> createOTAHotelResCheckInNotifRS(OTAHotelResCheckInNotifRS value) {
        return new JAXBElement<OTAHotelResCheckInNotifRS>(_OTAHotelResCheckInNotifRS_QNAME, OTAHotelResCheckInNotifRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelResCheckOutNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelResCheckOutNotifRS")
    public JAXBElement<OTAHotelResCheckOutNotifRS> createOTAHotelResCheckOutNotifRS(OTAHotelResCheckOutNotifRS value) {
        return new JAXBElement<OTAHotelResCheckOutNotifRS>(_OTAHotelResCheckOutNotifRS_QNAME, OTAHotelResCheckOutNotifRS.class, null, value);
    }

}
