
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
 *         &lt;element name="FEXDummyResult" type="{http://ar.gov.afip.dif.fexv1/}DummyResponse" minOccurs="0"/>
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
    "fexDummyResult"
})
@XmlRootElement(name = "FEXDummyResponse")
public class FEXDummyResponse {

    @XmlElement(name = "FEXDummyResult")
    protected DummyResponse fexDummyResult;

    /**
     * Obtiene el valor de la propiedad fexDummyResult.
     * 
     * @return
     *     possible object is
     *     {@link DummyResponse }
     *     
     */
    public DummyResponse getFEXDummyResult() {
        return fexDummyResult;
    }

    /**
     * Define el valor de la propiedad fexDummyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DummyResponse }
     *     
     */
    public void setFEXDummyResult(DummyResponse value) {
        this.fexDummyResult = value;
    }

}
