
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Idi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Idi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idi_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Idi_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idi_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idi_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Idi", propOrder = {
    "idiId",
    "idiDs",
    "idiVigDesde",
    "idiVigHasta"
})
public class ClsFEXResponseIdi {

    @XmlElement(name = "Idi_Id")
    protected short idiId;
    @XmlElement(name = "Idi_Ds")
    protected String idiDs;
    @XmlElement(name = "Idi_vig_desde")
    protected String idiVigDesde;
    @XmlElement(name = "Idi_vig_hasta")
    protected String idiVigHasta;

    /**
     * Obtiene el valor de la propiedad idiId.
     * 
     */
    public short getIdiId() {
        return idiId;
    }

    /**
     * Define el valor de la propiedad idiId.
     * 
     */
    public void setIdiId(short value) {
        this.idiId = value;
    }

    /**
     * Obtiene el valor de la propiedad idiDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiDs() {
        return idiDs;
    }

    /**
     * Define el valor de la propiedad idiDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiDs(String value) {
        this.idiDs = value;
    }

    /**
     * Obtiene el valor de la propiedad idiVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiVigDesde() {
        return idiVigDesde;
    }

    /**
     * Define el valor de la propiedad idiVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiVigDesde(String value) {
        this.idiVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad idiVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiVigHasta() {
        return idiVigHasta;
    }

    /**
     * Define el valor de la propiedad idiVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiVigHasta(String value) {
        this.idiVigHasta = value;
    }

}
