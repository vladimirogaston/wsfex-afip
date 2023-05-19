
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
 *         &lt;element name="FEXGetPARAM_IncotermsResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Inc" minOccurs="0"/>
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
    "fexGetPARAMIncotermsResult"
})
@XmlRootElement(name = "FEXGetPARAM_IncotermsResponse")
public class FEXGetPARAMIncotermsResponse {

    @XmlElement(name = "FEXGetPARAM_IncotermsResult")
    protected FEXResponseInc fexGetPARAMIncotermsResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMIncotermsResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseInc }
     *     
     */
    public FEXResponseInc getFEXGetPARAMIncotermsResult() {
        return fexGetPARAMIncotermsResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMIncotermsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseInc }
     *     
     */
    public void setFEXGetPARAMIncotermsResult(FEXResponseInc value) {
        this.fexGetPARAMIncotermsResult = value;
    }

}
