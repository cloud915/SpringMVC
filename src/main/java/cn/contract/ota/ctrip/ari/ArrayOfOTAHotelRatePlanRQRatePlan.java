
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOTA_HotelRatePlanRQRatePlan complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_HotelRatePlanRQRatePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlan" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DateRange" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidate" minOccurs="0"/&gt;
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
@XmlType(name = "ArrayOfOTA_HotelRatePlanRQRatePlan", propOrder = {
    "ratePlan"
})
public class ArrayOfOTAHotelRatePlanRQRatePlan {

    @XmlElement(name = "RatePlan")
    protected List<RatePlan> ratePlan;

    /**
     * Gets the value of the ratePlan property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlan().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan }
     *
     *
     */
    public List<RatePlan> getRatePlan() {
        if (ratePlan == null) {
            ratePlan = new ArrayList<RatePlan>();
        }
        return this.ratePlan;
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
     *         &lt;element name="DateRange" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidate" minOccurs="0"/&gt;
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
        "dateRange",
        "ratePlanCandidates"
    })
    public static class RatePlan {

        @XmlElement(name = "DateRange")
        protected ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange dateRange;
        @XmlElement(name = "RatePlanCandidates")
        protected ArrayOfRatePlanCandidate ratePlanCandidates;

        /**
         * 获取dateRange属性的值。
         *
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange }
         *
         */
        public ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange getDateRange() {
            return dateRange;
        }

        /**
         * 设置dateRange属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange }
         *
         */
        public void setDateRange(ArrayOfOTAHotelRatePlanRQRatePlan.RatePlan.DateRange value) {
            this.dateRange = value;
        }

        /**
         * 获取ratePlanCandidates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidate }
         *     
         */
        public ArrayOfRatePlanCandidate getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * 设置ratePlanCandidates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidate }
         *     
         */
        public void setRatePlanCandidates(ArrayOfRatePlanCandidate value) {
            this.ratePlanCandidates = value;
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
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DateRange {

            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "End")
            protected String end;

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

        }

    }

}
