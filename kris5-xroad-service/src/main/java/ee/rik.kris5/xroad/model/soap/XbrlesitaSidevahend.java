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


/**
 * <p>Java class for xbrlesita_sidevahend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xbrlesita_sidevahend"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="liik" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}x_sideliik"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xbrlesita_sidevahend", propOrder = {
    "liik",
    "number"
})
public class XbrlesitaSidevahend {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected XSideliik liik;
    @XmlElement(required = true)
    protected java.lang.String number;

    /**
     * Gets the value of the liik property.
     * 
     * @return
     *     possible object is
     *     {@link XSideliik }
     *     
     */
    public XSideliik getLiik() {
        return liik;
    }

    /**
     * Sets the value of the liik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSideliik }
     *     
     */
    public void setLiik(XSideliik value) {
        this.liik = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNumber(java.lang.String value) {
        this.number = value;
    }

}
