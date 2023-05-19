
package wsfexv1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCmp_asoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCmp_asoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cmp_asoc" type="{http://ar.gov.afip.dif.fexv1/}Cmp_asoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCmp_asoc", propOrder = {
    "cmpAsoc"
})
public class ArrayOfCmpAsoc {

    @XmlElement(name = "Cmp_asoc", nillable = true)
    protected List<CmpAsoc> cmpAsoc;

    /**
     * Gets the value of the cmpAsoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmpAsoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpAsoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmpAsoc }
     * 
     * 
     */
    public List<CmpAsoc> getCmpAsoc() {
        if (cmpAsoc == null) {
            cmpAsoc = new ArrayList<CmpAsoc>();
        }
        return this.cmpAsoc;
    }

}
