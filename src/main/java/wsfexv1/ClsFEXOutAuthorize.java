
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXOutAuthorize complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXOutAuthorize">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cbte_tipo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Punto_vta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fch_venc_Cae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fch_cbte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reproceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Motivos_Obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXOutAuthorize", propOrder = {
    "id",
    "cuit",
    "cbteTipo",
    "puntoVta",
    "cbteNro",
    "cae",
    "fchVencCae",
    "fchCbte",
    "resultado",
    "reproceso",
    "motivosObs"
})
public class ClsFEXOutAuthorize {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Cuit")
    protected long cuit;
    @XmlElement(name = "Cbte_tipo")
    protected short cbteTipo;
    @XmlElement(name = "Punto_vta")
    protected int puntoVta;
    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Cae")
    protected String cae;
    @XmlElement(name = "Fch_venc_Cae")
    protected String fchVencCae;
    @XmlElement(name = "Fch_cbte")
    protected String fchCbte;
    @XmlElement(name = "Resultado")
    protected String resultado;
    @XmlElement(name = "Reproceso")
    protected String reproceso;
    @XmlElement(name = "Motivos_Obs")
    protected String motivosObs;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad cuit.
     * 
     */
    public long getCuit() {
        return cuit;
    }

    /**
     * Define el valor de la propiedad cuit.
     * 
     */
    public void setCuit(long value) {
        this.cuit = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteTipo.
     * 
     */
    public short getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Define el valor de la propiedad cbteTipo.
     * 
     */
    public void setCbteTipo(short value) {
        this.cbteTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoVta.
     * 
     */
    public int getPuntoVta() {
        return puntoVta;
    }

    /**
     * Define el valor de la propiedad puntoVta.
     * 
     */
    public void setPuntoVta(int value) {
        this.puntoVta = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteNro.
     * 
     */
    public long getCbteNro() {
        return cbteNro;
    }

    /**
     * Define el valor de la propiedad cbteNro.
     * 
     */
    public void setCbteNro(long value) {
        this.cbteNro = value;
    }

    /**
     * Obtiene el valor de la propiedad cae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCae() {
        return cae;
    }

    /**
     * Define el valor de la propiedad cae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCae(String value) {
        this.cae = value;
    }

    /**
     * Obtiene el valor de la propiedad fchVencCae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchVencCae() {
        return fchVencCae;
    }

    /**
     * Define el valor de la propiedad fchVencCae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchVencCae(String value) {
        this.fchVencCae = value;
    }

    /**
     * Obtiene el valor de la propiedad fchCbte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchCbte() {
        return fchCbte;
    }

    /**
     * Define el valor de la propiedad fchCbte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchCbte(String value) {
        this.fchCbte = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad reproceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReproceso() {
        return reproceso;
    }

    /**
     * Define el valor de la propiedad reproceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReproceso(String value) {
        this.reproceso = value;
    }

    /**
     * Obtiene el valor de la propiedad motivosObs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivosObs() {
        return motivosObs;
    }

    /**
     * Define el valor de la propiedad motivosObs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivosObs(String value) {
        this.motivosObs = value;
    }

}
