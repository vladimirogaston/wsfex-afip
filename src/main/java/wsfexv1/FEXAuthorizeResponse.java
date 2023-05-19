
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
 *         &lt;element name="FEXAuthorizeResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponseAuthorize" minOccurs="0"/>
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
    "fexAuthorizeResult"
})
@XmlRootElement(name = "FEXAuthorizeResponse")
public class FEXAuthorizeResponse {

    @XmlElement(name = "FEXAuthorizeResult")
    protected FEXResponseAuthorize fexAuthorizeResult;

    /**
     * Obtiene el valor de la propiedad fexAuthorizeResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseAuthorize }
     *     
     */
    public FEXResponseAuthorize getFEXAuthorizeResult() {
        return fexAuthorizeResult;
    }

    /**
     * Define el valor de la propiedad fexAuthorizeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseAuthorize }
     *     
     */
    public void setFEXAuthorizeResult(FEXResponseAuthorize value) {
        this.fexAuthorizeResult = value;
    }

}
