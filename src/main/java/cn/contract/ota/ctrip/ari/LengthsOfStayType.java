
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>LengthsOfStayType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LengthsOfStayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LengthOfStay" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LOS_Pattern" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="MinMaxMessageType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="SetMinLOS"/&gt;
 *                       &lt;enumeration value="RemoveMinLOS"/&gt;
 *                       &lt;enumeration value="SetMaxLOS"/&gt;
 *                       &lt;enumeration value="RemoveMaxLOS"/&gt;
 *                       &lt;enumeration value="SetForwardMinStay"/&gt;
 *                       &lt;enumeration value="RemoveForwardMinStay"/&gt;
 *                       &lt;enumeration value="SetForwardMaxStay"/&gt;
 *                       &lt;enumeration value="RemoveForwardMaxStay"/&gt;
 *                       &lt;enumeration value="FixedLOS"/&gt;
 *                       &lt;enumeration value="FullPatternLOS"/&gt;
 *                       &lt;enumeration value="MinLOS"/&gt;
 *                       &lt;enumeration value="MaxLOS"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FixedPatternLength" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthsOfStayType", propOrder = {
    "lengthOfStay"
})
public class LengthsOfStayType {

    @XmlElement(name = "LengthOfStay")
    protected List<LengthOfStay> lengthOfStay;
    @XmlAttribute(name = "FixedPatternLength")
    protected BigInteger fixedPatternLength;

    /**
     * Gets the value of the lengthOfStay property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthOfStay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthOfStay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthsOfStayType.LengthOfStay }
     *
     *
     */
    public List<LengthOfStay> getLengthOfStay() {
        if (lengthOfStay == null) {
            lengthOfStay = new ArrayList<LengthOfStay>();
        }
        return this.lengthOfStay;
    }

    /**
     * 获取fixedPatternLength属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getFixedPatternLength() {
        return fixedPatternLength;
    }

    /**
     * 设置fixedPatternLength属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setFixedPatternLength(BigInteger value) {
        this.fixedPatternLength = value;
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
     *         &lt;element name="LOS_Pattern" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="MinMaxMessageType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="SetMinLOS"/&gt;
     *             &lt;enumeration value="RemoveMinLOS"/&gt;
     *             &lt;enumeration value="SetMaxLOS"/&gt;
     *             &lt;enumeration value="RemoveMaxLOS"/&gt;
     *             &lt;enumeration value="SetForwardMinStay"/&gt;
     *             &lt;enumeration value="RemoveForwardMinStay"/&gt;
     *             &lt;enumeration value="SetForwardMaxStay"/&gt;
     *             &lt;enumeration value="RemoveForwardMaxStay"/&gt;
     *             &lt;enumeration value="FixedLOS"/&gt;
     *             &lt;enumeration value="FullPatternLOS"/&gt;
     *             &lt;enumeration value="MinLOS"/&gt;
     *             &lt;enumeration value="MaxLOS"/&gt;
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
        "losPattern"
    })
    public static class LengthOfStay {

        @XmlElement(name = "LOS_Pattern")
        protected LengthsOfStayType.LengthOfStay.LOSPattern losPattern;
        @XmlAttribute(name = "Time")
        protected BigInteger time;
        @XmlAttribute(name = "TimeUnit")
        protected TimeUnitType timeUnit;
        @XmlAttribute(name = "MinMaxMessageType")
        protected String minMaxMessageType;

        /**
         * 获取losPattern属性的值。
         *
         * @return
         *     possible object is
         *     {@link LengthsOfStayType.LengthOfStay.LOSPattern }
         *
         */
        public LengthsOfStayType.LengthOfStay.LOSPattern getLOSPattern() {
            return losPattern;
        }

        /**
         * 设置losPattern属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType.LengthOfStay.LOSPattern }
         *
         */
        public void setLOSPattern(LengthsOfStayType.LengthOfStay.LOSPattern value) {
            this.losPattern = value;
        }

        /**
         * 获取time属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTime() {
            return time;
        }

        /**
         * 设置time属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTime(BigInteger value) {
            this.time = value;
        }

        /**
         * 获取timeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * 设置timeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
        }

        /**
         * 获取minMaxMessageType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinMaxMessageType() {
            return minMaxMessageType;
        }

        /**
         * 设置minMaxMessageType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinMaxMessageType(String value) {
            this.minMaxMessageType = value;
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
         *       &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LOSPattern {

            @XmlAttribute(name = "FullPatternLOS")
            protected String fullPatternLOS;

            /**
             * 获取fullPatternLOS属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullPatternLOS() {
                return fullPatternLOS;
            }

            /**
             * 设置fullPatternLOS属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullPatternLOS(String value) {
                this.fullPatternLOS = value;
            }

        }

    }

}
