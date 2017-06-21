
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>RateUploadType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateUploadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseByGuestAmts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateUploadTypeBaseByGuestAmt" minOccurs="0"/&gt;
 *         &lt;element name="MealsIncluded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateUploadType", propOrder = {
    "baseByGuestAmts",
    "mealsIncluded"
})
@XmlSeeAlso({
        cn.contract.ota.ctrip.ari.ArrayOfHotelRatePlanTypeRate.Rate.class,
        cn.contract.ota.ctrip.ari.ArrayOfRateAmountMessageTypeRate.Rate.class
})
public class RateUploadType {

    @XmlElement(name = "BaseByGuestAmts")
    protected ArrayOfRateUploadTypeBaseByGuestAmt baseByGuestAmts;
    @XmlElement(name = "MealsIncluded")
    protected RateUploadType.MealsIncluded mealsIncluded;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;

    /**
     * 获取baseByGuestAmts属性的值。
     *
     * @return
     *     possible object is
     *     {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     *
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt getBaseByGuestAmts() {
        return baseByGuestAmts;
    }

    /**
     * 设置baseByGuestAmts属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     *
     */
    public void setBaseByGuestAmts(ArrayOfRateUploadTypeBaseByGuestAmt value) {
        this.baseByGuestAmts = value;
    }

    /**
     * 获取mealsIncluded属性的值。
     *
     * @return
     *     possible object is
     *     {@link RateUploadType.MealsIncluded }
     *
     */
    public RateUploadType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * 设置mealsIncluded属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RateUploadType.MealsIncluded }
     *
     */
    public void setMealsIncluded(RateUploadType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

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

    /**
     * 获取numberOfUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * 设置numberOfUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
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
     *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "NumberOfBreakfast")
        protected BigInteger numberOfBreakfast;

        /**
         * 获取breakfast属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * 设置breakfast属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * 获取numberOfBreakfast属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfBreakfast() {
            return numberOfBreakfast;
        }

        /**
         * 设置numberOfBreakfast属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfBreakfast(BigInteger value) {
            this.numberOfBreakfast = value;
        }

    }

}
