
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
 *         &lt;element name="FEXGetLast_CMPResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponseLast_CMP" minOccurs="0"/>
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
    "fexGetLastCMPResult"
})
@XmlRootElement(name = "FEXGetLast_CMPResponse")
public class FEXGetLastCMPResponse {

    @XmlElement(name = "FEXGetLast_CMPResult")
    protected FEXResponseLastCMP fexGetLastCMPResult;

    /**
     * Obtiene el valor de la propiedad fexGetLastCMPResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseLastCMP }
     *     
     */
    public FEXResponseLastCMP getFEXGetLastCMPResult() {
        return fexGetLastCMPResult;
    }

    /**
     * Define el valor de la propiedad fexGetLastCMPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseLastCMP }
     *     
     */
    public void setFEXGetLastCMPResult(FEXResponseLastCMP value) {
        this.fexGetLastCMPResult = value;
    }

}
