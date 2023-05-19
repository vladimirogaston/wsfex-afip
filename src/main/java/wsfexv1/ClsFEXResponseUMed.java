
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_UMed complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_UMed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Umed_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Umed_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Umed_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Umed_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_UMed", propOrder = {
    "umedId",
    "umedDs",
    "umedVigDesde",
    "umedVigHasta"
})
public class ClsFEXResponseUMed {

    @XmlElement(name = "Umed_Id")
    protected short umedId;
    @XmlElement(name = "Umed_Ds")
    protected String umedDs;
    @XmlElement(name = "Umed_vig_desde")
    protected String umedVigDesde;
    @XmlElement(name = "Umed_vig_hasta")
    protected String umedVigHasta;

    /**
     * Obtiene el valor de la propiedad umedId.
     * 
     */
    public short getUmedId() {
        return umedId;
    }

    /**
     * Define el valor de la propiedad umedId.
     * 
     */
    public void setUmedId(short value) {
        this.umedId = value;
    }

    /**
     * Obtiene el valor de la propiedad umedDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmedDs() {
        return umedDs;
    }

    /**
     * Define el valor de la propiedad umedDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmedDs(String value) {
        this.umedDs = value;
    }

    /**
     * Obtiene el valor de la propiedad umedVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmedVigDesde() {
        return umedVigDesde;
    }

    /**
     * Define el valor de la propiedad umedVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmedVigDesde(String value) {
        this.umedVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad umedVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmedVigHasta() {
        return umedVigHasta;
    }

    /**
     * Define el valor de la propiedad umedVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmedVigHasta(String value) {
        this.umedVigHasta = value;
    }

}
