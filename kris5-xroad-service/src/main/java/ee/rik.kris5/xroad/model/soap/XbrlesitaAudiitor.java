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
 * <p>Java class for xbrlesita_audiitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xbrlesita_audiitor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="audiitorettevotja_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="auditit_kpv" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xbrlesita_audiitor", propOrder = {
    "isikukood",
    "audiitorettevotjaKood",
    "audititKpv"
})
public class XbrlesitaAudiitor {

    @XmlElement(required = true, nillable = true)
    protected java.lang.String isikukood;
    @XmlElement(name = "audiitorettevotja_kood", required = true, nillable = true)
    protected java.lang.String audiitorettevotjaKood;
    @XmlElement(name = "auditit_kpv", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar audititKpv;

    /**
     * Gets the value of the isikukood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }

    /**
     * Sets the value of the isikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikukood(java.lang.String value) {
        this.isikukood = value;
    }

    /**
     * Gets the value of the audiitorettevotjaKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudiitorettevotjaKood() {
        return audiitorettevotjaKood;
    }

    /**
     * Sets the value of the audiitorettevotjaKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudiitorettevotjaKood(java.lang.String value) {
        this.audiitorettevotjaKood = value;
    }

    /**
     * Gets the value of the audititKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAudititKpv() {
        return audititKpv;
    }

    /**
     * Sets the value of the audititKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAudititKpv(XMLGregorianCalendar value) {
        this.audititKpv = value;
    }

}
