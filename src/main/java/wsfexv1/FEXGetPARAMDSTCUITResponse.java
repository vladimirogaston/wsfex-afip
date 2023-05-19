
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
 *         &lt;element name="FEXGetPARAM_DST_CUITResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_DST_cuit" minOccurs="0"/>
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
    "fexGetPARAMDSTCUITResult"
})
@XmlRootElement(name = "FEXGetPARAM_DST_CUITResponse")
public class FEXGetPARAMDSTCUITResponse {

    @XmlElement(name = "FEXGetPARAM_DST_CUITResult")
    protected FEXResponseDSTCuit fexGetPARAMDSTCUITResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMDSTCUITResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseDSTCuit }
     *     
     */
    public FEXResponseDSTCuit getFEXGetPARAMDSTCUITResult() {
        return fexGetPARAMDSTCUITResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMDSTCUITResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseDSTCuit }
     *     
     */
    public void setFEXGetPARAMDSTCUITResult(FEXResponseDSTCuit value) {
        this.fexGetPARAMDSTCUITResult = value;
    }

}
