
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelRatePlanTypeRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType"&gt;
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "ArrayOfHotelRatePlanTypeRate", propOrder = {
    "rate"
})
public class ArrayOfHotelRatePlanTypeRate {

    @XmlElement(name = "Rate")
    protected List<Rate> rate;

    /**
     * Gets the value of the rate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeRate.Rate }
     *
     *
     */
    public List<Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rate>();
        }
        return this.rate;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType"&gt;
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Rate
        extends RateUploadType
    {

        @XmlAttribute(name = "Status")
        protected AvailabilityStatusType status;

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
