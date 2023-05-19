
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Inc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Inc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inc_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inc_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inc_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inc_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Inc", propOrder = {
    "incId",
    "incDs",
    "incVigDesde",
    "incVigHasta"
})
public class ClsFEXResponseInc {

    @XmlElement(name = "Inc_Id")
    protected String incId;
    @XmlElement(name = "Inc_Ds")
    protected String incDs;
    @XmlElement(name = "Inc_vig_desde")
    protected String incVigDesde;
    @XmlElement(name = "Inc_vig_hasta")
    protected String incVigHasta;

    /**
     * Obtiene el valor de la propiedad incId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncId() {
        return incId;
    }

    /**
     * Define el valor de la propiedad incId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncId(String value) {
        this.incId = value;
    }

    /**
     * Obtiene el valor de la propiedad incDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncDs() {
        return incDs;
    }

    /**
     * Define el valor de la propiedad incDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncDs(String value) {
        this.incDs = value;
    }

    /**
     * Obtiene el valor de la propiedad incVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncVigDesde() {
        return incVigDesde;
    }

    /**
     * Define el valor de la propiedad incVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncVigDesde(String value) {
        this.incVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad incVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncVigHasta() {
        return incVigHasta;
    }

    /**
     * Define el valor de la propiedad incVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncVigHasta(String value) {
        this.incVigHasta = value;
    }

}
