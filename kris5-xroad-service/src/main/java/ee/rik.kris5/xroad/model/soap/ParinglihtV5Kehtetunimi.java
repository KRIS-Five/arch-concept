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
 * <p>Java class for paringliht_v5_kehtetunimi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paringliht_v5_kehtetunimi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paringliht_v5_kehtetunimi", propOrder = {
    "evnimi",
    "algusKpv",
    "loppKpv"
})
public class ParinglihtV5Kehtetunimi {

    @XmlElement(required = true)
    protected java.lang.String evnimi;
    @XmlElement(name = "algus_kpv", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKpv;
    @XmlElement(name = "lopp_kpv", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKpv;

    /**
     * Gets the value of the evnimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }

    /**
     * Sets the value of the evnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEvnimi(java.lang.String value) {
        this.evnimi = value;
    }

    /**
     * Gets the value of the algusKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgusKpv() {
        return algusKpv;
    }

    /**
     * Sets the value of the algusKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgusKpv(XMLGregorianCalendar value) {
        this.algusKpv = value;
    }

    /**
     * Gets the value of the loppKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoppKpv() {
        return loppKpv;
    }

    /**
     * Sets the value of the loppKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoppKpv(XMLGregorianCalendar value) {
        this.loppKpv = value;
    }

}
