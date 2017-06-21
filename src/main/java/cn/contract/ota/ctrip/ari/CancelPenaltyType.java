
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CancelPenaltyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancelPenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deadline" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyTypeDeadline" minOccurs="0"/&gt;
 *         &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenaltyType", propOrder = {
    "deadline",
    "amountPercent",
    "penaltyDescription"
})
public class CancelPenaltyType {

    @XmlElement(name = "Deadline")
    protected CancelPenaltyTypeDeadline deadline;
    @XmlElement(name = "AmountPercent")
    protected AmountPercentType amountPercent;
    @XmlElement(name = "PenaltyDescription")
    protected List<ParagraphType> penaltyDescription;

    /**
     * 获取deadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltyTypeDeadline }
     *     
     */
    public CancelPenaltyTypeDeadline getDeadline() {
        return deadline;
    }

    /**
     * 设置deadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltyTypeDeadline }
     *     
     */
    public void setDeadline(CancelPenaltyTypeDeadline value) {
        this.deadline = value;
    }

    /**
     * 获取amountPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentType }
     *     
     */
    public AmountPercentType getAmountPercent() {
        return amountPercent;
    }

    /**
     * 设置amountPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentType }
     *     
     */
    public void setAmountPercent(AmountPercentType value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the penaltyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getPenaltyDescription() {
        if (penaltyDescription == null) {
            penaltyDescription = new ArrayList<ParagraphType>();
        }
        return this.penaltyDescription;
    }

}
