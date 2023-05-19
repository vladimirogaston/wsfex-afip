
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEX_LastCMP_Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEX_LastCMP_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cbte_fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEX_LastCMP_Response", propOrder = {
    "cbteNro",
    "cbteFecha"
})
public class ClsFEXLastCMPResponse {

    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Cbte_fecha")
    protected String cbteFecha;

    /**
     * Obtiene el valor de la propiedad cbteNro.
     * 
     */
    public long getCbteNro() {
        return cbteNro;
    }

    /**
     * Define el valor de la propiedad cbteNro.
     * 
     */
    public void setCbteNro(long value) {
        this.cbteNro = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteFecha() {
        return cbteFecha;
    }

    /**
     * Define el valor de la propiedad cbteFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteFecha(String value) {
        this.cbteFecha = value;
    }

}
