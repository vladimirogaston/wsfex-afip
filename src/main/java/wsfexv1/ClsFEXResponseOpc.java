
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_Opc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Opc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Opc_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Opc_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opc_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opc_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Opc", propOrder = {
    "opcId",
    "opcDs",
    "opcVigDesde",
    "opcVigHasta"
})
public class ClsFEXResponseOpc {

    @XmlElement(name = "Opc_Id")
    protected short opcId;
    @XmlElement(name = "Opc_Ds")
    protected String opcDs;
    @XmlElement(name = "Opc_vig_desde")
    protected String opcVigDesde;
    @XmlElement(name = "Opc_vig_hasta")
    protected String opcVigHasta;

    /**
     * Obtiene el valor de la propiedad opcId.
     * 
     */
    public short getOpcId() {
        return opcId;
    }

    /**
     * Define el valor de la propiedad opcId.
     * 
     */
    public void setOpcId(short value) {
        this.opcId = value;
    }

    /**
     * Obtiene el valor de la propiedad opcDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcDs() {
        return opcDs;
    }

    /**
     * Define el valor de la propiedad opcDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcDs(String value) {
        this.opcDs = value;
    }

    /**
     * Obtiene el valor de la propiedad opcVigDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcVigDesde() {
        return opcVigDesde;
    }

    /**
     * Define el valor de la propiedad opcVigDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcVigDesde(String value) {
        this.opcVigDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad opcVigHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcVigHasta() {
        return opcVigHasta;
    }

    /**
     * Define el valor de la propiedad opcVigHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcVigHasta(String value) {
        this.opcVigHasta = value;
    }

}
