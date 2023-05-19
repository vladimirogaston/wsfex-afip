
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Mon complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Mon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mon_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Mon", propOrder = {
    "monId",
    "monDs",
    "monVigDesde",
    "monVigHasta"
})
public class ClsFEXResponseMon {

    @XmlElement(name = "Mon_Id")
    protected String monId;
    @XmlElement(name = "Mon_Ds")
    protected String monDs;
    @XmlElement(name = "Mon_vig_desde")
    protected String monVigDesde;
    @XmlElement(name = "Mon_vig_hasta")
    protected String monVigHasta;

    /**
     * Obtiene el valor de la propiedad monId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonId() {
        return monId;
    }

    /**
     * Define el valor de la propiedad monId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonId(String value) {
        this.monId = value;
    }

    /**
     * Obtiene el valor de la propiedad monDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonDs() {
        return monDs;
    }

    /**
     * Define el valor de la propiedad monDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonDs(String value) {
        this.monDs = value;
    }

    /**
     * Obtiene el valor de la propiedad monVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonVigDesde() {
        return monVigDesde;
    }

    /**
     * Define el valor de la propiedad monVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonVigDesde(String value) {
        this.monVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad monVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonVigHasta() {
        return monVigHasta;
    }

    /**
     * Define el valor de la propiedad monVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonVigHasta(String value) {
        this.monVigHasta = value;
    }

}
