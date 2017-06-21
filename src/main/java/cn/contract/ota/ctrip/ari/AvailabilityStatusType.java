
package cn.contract.ota.ctrip.ari;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvailabilityStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Close"/&gt;
 *     &lt;enumeration value="ClosedOnArrival"/&gt;
 *     &lt;enumeration value="ClosedOnArrivalOnRequest"/&gt;
 *     &lt;enumeration value="OnRequest"/&gt;
 *     &lt;enumeration value="RemoveCloseOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityStatusType")
@XmlEnum
public enum AvailabilityStatusType {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Close")
    CLOSE("Close"),
    @XmlEnumValue("ClosedOnArrival")
    CLOSED_ON_ARRIVAL("ClosedOnArrival"),
    @XmlEnumValue("ClosedOnArrivalOnRequest")
    CLOSED_ON_ARRIVAL_ON_REQUEST("ClosedOnArrivalOnRequest"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("RemoveCloseOnly")
    REMOVE_CLOSE_ONLY("RemoveCloseOnly");
    private final String value;

    AvailabilityStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityStatusType fromValue(String v) {
        for (AvailabilityStatusType c: AvailabilityStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
