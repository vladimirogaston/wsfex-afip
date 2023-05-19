
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
 *         &lt;element name="FEXCheck_PermisoResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_CheckPermiso" minOccurs="0"/>
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
    "fexCheckPermisoResult"
})
@XmlRootElement(name = "FEXCheck_PermisoResponse")
public class FEXCheckPermisoResponse {

    @XmlElement(name = "FEXCheck_PermisoResult")
    protected FEXResponseCheckPermiso fexCheckPermisoResult;

    /**
     * Obtiene el valor de la propiedad fexCheckPermisoResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseCheckPermiso }
     *     
     */
    public FEXResponseCheckPermiso getFEXCheckPermisoResult() {
        return fexCheckPermisoResult;
    }

    /**
     * Define el valor de la propiedad fexCheckPermisoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseCheckPermiso }
     *     
     */
    public void setFEXCheckPermisoResult(FEXResponseCheckPermiso value) {
        this.fexCheckPermisoResult = value;
    }

}
