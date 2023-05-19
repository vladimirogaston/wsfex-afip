
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
 *         &lt;element name="FEXGetPARAM_Cbte_TipoResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Cbte_Tipo" minOccurs="0"/>
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
    "fexGetPARAMCbteTipoResult"
})
@XmlRootElement(name = "FEXGetPARAM_Cbte_TipoResponse")
public class FEXGetPARAMCbteTipoResponse {

    @XmlElement(name = "FEXGetPARAM_Cbte_TipoResult")
    protected FEXResponseCbteTipo fexGetPARAMCbteTipoResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMCbteTipoResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseCbteTipo }
     *     
     */
    public FEXResponseCbteTipo getFEXGetPARAMCbteTipoResult() {
        return fexGetPARAMCbteTipoResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMCbteTipoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseCbteTipo }
     *     
     */
    public void setFEXGetPARAMCbteTipoResult(FEXResponseCbteTipo value) {
        this.fexGetPARAMCbteTipoResult = value;
    }

}
