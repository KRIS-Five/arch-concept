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
 * <p>Java class for paringliht_evkapital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paringliht_evkapital"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kapitali_suurus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kapitali_valuuta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paringliht_evkapital", propOrder = {
    "kapitaliSuurus",
    "kapitaliValuuta"
})
public class ParinglihtEvkapital {

    @XmlElement(name = "kapitali_suurus", required = true, nillable = true)
    protected java.lang.String kapitaliSuurus;
    @XmlElement(name = "kapitali_valuuta", required = true, nillable = true)
    protected java.lang.String kapitaliValuuta;

    /**
     * Gets the value of the kapitaliSuurus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKapitaliSuurus() {
        return kapitaliSuurus;
    }

    /**
     * Sets the value of the kapitaliSuurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKapitaliSuurus(java.lang.String value) {
        this.kapitaliSuurus = value;
    }

    /**
     * Gets the value of the kapitaliValuuta property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKapitaliValuuta() {
        return kapitaliValuuta;
    }

    /**
     * Sets the value of the kapitaliValuuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKapitaliValuuta(java.lang.String value) {
        this.kapitaliValuuta = value;
    }

}
