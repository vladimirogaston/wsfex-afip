
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_DST_pais complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_DST_pais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DST_Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DST_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_DST_pais", propOrder = {
    "dstCodigo",
    "dstDs"
})
public class ClsFEXResponseDSTPais {

    @XmlElement(name = "DST_Codigo")
    protected String dstCodigo;
    @XmlElement(name = "DST_Ds")
    protected String dstDs;

    /**
     * Obtiene el valor de la propiedad dstCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSTCodigo() {
        return dstCodigo;
    }

    /**
     * Define el valor de la propiedad dstCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSTCodigo(String value) {
        this.dstCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad dstDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSTDs() {
        return dstDs;
    }

    /**
     * Define el valor de la propiedad dstDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSTDs(String value) {
        this.dstDs = value;
    }

}
