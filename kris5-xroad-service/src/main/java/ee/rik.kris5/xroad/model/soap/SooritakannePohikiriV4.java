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
 * <p>Java class for sooritakanne_pohikiri_v4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sooritakanne_pohikiri_v4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kinnitamise_aeg" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="pohikirja_tyyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sisu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sooritakanne_pohikiri_v4", propOrder = {
    "kinnitamiseAeg",
    "pohikirjaTyyp",
    "sisu"
})
public class SooritakannePohikiriV4 {

    @XmlElement(name = "kinnitamise_aeg", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kinnitamiseAeg;
    @XmlElement(name = "pohikirja_tyyp")
    protected java.lang.String pohikirjaTyyp;
    protected java.lang.String sisu;

    /**
     * Gets the value of the kinnitamiseAeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKinnitamiseAeg() {
        return kinnitamiseAeg;
    }

    /**
     * Sets the value of the kinnitamiseAeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKinnitamiseAeg(XMLGregorianCalendar value) {
        this.kinnitamiseAeg = value;
    }

    /**
     * Gets the value of the pohikirjaTyyp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPohikirjaTyyp() {
        return pohikirjaTyyp;
    }

    /**
     * Sets the value of the pohikirjaTyyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPohikirjaTyyp(java.lang.String value) {
        this.pohikirjaTyyp = value;
    }

    /**
     * Gets the value of the sisu property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSisu() {
        return sisu;
    }

    /**
     * Sets the value of the sisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSisu(java.lang.String value) {
        this.sisu = value;
    }

}
