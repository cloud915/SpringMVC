
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>AvailStatusMessageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailStatusMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionStatus" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Restriction"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Master"/&gt;
 *                       &lt;enumeration value="Arrival"/&gt;
 *                       &lt;enumeration value="Departure"/&gt;
 *                       &lt;enumeration value="NonGuarantee"/&gt;
 *                       &lt;enumeration value="TravelAgent"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCancelPenaltyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BookingLimitMessageType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="RemoveLimit"/&gt;
 *             &lt;enumeration value="SetLimit"/&gt;
 *             &lt;enumeration value="AdjustLimit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BookingLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailStatusMessageType", propOrder = {
    "statusApplicationControl",
    "restrictionStatus",
    "lengthsOfStay",
    "tpaExtensions"
})
public class AvailStatusMessageType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "RestrictionStatus")
    protected AvailStatusMessageType.RestrictionStatus restrictionStatus;
    @XmlElement(name = "LengthsOfStay")
    protected LengthsOfStayType lengthsOfStay;
    @XmlElement(name = "TPA_Extensions")
    protected ArrayOfCancelPenaltyType tpaExtensions;
    @XmlAttribute(name = "BookingLimitMessageType")
    protected String bookingLimitMessageType;
    @XmlAttribute(name = "BookingLimit")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bookingLimit;

    /**
     * 获取statusApplicationControl属性的值。
     *
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * 设置statusApplicationControl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * 获取restrictionStatus属性的值。
     *
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.RestrictionStatus }
     *
     */
    public AvailStatusMessageType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * 设置restrictionStatus属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.RestrictionStatus }
     *
     */
    public void setRestrictionStatus(AvailStatusMessageType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * 获取lengthsOfStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthsOfStayType }
     *     
     */
    public LengthsOfStayType getLengthsOfStay() {
        return lengthsOfStay;
    }

    /**
     * 设置lengthsOfStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthsOfStayType }
     *     
     */
    public void setLengthsOfStay(LengthsOfStayType value) {
        this.lengthsOfStay = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelPenaltyType }
     *     
     */
    public ArrayOfCancelPenaltyType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelPenaltyType }
     *     
     */
    public void setTPAExtensions(ArrayOfCancelPenaltyType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取bookingLimitMessageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingLimitMessageType() {
        return bookingLimitMessageType;
    }

    /**
     * 设置bookingLimitMessageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingLimitMessageType(String value) {
        this.bookingLimitMessageType = value;
    }

    /**
     * 获取bookingLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingLimit() {
        return bookingLimit;
    }

    /**
     * 设置bookingLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingLimit(BigInteger value) {
        this.bookingLimit = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Restriction"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Master"/&gt;
     *             &lt;enumeration value="Arrival"/&gt;
     *             &lt;enumeration value="Departure"/&gt;
     *             &lt;enumeration value="NonGuarantee"/&gt;
     *             &lt;enumeration value="TravelAgent"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus {

        @XmlAttribute(name = "Restriction")
        protected String restriction;
        @XmlAttribute(name = "Status")
        protected AvailabilityStatusType status;

        /**
         * 获取restriction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * 设置restriction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

    }

}
