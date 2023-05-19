
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
 *         &lt;element name="FEXGetPARAM_PtoVentaResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_PtoVenta" minOccurs="0"/>
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
    "fexGetPARAMPtoVentaResult"
})
@XmlRootElement(name = "FEXGetPARAM_PtoVentaResponse")
public class FEXGetPARAMPtoVentaResponse {

    @XmlElement(name = "FEXGetPARAM_PtoVentaResult")
    protected FEXResponsePtoVenta fexGetPARAMPtoVentaResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMPtoVentaResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponsePtoVenta }
     *     
     */
    public FEXResponsePtoVenta getFEXGetPARAMPtoVentaResult() {
        return fexGetPARAMPtoVentaResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMPtoVentaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponsePtoVenta }
     *     
     */
    public void setFEXGetPARAMPtoVentaResult(FEXResponsePtoVenta value) {
        this.fexGetPARAMPtoVentaResult = value;
    }

}
