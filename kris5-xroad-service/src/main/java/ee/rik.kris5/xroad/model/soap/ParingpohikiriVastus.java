//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paringpohikiri_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paringpohikiri_vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sisu" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paringpohikiri_vastus", propOrder = {
    "kuupaev",
    "sisu"
})
public class ParingpohikiriVastus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kuupaev;
    @XmlElement(required = true)
    protected byte[] sisu;

    /**
     * Gets the value of the kuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKuupaev() {
        return kuupaev;
    }

    /**
     * Sets the value of the kuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKuupaev(XMLGregorianCalendar value) {
        this.kuupaev = value;
    }

    /**
     * Gets the value of the sisu property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSisu() {
        return sisu;
    }

    /**
     * Sets the value of the sisu property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSisu(byte[] value) {
        this.sisu = value;
    }

}
