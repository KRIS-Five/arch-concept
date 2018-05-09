//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Juriidiline isik
 * 
 * <p>Java class for juriidiline_isikType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="juriidiline_isikType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arinimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrikood" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}registrikoodType"/&gt;
 *         &lt;element name="aadress" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}aadressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "juriidiline_isikType", propOrder = {
    "arinimi",
    "registrikood",
    "aadress"
})
public class JuriidilineIsikType {

    @XmlElement(required = true)
    protected java.lang.String arinimi;
    @XmlElement(required = true)
    protected RegistrikoodType registrikood;
    @XmlElementRef(name = "aadress", type = JAXBElement.class, required = false)
    protected JAXBElement<AadressType> aadress;

    /**
     * Gets the value of the arinimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }

    /**
     * Sets the value of the arinimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setArinimi(java.lang.String value) {
        this.arinimi = value;
    }

    /**
     * Gets the value of the registrikood property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrikoodType }
     *     
     */
    public RegistrikoodType getRegistrikood() {
        return registrikood;
    }

    /**
     * Sets the value of the registrikood property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrikoodType }
     *     
     */
    public void setRegistrikood(RegistrikoodType value) {
        this.registrikood = value;
    }

    /**
     * Gets the value of the aadress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AadressType }{@code >}
     *     
     */
    public JAXBElement<AadressType> getAadress() {
        return aadress;
    }

    /**
     * Sets the value of the aadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AadressType }{@code >}
     *     
     */
    public void setAadress(JAXBElement<AadressType> value) {
        this.aadress = value;
    }

}
