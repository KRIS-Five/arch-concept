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
 * <p>Java class for fie_seisundType_v4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fie_seisundType_v4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tegevus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="elemtyyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alguskpv" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="loppkpv" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="periood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fie_seisundType_v4", propOrder = {
    "tegevus",
    "elemtyyp",
    "alguskpv",
    "loppkpv",
    "periood"
})
public class FieSeisundTypeV4 {

    @XmlElement(required = true)
    protected java.lang.String tegevus;
    @XmlElement(required = true)
    protected java.lang.String elemtyyp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar alguskpv;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppkpv;
    @XmlElement(required = true)
    protected java.lang.String periood;

    /**
     * Gets the value of the tegevus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }

    /**
     * Sets the value of the tegevus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTegevus(java.lang.String value) {
        this.tegevus = value;
    }

    /**
     * Gets the value of the elemtyyp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getElemtyyp() {
        return elemtyyp;
    }

    /**
     * Sets the value of the elemtyyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setElemtyyp(java.lang.String value) {
        this.elemtyyp = value;
    }

    /**
     * Gets the value of the alguskpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlguskpv() {
        return alguskpv;
    }

    /**
     * Sets the value of the alguskpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlguskpv(XMLGregorianCalendar value) {
        this.alguskpv = value;
    }

    /**
     * Gets the value of the loppkpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoppkpv() {
        return loppkpv;
    }

    /**
     * Sets the value of the loppkpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoppkpv(XMLGregorianCalendar value) {
        this.loppkpv = value;
    }

    /**
     * Gets the value of the periood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPeriood() {
        return periood;
    }

    /**
     * Sets the value of the periood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPeriood(java.lang.String value) {
        this.periood = value;
    }

}