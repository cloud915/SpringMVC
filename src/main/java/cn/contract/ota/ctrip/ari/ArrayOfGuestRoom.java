
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfGuestRoom complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuestRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestRoom" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResGuest" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ReservationActionType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="CheckedIn"/&gt;
 *                                 &lt;enumeration value="CheckedOut"/&gt;
 *                                 &lt;enumeration value="Confirmed"/&gt;
 *                                 &lt;enumeration value="Cancelled"/&gt;
 *                                 &lt;enumeration value="NoShow"/&gt;
 *                                 &lt;enumeration value="Stay"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ConfirmationID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfGuestRoom", propOrder = {
    "guestRoom"
})
public class ArrayOfGuestRoom {

    @XmlElement(name = "GuestRoom")
    protected List<GuestRoom> guestRoom;

    /**
     * Gets the value of the guestRoom property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestRoom property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestRoom().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGuestRoom.GuestRoom }
     *
     *
     */
    public List<GuestRoom> getGuestRoom() {
        if (guestRoom == null) {
            guestRoom = new ArrayList<GuestRoom>();
        }
        return this.guestRoom;
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
     *         &lt;element name="ResGuest" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ReservationActionType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="CheckedIn"/&gt;
     *                       &lt;enumeration value="CheckedOut"/&gt;
     *                       &lt;enumeration value="Confirmed"/&gt;
     *                       &lt;enumeration value="Cancelled"/&gt;
     *                       &lt;enumeration value="NoShow"/&gt;
     *                       &lt;enumeration value="Stay"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ConfirmationID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RoomRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuest"
    })
    public static class GuestRoom {

        @XmlElement(name = "ResGuest")
        protected ArrayOfGuestRoom.GuestRoom.ResGuest resGuest;
        @XmlAttribute(name = "RoomNumber")
        protected String roomNumber;
        @XmlAttribute(name = "ConfirmationID")
        protected String confirmationID;
        @XmlAttribute(name = "RoomRPH")
        protected String roomRPH;

        /**
         * 获取resGuest属性的值。
         *
         * @return
         *     possible object is
         *     {@link ArrayOfGuestRoom.GuestRoom.ResGuest }
         *
         */
        public ArrayOfGuestRoom.GuestRoom.ResGuest getResGuest() {
            return resGuest;
        }

        /**
         * 设置resGuest属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfGuestRoom.GuestRoom.ResGuest }
         *
         */
        public void setResGuest(ArrayOfGuestRoom.GuestRoom.ResGuest value) {
            this.resGuest = value;
        }

        /**
         * 获取roomNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomNumber() {
            return roomNumber;
        }

        /**
         * 设置roomNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomNumber(String value) {
            this.roomNumber = value;
        }

        /**
         * 获取confirmationID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmationID() {
            return confirmationID;
        }

        /**
         * 设置confirmationID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmationID(String value) {
            this.confirmationID = value;
        }

        /**
         * 获取roomRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomRPH() {
            return roomRPH;
        }

        /**
         * 设置roomRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomRPH(String value) {
            this.roomRPH = value;
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
         *       &lt;attribute name="ReservationActionType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="CheckedIn"/&gt;
         *             &lt;enumeration value="CheckedOut"/&gt;
         *             &lt;enumeration value="Confirmed"/&gt;
         *             &lt;enumeration value="Cancelled"/&gt;
         *             &lt;enumeration value="NoShow"/&gt;
         *             &lt;enumeration value="Stay"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResGuest {

            @XmlAttribute(name = "ReservationActionType", required = true)
            protected String reservationActionType;

            /**
             * 获取reservationActionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationActionType() {
                return reservationActionType;
            }

            /**
             * 设置reservationActionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationActionType(String value) {
                this.reservationActionType = value;
            }

        }

    }

}
