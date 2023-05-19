
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
 *         &lt;element name="FEXGetPARAM_MONResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Mon" minOccurs="0"/>
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
    "fexGetPARAMMONResult"
})
@XmlRootElement(name = "FEXGetPARAM_MONResponse")
public class FEXGetPARAMMONResponse {

    @XmlElement(name = "FEXGetPARAM_MONResult")
    protected FEXResponseMon fexGetPARAMMONResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMMONResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseMon }
     *     
     */
    public FEXResponseMon getFEXGetPARAMMONResult() {
        return fexGetPARAMMONResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMMONResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseMon }
     *     
     */
    public void setFEXGetPARAMMONResult(FEXResponseMon value) {
        this.fexGetPARAMMONResult = value;
    }

}
