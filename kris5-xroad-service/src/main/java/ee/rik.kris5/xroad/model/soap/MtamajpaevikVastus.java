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
 * <p>Java class for mtamajpaevik_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtamajpaevik_vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paevikud" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}mtamajpaevik_paevikud"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtamajpaevik_vastus", propOrder = {
    "paevikud"
})
public class MtamajpaevikVastus {

    @XmlElement(required = true)
    protected MtamajpaevikPaevikud paevikud;

    /**
     * Gets the value of the paevikud property.
     * 
     * @return
     *     possible object is
     *     {@link MtamajpaevikPaevikud }
     *     
     */
    public MtamajpaevikPaevikud getPaevikud() {
        return paevikud;
    }

    /**
     * Sets the value of the paevikud property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtamajpaevikPaevikud }
     *     
     */
    public void setPaevikud(MtamajpaevikPaevikud value) {
        this.paevikud = value;
    }

}