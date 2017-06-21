
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfGuestRoomType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuestRoomType"&gt;
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
 *                           &lt;sequence&gt;
 *                             &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TotalOtherFee" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfGuestRoomType", propOrder = {
    "guestRoom"
})
public class ArrayOfGuestRoomType {

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
     * {@link ArrayOfGuestRoomType.GuestRoom }
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
     *                 &lt;sequence&gt;
     *                   &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TotalOtherFee" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        protected ArrayOfGuestRoomType.GuestRoom.ResGuest resGuest;
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
         *     {@link ArrayOfGuestRoomType.GuestRoom.ResGuest }
         *
         */
        public ArrayOfGuestRoomType.GuestRoom.ResGuest getResGuest() {
            return resGuest;
        }

        /**
         * 设置resGuest属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfGuestRoomType.GuestRoom.ResGuest }
         *
         */
        public void setResGuest(ArrayOfGuestRoomType.GuestRoom.ResGuest value) {
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
         *       &lt;sequence&gt;
         *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TotalOtherFee" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        @XmlType(name = "", propOrder = {
            "clientName",
            "totalOtherFee"
        })
        public static class ResGuest {

            @XmlElement(name = "ClientName")
            protected String clientName;
            @XmlElement(name = "TotalOtherFee")
            protected ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee totalOtherFee;
            @XmlAttribute(name = "ArrivalTime")
            protected String arrivalTime;
            @XmlAttribute(name = "DepartureTime")
            protected String departureTime;
            @XmlAttribute(name = "ReservationActionType", required = true)
            protected String reservationActionType;

            /**
             * 获取clientName属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getClientName() {
                return clientName;
            }

            /**
             * 设置clientName属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setClientName(String value) {
                this.clientName = value;
            }

            /**
             * 获取totalOtherFee属性的值。
             *
             * @return
             *     possible object is
             *     {@link ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee }
             *
             */
            public ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee getTotalOtherFee() {
                return totalOtherFee;
            }

            /**
             * 设置totalOtherFee属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee }
             *
             */
            public void setTotalOtherFee(ArrayOfGuestRoomType.GuestRoom.ResGuest.TotalOtherFee value) {
                this.totalOtherFee = value;
            }

            /**
             * 获取arrivalTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalTime() {
                return arrivalTime;
            }

            /**
             * 设置arrivalTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalTime(String value) {
                this.arrivalTime = value;
            }

            /**
             * 获取departureTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureTime() {
                return departureTime;
            }

            /**
             * 设置departureTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureTime(String value) {
                this.departureTime = value;
            }

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


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TotalOtherFee {

                @XmlAttribute(name = "Amount")
                protected String amount;
                @XmlAttribute(name = "Currency")
                protected String currency;

                /**
                 * 获取amount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmount() {
                    return amount;
                }

                /**
                 * 设置amount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmount(String value) {
                    this.amount = value;
                }

                /**
                 * 获取currency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrency() {
                    return currency;
                }

                /**
                 * 设置currency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrency(String value) {
                    this.currency = value;
                }

            }

        }

    }

}
