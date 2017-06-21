
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseInvCountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseInvCountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="InvCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBaseInvCountTypeInvCount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInvCountType", propOrder = {
    "statusApplicationControl",
    "invCounts"
})
public class BaseInvCountType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "InvCounts")
    protected ArrayOfBaseInvCountTypeInvCount invCounts;

    /**
     * 获取statusApplicationControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * 设置statusApplicationControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * 获取invCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseInvCountTypeInvCount }
     *     
     */
    public ArrayOfBaseInvCountTypeInvCount getInvCounts() {
        return invCounts;
    }

    /**
     * 设置invCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseInvCountTypeInvCount }
     *     
     */
    public void setInvCounts(ArrayOfBaseInvCountTypeInvCount value) {
        this.invCounts = value;
    }

}
