
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRatePlanCandidate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanCandidate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRef" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AvailRatesOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ArrayOfRatePlanCandidate", propOrder = {
    "ratePlanCandidate"
})
public class ArrayOfRatePlanCandidate {

    @XmlElement(name = "RatePlanCandidate")
    protected List<RatePlanCandidate> ratePlanCandidate;

    /**
     * Gets the value of the ratePlanCandidate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanCandidate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanCandidate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRatePlanCandidate.RatePlanCandidate }
     *
     *
     */
    public List<RatePlanCandidate> getRatePlanCandidate() {
        if (ratePlanCandidate == null) {
            ratePlanCandidate = new ArrayList<RatePlanCandidate>();
        }
        return this.ratePlanCandidate;
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
     *         &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRef" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AvailRatesOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelRefs"
    })
    public static class RatePlanCandidate {

        @XmlElement(name = "HotelRefs")
        protected ArrayOfHotelRef hotelRefs;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "AvailRatesOnlyInd")
        protected Boolean availRatesOnlyInd;

        /**
         * 获取hotelRefs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfHotelRef }
         *     
         */
        public ArrayOfHotelRef getHotelRefs() {
            return hotelRefs;
        }

        /**
         * 设置hotelRefs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfHotelRef }
         *     
         */
        public void setHotelRefs(ArrayOfHotelRef value) {
            this.hotelRefs = value;
        }

        /**
         * 获取ratePlanCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * 设置ratePlanCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * 获取availRatesOnlyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailRatesOnlyInd() {
            return availRatesOnlyInd;
        }

        /**
         * 设置availRatesOnlyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailRatesOnlyInd(Boolean value) {
            this.availRatesOnlyInd = value;
        }

    }

}
