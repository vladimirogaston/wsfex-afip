
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
 *         &lt;element name="Cmp" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXGetCMP" minOccurs="0"/>
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
    "cmp"
})
@XmlRootElement(name = "FEXGetCMP")
public class FEXGetCMP {

    @XmlElement(name = "Auth")
    protected ClsFEXAuthRequest auth;
    @XmlElement(name = "Cmp")
    protected ClsFEXGetCMP cmp;

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
     * Obtiene el valor de la propiedad cmp.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXGetCMP }
     *     
     */
    public ClsFEXGetCMP getCmp() {
        return cmp;
    }

    /**
     * Define el valor de la propiedad cmp.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXGetCMP }
     *     
     */
    public void setCmp(ClsFEXGetCMP value) {
        this.cmp = value;
    }

}
