
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cmp_asoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cmp_asoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cbte_tipo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cbte_punto_vta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cbte_cuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cmp_asoc", propOrder = {
    "cbteTipo",
    "cbtePuntoVta",
    "cbteNro",
    "cbteCuit"
})
public class CmpAsoc {

    @XmlElement(name = "Cbte_tipo")
    protected short cbteTipo;
    @XmlElement(name = "Cbte_punto_vta")
    protected int cbtePuntoVta;
    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Cbte_cuit")
    protected long cbteCuit;

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
     * Obtiene el valor de la propiedad cbtePuntoVta.
     * 
     */
    public int getCbtePuntoVta() {
        return cbtePuntoVta;
    }

    /**
     * Define el valor de la propiedad cbtePuntoVta.
     * 
     */
    public void setCbtePuntoVta(int value) {
        this.cbtePuntoVta = value;
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
     * Obtiene el valor de la propiedad cbteCuit.
     * 
     */
    public long getCbteCuit() {
        return cbteCuit;
    }

    /**
     * Define el valor de la propiedad cbteCuit.
     * 
     */
    public void setCbteCuit(long value) {
        this.cbteCuit = value;
    }

}
