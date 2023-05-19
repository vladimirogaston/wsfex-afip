
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
 *         &lt;element name="FEXGetPARAM_CtzResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Ctz" minOccurs="0"/>
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
    "fexGetPARAMCtzResult"
})
@XmlRootElement(name = "FEXGetPARAM_CtzResponse")
public class FEXGetPARAMCtzResponse {

    @XmlElement(name = "FEXGetPARAM_CtzResult")
    protected FEXResponseCtz fexGetPARAMCtzResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMCtzResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseCtz }
     *     
     */
    public FEXResponseCtz getFEXGetPARAMCtzResult() {
        return fexGetPARAMCtzResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMCtzResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseCtz }
     *     
     */
    public void setFEXGetPARAMCtzResult(FEXResponseCtz value) {
        this.fexGetPARAMCtzResult = value;
    }

}
