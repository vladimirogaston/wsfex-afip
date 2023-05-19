
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Mon_CON_Cotizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Mon_CON_Cotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mon_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_ctz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha_ctz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Mon_CON_Cotizacion", propOrder = {
    "monId",
    "monDs",
    "monCtz",
    "fechaCtz"
})
public class ClsFEXResponseMonCONCotizacion {

    @XmlElement(name = "Mon_Id")
    protected String monId;
    @XmlElement(name = "Mon_Ds")
    protected String monDs;
    @XmlElement(name = "Mon_ctz")
    protected String monCtz;
    @XmlElement(name = "Fecha_ctz")
    protected String fechaCtz;

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
     * Obtiene el valor de la propiedad monCtz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonCtz() {
        return monCtz;
    }

    /**
     * Define el valor de la propiedad monCtz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonCtz(String value) {
        this.monCtz = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCtz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCtz() {
        return fechaCtz;
    }

    /**
     * Define el valor de la propiedad fechaCtz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCtz(String value) {
        this.fechaCtz = value;
    }

}
