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
 * <p>Java class for mtabilanss_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtabilanss_vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilansid" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}mtabilanss_bilansid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtabilanss_vastus", propOrder = {
    "bilansid"
})
public class MtabilanssVastus {

    @XmlElement(required = true)
    protected MtabilanssBilansid bilansid;

    /**
     * Gets the value of the bilansid property.
     * 
     * @return
     *     possible object is
     *     {@link MtabilanssBilansid }
     *     
     */
    public MtabilanssBilansid getBilansid() {
        return bilansid;
    }

    /**
     * Sets the value of the bilansid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtabilanssBilansid }
     *     
     */
    public void setBilansid(MtabilanssBilansid value) {
        this.bilansid = value;
    }

}
