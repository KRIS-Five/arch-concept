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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sidevahendType_v3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sidevahendType_v3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sidevahendi_liik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sidevahendi_number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sidevahendType_v3", propOrder = {
    "sidevahendiLiik",
    "sidevahendiNumber"
})
public class SidevahendTypeV3 {

    @XmlElement(name = "sidevahendi_liik", required = true)
    protected java.lang.String sidevahendiLiik;
    @XmlElement(name = "sidevahendi_number", required = true)
    protected java.lang.String sidevahendiNumber;

    /**
     * Gets the value of the sidevahendiLiik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSidevahendiLiik() {
        return sidevahendiLiik;
    }

    /**
     * Sets the value of the sidevahendiLiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSidevahendiLiik(java.lang.String value) {
        this.sidevahendiLiik = value;
    }

    /**
     * Gets the value of the sidevahendiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSidevahendiNumber() {
        return sidevahendiNumber;
    }

    /**
     * Sets the value of the sidevahendiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSidevahendiNumber(java.lang.String value) {
        this.sidevahendiNumber = value;
    }

}
