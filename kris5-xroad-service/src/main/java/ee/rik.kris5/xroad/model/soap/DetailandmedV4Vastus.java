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
 * <p>Java class for detailandmed_v4_Vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v4_Vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ettevotjad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_v4_ettevotjad"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_v4_Vastus", propOrder = {
    "ettevotjad"
})
public class DetailandmedV4Vastus {

    @XmlElement(required = true)
    protected DetailandmedV4Ettevotjad ettevotjad;

    /**
     * Gets the value of the ettevotjad property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedV4Ettevotjad }
     *     
     */
    public DetailandmedV4Ettevotjad getEttevotjad() {
        return ettevotjad;
    }

    /**
     * Sets the value of the ettevotjad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedV4Ettevotjad }
     *     
     */
    public void setEttevotjad(DetailandmedV4Ettevotjad value) {
        this.ettevotjad = value;
    }

}
