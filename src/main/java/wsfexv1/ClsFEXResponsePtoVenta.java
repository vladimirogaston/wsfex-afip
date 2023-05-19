
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXResponse_PtoVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_PtoVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pve_Nro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pve_Bloqueado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pve_FchBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_PtoVenta", propOrder = {
    "pveNro",
    "pveBloqueado",
    "pveFchBaja"
})
public class ClsFEXResponsePtoVenta {

    @XmlElement(name = "Pve_Nro")
    protected int pveNro;
    @XmlElement(name = "Pve_Bloqueado")
    protected String pveBloqueado;
    @XmlElement(name = "Pve_FchBaja")
    protected String pveFchBaja;

    /**
     * Obtiene el valor de la propiedad pveNro.
     * 
     */
    public int getPveNro() {
        return pveNro;
    }

    /**
     * Define el valor de la propiedad pveNro.
     * 
     */
    public void setPveNro(int value) {
        this.pveNro = value;
    }

    /**
     * Obtiene el valor de la propiedad pveBloqueado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPveBloqueado() {
        return pveBloqueado;
    }

    /**
     * Define el valor de la propiedad pveBloqueado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPveBloqueado(String value) {
        this.pveBloqueado = value;
    }

    /**
     * Obtiene el valor de la propiedad pveFchBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPveFchBaja() {
        return pveFchBaja;
    }

    /**
     * Define el valor de la propiedad pveFchBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPveFchBaja(String value) {
        this.pveFchBaja = value;
    }

}
