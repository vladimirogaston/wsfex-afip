
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXAuthRequest" minOccurs="0"/>
 *         &lt;element name="Fecha_CTZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auth",
    "fechaCTZ"
})
@XmlRootElement(name = "FEXGetPARAM_MON_CON_COTIZACION")
public class FEXGetPARAMMONCONCOTIZACION {

    @XmlElement(name = "Auth")
    protected ClsFEXAuthRequest auth;
    @XmlElement(name = "Fecha_CTZ")
    protected String fechaCTZ;

    /**
     * Obtiene el valor de la propiedad auth.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXAuthRequest }
     *     
     */
    public ClsFEXAuthRequest getAuth() {
        return auth;
    }

    /**
     * Define el valor de la propiedad auth.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXAuthRequest }
     *     
     */
    public void setAuth(ClsFEXAuthRequest value) {
        this.auth = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCTZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCTZ() {
        return fechaCTZ;
    }

    /**
     * Define el valor de la propiedad fechaCTZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCTZ(String value) {
        this.fechaCTZ = value;
    }

}
