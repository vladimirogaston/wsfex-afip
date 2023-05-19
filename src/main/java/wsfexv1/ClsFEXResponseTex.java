
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Tex complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Tex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tex_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Tex_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tex_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tex_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Tex", propOrder = {
    "texId",
    "texDs",
    "texVigDesde",
    "texVigHasta"
})
public class ClsFEXResponseTex {

    @XmlElement(name = "Tex_Id")
    protected short texId;
    @XmlElement(name = "Tex_Ds")
    protected String texDs;
    @XmlElement(name = "Tex_vig_desde")
    protected String texVigDesde;
    @XmlElement(name = "Tex_vig_hasta")
    protected String texVigHasta;

    /**
     * Obtiene el valor de la propiedad texId.
     * 
     */
    public short getTexId() {
        return texId;
    }

    /**
     * Define el valor de la propiedad texId.
     * 
     */
    public void setTexId(short value) {
        this.texId = value;
    }

    /**
     * Obtiene el valor de la propiedad texDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexDs() {
        return texDs;
    }

    /**
     * Define el valor de la propiedad texDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexDs(String value) {
        this.texDs = value;
    }

    /**
     * Obtiene el valor de la propiedad texVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexVigDesde() {
        return texVigDesde;
    }

    /**
     * Define el valor de la propiedad texVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexVigDesde(String value) {
        this.texVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad texVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexVigHasta() {
        return texVigHasta;
    }

    /**
     * Define el valor de la propiedad texVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexVigHasta(String value) {
        this.texVigHasta = value;
    }

}
