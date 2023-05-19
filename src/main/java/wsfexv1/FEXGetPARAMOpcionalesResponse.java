
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
 *         &lt;element name="FEXGetPARAM_OpcionalesResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Opc" minOccurs="0"/>
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
    "fexGetPARAMOpcionalesResult"
})
@XmlRootElement(name = "FEXGetPARAM_OpcionalesResponse")
public class FEXGetPARAMOpcionalesResponse {

    @XmlElement(name = "FEXGetPARAM_OpcionalesResult")
    protected FEXResponseOpc fexGetPARAMOpcionalesResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMOpcionalesResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseOpc }
     *     
     */
    public FEXResponseOpc getFEXGetPARAMOpcionalesResult() {
        return fexGetPARAMOpcionalesResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMOpcionalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseOpc }
     *     
     */
    public void setFEXGetPARAMOpcionalesResult(FEXResponseOpc value) {
        this.fexGetPARAMOpcionalesResult = value;
    }

}
