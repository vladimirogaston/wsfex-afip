
package wsfexv1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsFEXResponse_UMed complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsFEXResponse_UMed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsFEXResponse_UMed" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXResponse_UMed" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsFEXResponse_UMed", propOrder = {
    "clsFEXResponseUMed"
})
public class ArrayOfClsFEXResponseUMed {

    @XmlElement(name = "ClsFEXResponse_UMed", nillable = true)
    protected List<ClsFEXResponseUMed> clsFEXResponseUMed;

    /**
     * Gets the value of the clsFEXResponseUMed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsFEXResponseUMed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsFEXResponseUMed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsFEXResponseUMed }
     * 
     * 
     */
    public List<ClsFEXResponseUMed> getClsFEXResponseUMed() {
        if (clsFEXResponseUMed == null) {
            clsFEXResponseUMed = new ArrayList<ClsFEXResponseUMed>();
        }
        return this.clsFEXResponseUMed;
    }

}
