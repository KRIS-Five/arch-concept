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
 * <p>Java class for detailandmedVastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmedVastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ettevotjad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_ettevotjad"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmedVastus", propOrder = {
    "ettevotjad"
})
public class DetailandmedVastus {

    @XmlElement(required = true)
    protected DetailandmedEttevotjad ettevotjad;

    /**
     * Gets the value of the ettevotjad property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedEttevotjad }
     *     
     */
    public DetailandmedEttevotjad getEttevotjad() {
        return ettevotjad;
    }

    /**
     * Sets the value of the ettevotjad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedEttevotjad }
     *     
     */
    public void setEttevotjad(DetailandmedEttevotjad value) {
        this.ettevotjad = value;
    }

}
