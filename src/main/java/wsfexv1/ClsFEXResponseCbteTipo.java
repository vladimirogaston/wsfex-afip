
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Cbte_Tipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Cbte_Tipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cbte_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cbte_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cbte_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cbte_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Cbte_Tipo", propOrder = {
    "cbteId",
    "cbteDs",
    "cbteVigDesde",
    "cbteVigHasta"
})
public class ClsFEXResponseCbteTipo {

    @XmlElement(name = "Cbte_Id")
    protected short cbteId;
    @XmlElement(name = "Cbte_Ds")
    protected String cbteDs;
    @XmlElement(name = "Cbte_vig_desde")
    protected String cbteVigDesde;
    @XmlElement(name = "Cbte_vig_hasta")
    protected String cbteVigHasta;

    /**
     * Obtiene el valor de la propiedad cbteId.
     * 
     */
    public short getCbteId() {
        return cbteId;
    }

    /**
     * Define el valor de la propiedad cbteId.
     * 
     */
    public void setCbteId(short value) {
        this.cbteId = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteDs() {
        return cbteDs;
    }

    /**
     * Define el valor de la propiedad cbteDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteDs(String value) {
        this.cbteDs = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteVigDesde() {
        return cbteVigDesde;
    }

    /**
     * Define el valor de la propiedad cbteVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteVigDesde(String value) {
        this.cbteVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteVigHasta() {
        return cbteVigHasta;
    }

    /**
     * Define el valor de la propiedad cbteVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteVigHasta(String value) {
        this.cbteVigHasta = value;
    }

}
