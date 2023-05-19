
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
 *         &lt;element name="FEXGetPARAM_UMedResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Umed" minOccurs="0"/>
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
    "fexGetPARAMUMedResult"
})
@XmlRootElement(name = "FEXGetPARAM_UMedResponse")
public class FEXGetPARAMUMedResponse {

    @XmlElement(name = "FEXGetPARAM_UMedResult")
    protected FEXResponseUmed fexGetPARAMUMedResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMUMedResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseUmed }
     *     
     */
    public FEXResponseUmed getFEXGetPARAMUMedResult() {
        return fexGetPARAMUMedResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMUMedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseUmed }
     *     
     */
    public void setFEXGetPARAMUMedResult(FEXResponseUmed value) {
        this.fexGetPARAMUMedResult = value;
    }

}
