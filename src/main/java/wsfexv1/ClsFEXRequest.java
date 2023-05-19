
package wsfexv1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Fecha_cbte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cbte_Tipo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Punto_vta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Tipo_expo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Permiso_existente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permisos" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfPermiso" minOccurs="0"/>
 *         &lt;element name="Dst_cmp" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cuit_pais_cliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Domicilio_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_impositivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moneda_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moneda_ctz" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Obs_comerciales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imp_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cmps_asoc" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfCmp_asoc" minOccurs="0"/>
 *         &lt;element name="Forma_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoterms_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idioma_cbte" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Items" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfItem" minOccurs="0"/>
 *         &lt;element name="Opcionales" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfOpcional" minOccurs="0"/>
 *         &lt;element name="Fecha_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXRequest", propOrder = {
    "id",
    "fechaCbte",
    "cbteTipo",
    "puntoVta",
    "cbteNro",
    "tipoExpo",
    "permisoExistente",
    "permisos",
    "dstCmp",
    "cliente",
    "cuitPaisCliente",
    "domicilioCliente",
    "idImpositivo",
    "monedaId",
    "monedaCtz",
    "obsComerciales",
    "impTotal",
    "obs",
    "cmpsAsoc",
    "formaPago",
    "incoterms",
    "incotermsDs",
    "idiomaCbte",
    "items",
    "opcionales",
    "fechaPago"
})
public class ClsFEXRequest {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Fecha_cbte")
    protected String fechaCbte;
    @XmlElement(name = "Cbte_Tipo")
    protected short cbteTipo;
    @XmlElement(name = "Punto_vta")
    protected int puntoVta;
    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Tipo_expo")
    protected short tipoExpo;
    @XmlElement(name = "Permiso_existente")
    protected String permisoExistente;
    @XmlElement(name = "Permisos")
    protected ArrayOfPermiso permisos;
    @XmlElement(name = "Dst_cmp")
    protected short dstCmp;
    @XmlElement(name = "Cliente")
    protected String cliente;
    @XmlElement(name = "Cuit_pais_cliente")
    protected long cuitPaisCliente;
    @XmlElement(name = "Domicilio_cliente")
    protected String domicilioCliente;
    @XmlElement(name = "Id_impositivo")
    protected String idImpositivo;
    @XmlElement(name = "Moneda_Id")
    protected String monedaId;
    @XmlElement(name = "Moneda_ctz", required = true)
    protected BigDecimal monedaCtz;
    @XmlElement(name = "Obs_comerciales")
    protected String obsComerciales;
    @XmlElement(name = "Imp_total", required = true)
    protected BigDecimal impTotal;
    @XmlElement(name = "Obs")
    protected String obs;
    @XmlElement(name = "Cmps_asoc")
    protected ArrayOfCmpAsoc cmpsAsoc;
    @XmlElement(name = "Forma_pago")
    protected String formaPago;
    @XmlElement(name = "Incoterms")
    protected String incoterms;
    @XmlElement(name = "Incoterms_Ds")
    protected String incotermsDs;
    @XmlElement(name = "Idioma_cbte")
    protected short idiomaCbte;
    @XmlElement(name = "Items")
    protected ArrayOfItem items;
    @XmlElement(name = "Opcionales")
    protected ArrayOfOpcional opcionales;
    @XmlElement(name = "Fecha_pago")
    protected String fechaPago;

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
     * Obtiene el valor de la propiedad fechaCbte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCbte() {
        return fechaCbte;
    }

    /**
     * Define el valor de la propiedad fechaCbte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCbte(String value) {
        this.fechaCbte = value;
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
     * Obtiene el valor de la propiedad tipoExpo.
     * 
     */
    public short getTipoExpo() {
        return tipoExpo;
    }

    /**
     * Define el valor de la propiedad tipoExpo.
     * 
     */
    public void setTipoExpo(short value) {
        this.tipoExpo = value;
    }

    /**
     * Obtiene el valor de la propiedad permisoExistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermisoExistente() {
        return permisoExistente;
    }

    /**
     * Define el valor de la propiedad permisoExistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermisoExistente(String value) {
        this.permisoExistente = value;
    }

    /**
     * Obtiene el valor de la propiedad permisos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPermiso }
     *     
     */
    public ArrayOfPermiso getPermisos() {
        return permisos;
    }

    /**
     * Define el valor de la propiedad permisos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPermiso }
     *     
     */
    public void setPermisos(ArrayOfPermiso value) {
        this.permisos = value;
    }

    /**
     * Obtiene el valor de la propiedad dstCmp.
     * 
     */
    public short getDstCmp() {
        return dstCmp;
    }

    /**
     * Define el valor de la propiedad dstCmp.
     * 
     */
    public void setDstCmp(short value) {
        this.dstCmp = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad cuitPaisCliente.
     * 
     */
    public long getCuitPaisCliente() {
        return cuitPaisCliente;
    }

    /**
     * Define el valor de la propiedad cuitPaisCliente.
     * 
     */
    public void setCuitPaisCliente(long value) {
        this.cuitPaisCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioCliente() {
        return domicilioCliente;
    }

    /**
     * Define el valor de la propiedad domicilioCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioCliente(String value) {
        this.domicilioCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdImpositivo() {
        return idImpositivo;
    }

    /**
     * Define el valor de la propiedad idImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdImpositivo(String value) {
        this.idImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaId() {
        return monedaId;
    }

    /**
     * Define el valor de la propiedad monedaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaId(String value) {
        this.monedaId = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaCtz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonedaCtz() {
        return monedaCtz;
    }

    /**
     * Define el valor de la propiedad monedaCtz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonedaCtz(BigDecimal value) {
        this.monedaCtz = value;
    }

    /**
     * Obtiene el valor de la propiedad obsComerciales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsComerciales() {
        return obsComerciales;
    }

    /**
     * Define el valor de la propiedad obsComerciales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsComerciales(String value) {
        this.obsComerciales = value;
    }

    /**
     * Obtiene el valor de la propiedad impTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpTotal() {
        return impTotal;
    }

    /**
     * Define el valor de la propiedad impTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpTotal(BigDecimal value) {
        this.impTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad obs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Define el valor de la propiedad obs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

    /**
     * Obtiene el valor de la propiedad cmpsAsoc.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCmpAsoc }
     *     
     */
    public ArrayOfCmpAsoc getCmpsAsoc() {
        return cmpsAsoc;
    }

    /**
     * Define el valor de la propiedad cmpsAsoc.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCmpAsoc }
     *     
     */
    public void setCmpsAsoc(ArrayOfCmpAsoc value) {
        this.cmpsAsoc = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad incoterms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms() {
        return incoterms;
    }

    /**
     * Define el valor de la propiedad incoterms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms(String value) {
        this.incoterms = value;
    }

    /**
     * Obtiene el valor de la propiedad incotermsDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsDs() {
        return incotermsDs;
    }

    /**
     * Define el valor de la propiedad incotermsDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsDs(String value) {
        this.incotermsDs = value;
    }

    /**
     * Obtiene el valor de la propiedad idiomaCbte.
     * 
     */
    public short getIdiomaCbte() {
        return idiomaCbte;
    }

    /**
     * Define el valor de la propiedad idiomaCbte.
     * 
     */
    public void setIdiomaCbte(short value) {
        this.idiomaCbte = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setItems(ArrayOfItem value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOpcional }
     *     
     */
    public ArrayOfOpcional getOpcionales() {
        return opcionales;
    }

    /**
     * Define el valor de la propiedad opcionales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOpcional }
     *     
     */
    public void setOpcionales(ArrayOfOpcional value) {
        this.opcionales = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

}
