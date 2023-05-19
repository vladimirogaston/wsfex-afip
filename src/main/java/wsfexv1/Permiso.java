
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Permiso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Permiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_permiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Permiso", propOrder = {
    "idPermiso",
    "dstMerc"
})
public class Permiso {

    @XmlElement(name = "Id_permiso")
    protected String idPermiso;
    @XmlElement(name = "Dst_merc")
    protected int dstMerc;

    /**
     * Obtiene el valor de la propiedad idPermiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPermiso() {
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
    public void setIdPermiso(String value) {
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
