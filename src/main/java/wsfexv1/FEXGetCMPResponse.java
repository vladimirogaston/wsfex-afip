
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
 *         &lt;element name="FEXGetCMPResult" type="{http://ar.gov.afip.dif.fexv1/}FEXGetCMPResponse" minOccurs="0"/>
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
    "fexGetCMPResult"
})
@XmlRootElement(name = "FEXGetCMPResponse")
public class FEXGetCMPResponse {

    @XmlElement(name = "FEXGetCMPResult")
    protected FEXGetCMPResponse2 fexGetCMPResult;

    /**
     * Obtiene el valor de la propiedad fexGetCMPResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXGetCMPResponse2 }
     *     
     */
    public FEXGetCMPResponse2 getFEXGetCMPResult() {
        return fexGetCMPResult;
    }

    /**
     * Define el valor de la propiedad fexGetCMPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXGetCMPResponse2 }
     *     
     */
    public void setFEXGetCMPResult(FEXGetCMPResponse2 value) {
        this.fexGetCMPResult = value;
    }

}
