
package wsfexv1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Item complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pro_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pro_ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pro_qty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Pro_umed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pro_precio_uni" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Pro_bonificacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Pro_total_item" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "proCodigo",
    "proDs",
    "proQty",
    "proUmed",
    "proPrecioUni",
    "proBonificacion",
    "proTotalItem"
})
public class Item {

    @XmlElement(name = "Pro_codigo")
    protected String proCodigo;
    @XmlElement(name = "Pro_ds")
    protected String proDs;
    @XmlElement(name = "Pro_qty", required = true)
    protected BigDecimal proQty;
    @XmlElement(name = "Pro_umed")
    protected int proUmed;
    @XmlElement(name = "Pro_precio_uni", required = true)
    protected BigDecimal proPrecioUni;
    @XmlElement(name = "Pro_bonificacion", required = true)
    protected BigDecimal proBonificacion;
    @XmlElement(name = "Pro_total_item", required = true)
    protected BigDecimal proTotalItem;

    /**
     * Obtiene el valor de la propiedad proCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCodigo() {
        return proCodigo;
    }

    /**
     * Define el valor de la propiedad proCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCodigo(String value) {
        this.proCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad proDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProDs() {
        return proDs;
    }

    /**
     * Define el valor de la propiedad proDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProDs(String value) {
        this.proDs = value;
    }

    /**
     * Obtiene el valor de la propiedad proQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProQty() {
        return proQty;
    }

    /**
     * Define el valor de la propiedad proQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProQty(BigDecimal value) {
        this.proQty = value;
    }

    /**
     * Obtiene el valor de la propiedad proUmed.
     * 
     */
    public int getProUmed() {
        return proUmed;
    }

    /**
     * Define el valor de la propiedad proUmed.
     * 
     */
    public void setProUmed(int value) {
        this.proUmed = value;
    }

    /**
     * Obtiene el valor de la propiedad proPrecioUni.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProPrecioUni() {
        return proPrecioUni;
    }

    /**
     * Define el valor de la propiedad proPrecioUni.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProPrecioUni(BigDecimal value) {
        this.proPrecioUni = value;
    }

    /**
     * Obtiene el valor de la propiedad proBonificacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProBonificacion() {
        return proBonificacion;
    }

    /**
     * Define el valor de la propiedad proBonificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProBonificacion(BigDecimal value) {
        this.proBonificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad proTotalItem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProTotalItem() {
        return proTotalItem;
    }

    /**
     * Define el valor de la propiedad proTotalItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProTotalItem(BigDecimal value) {
        this.proTotalItem = value;
    }

}
