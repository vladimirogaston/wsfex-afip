
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
 *         &lt;element name="FEXGetPARAM_DST_paisResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_DST_pais" minOccurs="0"/>
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
    "fexGetPARAMDSTPaisResult"
})
@XmlRootElement(name = "FEXGetPARAM_DST_paisResponse")
public class FEXGetPARAMDSTPaisResponse {

    @XmlElement(name = "FEXGetPARAM_DST_paisResult")
    protected FEXResponseDSTPais fexGetPARAMDSTPaisResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMDSTPaisResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseDSTPais }
     *     
     */
    public FEXResponseDSTPais getFEXGetPARAMDSTPaisResult() {
        return fexGetPARAMDSTPaisResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMDSTPaisResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseDSTPais }
     *     
     */
    public void setFEXGetPARAMDSTPaisResult(FEXResponseDSTPais value) {
        this.fexGetPARAMDSTPaisResult = value;
    }

}
