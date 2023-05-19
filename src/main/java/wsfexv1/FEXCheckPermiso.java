
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
 *         &lt;element name="ID_Permiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dst_merc" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPermiso",
    "dstMerc"
})
@XmlRootElement(name = "FEXCheck_Permiso")
public class FEXCheckPermiso {

    @XmlElement(name = "Auth")
    protected ClsFEXAuthRequest auth;
    @XmlElement(name = "ID_Permiso")
    protected String idPermiso;
    @XmlElement(name = "Dst_merc")
    protected int dstMerc;

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
     * Obtiene el valor de la propiedad idPermiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPermiso() {
        return idPermiso;
    }

    /**
     * Define el valor de la propiedad idPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPermiso(String value) {
        this.idPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad dstMerc.
     * 
     */
    public int getDstMerc() {
        return dstMerc;
    }

    /**
     * Define el valor de la propiedad dstMerc.
     * 
     */
    public void setDstMerc(int value) {
        this.dstMerc = value;
    }

}
