
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResCheckIn" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelReservationID" minOccurs="0"/&gt;
 *                   &lt;element name="HotelIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelID" minOccurs="0"/&gt;
 *                   &lt;element name="GuestRooms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuestRoom" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "resCheckIn"
})
@XmlRootElement(name = "OTA_HotelResCheckInNotifRQ")
public class OTAHotelResCheckInNotifRQ {

    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "ResCheckIn")
    protected OTAHotelResCheckInNotifRQ.ResCheckIn resCheckIn;

    /**
     * 获取pos属性的值。
     *
     * @return
     *     possible object is
     *     {@link POSType }
     *
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link POSType }
     *
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * 获取resCheckIn属性的值。
     *
     * @return
     *     possible object is
     *     {@link OTAHotelResCheckInNotifRQ.ResCheckIn }
     *
     */
    public OTAHotelResCheckInNotifRQ.ResCheckIn getResCheckIn() {
        return resCheckIn;
    }

    /**
     * 设置resCheckIn属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link OTAHotelResCheckInNotifRQ.ResCheckIn }
     *
     */
    public void setResCheckIn(OTAHotelResCheckInNotifRQ.ResCheckIn value) {
        this.resCheckIn = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelReservationID" minOccurs="0"/&gt;
     *         &lt;element name="HotelIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelID" minOccurs="0"/&gt;
     *         &lt;element name="GuestRooms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuestRoom" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelReservationIDs",
        "hotelIDs",
        "guestRooms"
    })
    public static class ResCheckIn {

        @XmlElement(name = "HotelReservationIDs")
        protected ArrayOfHotelReservationID hotelReservationIDs;
        @XmlElement(name = "HotelIDs")
        protected ArrayOfHotelID hotelIDs;
        @XmlElement(name = "GuestRooms")
        protected ArrayOfGuestRoom guestRooms;

        /**
         * 获取hotelReservationIDs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfHotelReservationID }
         *     
         */
        public ArrayOfHotelReservationID getHotelReservationIDs() {
            return hotelReservationIDs;
        }

        /**
         * 设置hotelReservationIDs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfHotelReservationID }
         *     
         */
        public void setHotelReservationIDs(ArrayOfHotelReservationID value) {
            this.hotelReservationIDs = value;
        }

        /**
         * 获取hotelIDs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfHotelID }
         *     
         */
        public ArrayOfHotelID getHotelIDs() {
            return hotelIDs;
        }

        /**
         * 设置hotelIDs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfHotelID }
         *     
         */
        public void setHotelIDs(ArrayOfHotelID value) {
            this.hotelIDs = value;
        }

        /**
         * 获取guestRooms属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfGuestRoom }
         *     
         */
        public ArrayOfGuestRoom getGuestRooms() {
            return guestRooms;
        }

        /**
         * 设置guestRooms属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfGuestRoom }
         *     
         */
        public void setGuestRooms(ArrayOfGuestRoom value) {
            this.guestRooms = value;
        }

    }

}
