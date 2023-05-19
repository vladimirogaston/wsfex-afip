
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
 *         &lt;element name="FEXGetLast_IDResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_LastID" minOccurs="0"/>
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
    "fexGetLastIDResult"
})
@XmlRootElement(name = "FEXGetLast_IDResponse")
public class FEXGetLastIDResponse {

    @XmlElement(name = "FEXGetLast_IDResult")
    protected FEXResponseLastID fexGetLastIDResult;

    /**
     * Obtiene el valor de la propiedad fexGetLastIDResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseLastID }
     *     
     */
    public FEXResponseLastID getFEXGetLastIDResult() {
        return fexGetLastIDResult;
    }

    /**
     * Define el valor de la propiedad fexGetLastIDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseLastID }
     *     
     */
    public void setFEXGetLastIDResult(FEXResponseLastID value) {
        this.fexGetLastIDResult = value;
    }

}
