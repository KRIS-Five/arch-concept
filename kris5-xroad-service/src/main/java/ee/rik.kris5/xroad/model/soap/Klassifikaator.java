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
 * <p>Java class for klassifikaator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="klassifikaator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="klassifikaatori_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="klassifikaatori_nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="klassifikaatori_vaartused" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}klassifikaatori_vaartused"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "klassifikaator", propOrder = {
    "klassifikaatoriKood",
    "klassifikaatoriNimetus",
    "klassifikaatoriVaartused"
})
public class Klassifikaator {

    @XmlElement(name = "klassifikaatori_kood", required = true)
    protected java.lang.String klassifikaatoriKood;
    @XmlElement(name = "klassifikaatori_nimetus", required = true)
    protected java.lang.String klassifikaatoriNimetus;
    @XmlElement(name = "klassifikaatori_vaartused", required = true)
    protected KlassifikaatoriVaartused klassifikaatoriVaartused;

    /**
     * Gets the value of the klassifikaatoriKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKlassifikaatoriKood() {
        return klassifikaatoriKood;
    }

    /**
     * Sets the value of the klassifikaatoriKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKlassifikaatoriKood(java.lang.String value) {
        this.klassifikaatoriKood = value;
    }

    /**
     * Gets the value of the klassifikaatoriNimetus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKlassifikaatoriNimetus() {
        return klassifikaatoriNimetus;
    }

    /**
     * Sets the value of the klassifikaatoriNimetus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKlassifikaatoriNimetus(java.lang.String value) {
        this.klassifikaatoriNimetus = value;
    }

    /**
     * Gets the value of the klassifikaatoriVaartused property.
     * 
     * @return
     *     possible object is
     *     {@link KlassifikaatoriVaartused }
     *     
     */
    public KlassifikaatoriVaartused getKlassifikaatoriVaartused() {
        return klassifikaatoriVaartused;
    }

    /**
     * Sets the value of the klassifikaatoriVaartused property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlassifikaatoriVaartused }
     *     
     */
    public void setKlassifikaatoriVaartused(KlassifikaatoriVaartused value) {
        this.klassifikaatoriVaartused = value;
    }

}