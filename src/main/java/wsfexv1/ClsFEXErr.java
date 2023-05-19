
package wsfexv1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClsFEXErr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXErr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXErr", propOrder = {
    "errCode",
    "errMsg"
})
public class ClsFEXErr {

    @XmlElement(name = "ErrCode")
    protected int errCode;
    @XmlElement(name = "ErrMsg")
    protected String errMsg;

    /**
     * Obtiene el valor de la propiedad errCode.
     * 
     */
    public int getErrCode() {
        return errCode;
    }

    /**
     * Define el valor de la propiedad errCode.
     * 
     */
    public void setErrCode(int value) {
        this.errCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Define el valor de la propiedad errMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

}
