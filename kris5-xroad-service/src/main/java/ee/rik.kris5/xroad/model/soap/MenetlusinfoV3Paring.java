//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for menetlusinfo_v3_paring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="menetlusinfo_v3_paring"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notar_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notar_isikukood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="algus_kuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lopp_kuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menetlusinfo_v3_paring", propOrder = {
    "notarId",
    "notarIsikukood",
    "algusKuupaev",
    "loppKuupaev"
})
public class MenetlusinfoV3Paring {

    @XmlElementRef(name = "notar_id", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> notarId;
    @XmlElementRef(name = "notar_isikukood", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> notarIsikukood;
    @XmlElement(name = "algus_kuupaev", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKuupaev;
    @XmlElement(name = "lopp_kuupaev", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKuupaev;

    /**
     * Gets the value of the notarId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNotarId() {
        return notarId;
    }

    /**
     * Sets the value of the notarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNotarId(JAXBElement<java.lang.String> value) {
        this.notarId = value;
    }

    /**
     * Gets the value of the notarIsikukood property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNotarIsikukood() {
        return notarIsikukood;
    }

    /**
     * Sets the value of the notarIsikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNotarIsikukood(JAXBElement<java.lang.String> value) {
        this.notarIsikukood = value;
    }

    /**
     * Gets the value of the algusKuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgusKuupaev() {
        return algusKuupaev;
    }

    /**
     * Sets the value of the algusKuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgusKuupaev(XMLGregorianCalendar value) {
        this.algusKuupaev = value;
    }

    /**
     * Gets the value of the loppKuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoppKuupaev() {
        return loppKuupaev;
    }

    /**
     * Sets the value of the loppKuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoppKuupaev(XMLGregorianCalendar value) {
        this.loppKuupaev = value;
    }

}
