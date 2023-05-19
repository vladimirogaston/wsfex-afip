
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FEXResponse_CheckPermiso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FEXResponse_CheckPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXResultGet" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXResponse_CheckPermiso" minOccurs="0"/>
 *         &lt;element name="FEXErr" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXErr" minOccurs="0"/>
 *         &lt;element name="FEXEvents" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXResponse_CheckPermiso", propOrder = {
    "fexResultGet",
    "fexErr",
    "fexEvents"
})
public class FEXResponseCheckPermiso {

    @XmlElement(name = "FEXResultGet")
    protected ClsFEXResponseCheckPermiso fexResultGet;
    @XmlElement(name = "FEXErr")
    protected ClsFEXErr fexErr;
    @XmlElement(name = "FEXEvents")
    protected ClsFEXEvents fexEvents;

    /**
     * Obtiene el valor de la propiedad fexResultGet.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXResponseCheckPermiso }
     *     
     */
    public ClsFEXResponseCheckPermiso getFEXResultGet() {
        return fexResultGet;
    }

    /**
     * Define el valor de la propiedad fexResultGet.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXResponseCheckPermiso }
     *     
     */
    public void setFEXResultGet(ClsFEXResponseCheckPermiso value) {
        this.fexResultGet = value;
    }

    /**
     * Obtiene el valor de la propiedad fexErr.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXErr }
     *     
     */
    public ClsFEXErr getFEXErr() {
        return fexErr;
    }

    /**
     * Define el valor de la propiedad fexErr.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXErr }
     *     
     */
    public void setFEXErr(ClsFEXErr value) {
        this.fexErr = value;
    }

    /**
     * Obtiene el valor de la propiedad fexEvents.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXEvents }
     *     
     */
    public ClsFEXEvents getFEXEvents() {
        return fexEvents;
    }

    /**
     * Define el valor de la propiedad fexEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXEvents }
     *     
     */
    public void setFEXEvents(ClsFEXEvents value) {
        this.fexEvents = value;
    }

}
