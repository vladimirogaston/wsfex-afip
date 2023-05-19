
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
 *         &lt;element name="FEXGetPARAM_MON_CON_COTIZACIONResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Mon_CON_COTIZACION" minOccurs="0"/>
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
    "fexGetPARAMMONCONCOTIZACIONResult"
})
@XmlRootElement(name = "FEXGetPARAM_MON_CON_COTIZACIONResponse")
public class FEXGetPARAMMONCONCOTIZACIONResponse {

    @XmlElement(name = "FEXGetPARAM_MON_CON_COTIZACIONResult")
    protected FEXResponseMonCONCOTIZACION fexGetPARAMMONCONCOTIZACIONResult;

    /**
     * Obtiene el valor de la propiedad fexGetPARAMMONCONCOTIZACIONResult.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseMonCONCOTIZACION }
     *     
     */
    public FEXResponseMonCONCOTIZACION getFEXGetPARAMMONCONCOTIZACIONResult() {
        return fexGetPARAMMONCONCOTIZACIONResult;
    }

    /**
     * Define el valor de la propiedad fexGetPARAMMONCONCOTIZACIONResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseMonCONCOTIZACION }
     *     
     */
    public void setFEXGetPARAMMONCONCOTIZACIONResult(FEXResponseMonCONCOTIZACION value) {
        this.fexGetPARAMMONCONCOTIZACIONResult = value;
    }

}
