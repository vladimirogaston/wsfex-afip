
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXEvents complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EventMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXEvents", propOrder = {
    "eventCode",
    "eventMsg"
})
public class ClsFEXEvents {

    @XmlElement(name = "EventCode")
    protected int eventCode;
    @XmlElement(name = "EventMsg")
    protected String eventMsg;

    /**
     * Obtiene el valor de la propiedad eventCode.
     * 
     */
    public int getEventCode() {
        return eventCode;
    }

    /**
     * Define el valor de la propiedad eventCode.
     * 
     */
    public void setEventCode(int value) {
        this.eventCode = value;
    }

    /**
     * Obtiene el valor de la propiedad eventMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventMsg() {
        return eventMsg;
    }

    /**
     * Define el valor de la propiedad eventMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventMsg(String value) {
        this.eventMsg = value;
    }

}
