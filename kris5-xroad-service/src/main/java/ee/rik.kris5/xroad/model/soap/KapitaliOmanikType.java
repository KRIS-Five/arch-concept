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
 * <p>Java class for kapitaliOmanikType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kapitaliOmanikType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isikud" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}isikTypeArray"/&gt;
 *         &lt;element name="osa" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}murdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kapitaliOmanikType", propOrder = {
    "isikud",
    "osa"
})
public class KapitaliOmanikType {

    @XmlElement(required = true)
    protected IsikTypeArray isikud;
    protected MurdType osa;

    /**
     * Gets the value of the isikud property.
     * 
     * @return
     *     possible object is
     *     {@link IsikTypeArray }
     *     
     */
    public IsikTypeArray getIsikud() {
        return isikud;
    }

    /**
     * Sets the value of the isikud property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsikTypeArray }
     *     
     */
    public void setIsikud(IsikTypeArray value) {
        this.isikud = value;
    }

    /**
     * Gets the value of the osa property.
     * 
     * @return
     *     possible object is
     *     {@link MurdType }
     *     
     */
    public MurdType getOsa() {
        return osa;
    }

    /**
     * Sets the value of the osa property.
     * 
     * @param value
     *     allowed object is
     *     {@link MurdType }
     *     
     */
    public void setOsa(MurdType value) {
        this.osa = value;
    }

}