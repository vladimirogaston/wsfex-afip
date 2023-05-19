
package wsfexv1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Ctz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Ctz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mon_ctz" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Mon_fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Ctz", propOrder = {
    "monCtz",
    "monFecha"
})
public class ClsFEXResponseCtz {

    @XmlElement(name = "Mon_ctz", required = true)
    protected BigDecimal monCtz;
    @XmlElement(name = "Mon_fecha")
    protected String monFecha;

    /**
     * Obtiene el valor de la propiedad monCtz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonCtz() {
        return monCtz;
    }

    /**
     * Define el valor de la propiedad monCtz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonCtz(BigDecimal value) {
        this.monCtz = value;
    }

    /**
     * Obtiene el valor de la propiedad monFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonFecha() {
        return monFecha;
    }

    /**
     * Define el valor de la propiedad monFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonFecha(String value) {
        this.monFecha = value;
    }

}
