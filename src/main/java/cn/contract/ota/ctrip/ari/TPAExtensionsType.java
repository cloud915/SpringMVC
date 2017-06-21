
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TPA_ExtensionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyRate" type="{http://www.opentravel.org/OTA/2003/05}DailyRateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExtraPersonCharge" type="{http://www.opentravel.org/OTA/2003/05}ExtraPersonChargeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsType", propOrder = {
    "dailyRate",
    "extraPersonCharge"
})
public class TPAExtensionsType {

    @XmlElement(name = "DailyRate", nillable = true)
    protected List<DailyRateType> dailyRate;
    @XmlElement(name = "ExtraPersonCharge")
    protected ExtraPersonChargeType extraPersonCharge;

    /**
     * Gets the value of the dailyRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailyRateType }
     * 
     * 
     */
    public List<DailyRateType> getDailyRate() {
        if (dailyRate == null) {
            dailyRate = new ArrayList<DailyRateType>();
        }
        return this.dailyRate;
    }

    /**
     * 获取extraPersonCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtraPersonChargeType }
     *     
     */
    public ExtraPersonChargeType getExtraPersonCharge() {
        return extraPersonCharge;
    }

    /**
     * 设置extraPersonCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraPersonChargeType }
     *     
     */
    public void setExtraPersonCharge(ExtraPersonChargeType value) {
        this.extraPersonCharge = value;
    }

}
