//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riigiloivType_v4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riigiloivType_v4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="summa" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="valuuta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="viitenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selgitus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riigiloivType_v4", propOrder = {
    "summa",
    "valuuta",
    "viitenumber",
    "selgitus"
})
public class RiigiloivTypeV4 {

    @XmlElement(required = true)
    protected BigDecimal summa;
    @XmlElement(required = true)
    protected java.lang.String valuuta;
    protected java.lang.String viitenumber;
    @XmlElement(required = true)
    protected java.lang.String selgitus;

    /**
     * Gets the value of the summa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumma() {
        return summa;
    }

    /**
     * Sets the value of the summa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumma(BigDecimal value) {
        this.summa = value;
    }

    /**
     * Gets the value of the valuuta property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValuuta() {
        return valuuta;
    }

    /**
     * Sets the value of the valuuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValuuta(java.lang.String value) {
        this.valuuta = value;
    }

    /**
     * Gets the value of the viitenumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getViitenumber() {
        return viitenumber;
    }

    /**
     * Sets the value of the viitenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setViitenumber(java.lang.String value) {
        this.viitenumber = value;
    }

    /**
     * Gets the value of the selgitus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSelgitus() {
        return selgitus;
    }

    /**
     * Sets the value of the selgitus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSelgitus(java.lang.String value) {
        this.selgitus = value;
    }

}
