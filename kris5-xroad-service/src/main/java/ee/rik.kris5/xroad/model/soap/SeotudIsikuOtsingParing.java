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
 * <p>Java class for seotud_isiku_otsing_paring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seotud_isiku_otsing_paring"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ariregister_kasutajanimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ariregister_parool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ariregister_sessioon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ariregister_valjundi_formaat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isik_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isik_perenimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isik_isikukood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isik_synniaeg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jurisik_nimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jurisik_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seose_kehtivus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seotud_isiku_otsing_paring", propOrder = {
    "ariregisterKasutajanimi",
    "ariregisterParool",
    "ariregisterSessioon",
    "ariregisterValjundiFormaat",
    "isikEesnimi",
    "isikPerenimi",
    "isikIsikukood",
    "isikSynniaeg",
    "jurisikNimi",
    "jurisikKood",
    "seoseKehtivus"
})
public class SeotudIsikuOtsingParing {

    @XmlElementRef(name = "ariregister_kasutajanimi", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ariregisterKasutajanimi;
    @XmlElementRef(name = "ariregister_parool", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ariregisterParool;
    @XmlElementRef(name = "ariregister_sessioon", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ariregisterSessioon;
    @XmlElementRef(name = "ariregister_valjundi_formaat", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ariregisterValjundiFormaat;
    @XmlElement(name = "isik_eesnimi")
    protected java.lang.String isikEesnimi;
    @XmlElement(name = "isik_perenimi")
    protected java.lang.String isikPerenimi;
    @XmlElement(name = "isik_isikukood")
    protected java.lang.String isikIsikukood;
    @XmlElement(name = "isik_synniaeg")
    protected java.lang.String isikSynniaeg;
    @XmlElement(name = "jurisik_nimi")
    protected java.lang.String jurisikNimi;
    @XmlElement(name = "jurisik_kood")
    protected java.lang.String jurisikKood;
    @XmlElement(name = "seose_kehtivus")
    protected java.lang.String seoseKehtivus;

    /**
     * Gets the value of the ariregisterKasutajanimi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getAriregisterKasutajanimi() {
        return ariregisterKasutajanimi;
    }

    /**
     * Sets the value of the ariregisterKasutajanimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setAriregisterKasutajanimi(JAXBElement<java.lang.String> value) {
        this.ariregisterKasutajanimi = value;
    }

    /**
     * Gets the value of the ariregisterParool property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getAriregisterParool() {
        return ariregisterParool;
    }

    /**
     * Sets the value of the ariregisterParool property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setAriregisterParool(JAXBElement<java.lang.String> value) {
        this.ariregisterParool = value;
    }

    /**
     * Gets the value of the ariregisterSessioon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getAriregisterSessioon() {
        return ariregisterSessioon;
    }

    /**
     * Sets the value of the ariregisterSessioon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setAriregisterSessioon(JAXBElement<java.lang.String> value) {
        this.ariregisterSessioon = value;
    }

    /**
     * Gets the value of the ariregisterValjundiFormaat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getAriregisterValjundiFormaat() {
        return ariregisterValjundiFormaat;
    }

    /**
     * Sets the value of the ariregisterValjundiFormaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setAriregisterValjundiFormaat(JAXBElement<java.lang.String> value) {
        this.ariregisterValjundiFormaat = value;
    }

    /**
     * Gets the value of the isikEesnimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikEesnimi() {
        return isikEesnimi;
    }

    /**
     * Sets the value of the isikEesnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikEesnimi(java.lang.String value) {
        this.isikEesnimi = value;
    }

    /**
     * Gets the value of the isikPerenimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikPerenimi() {
        return isikPerenimi;
    }

    /**
     * Sets the value of the isikPerenimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikPerenimi(java.lang.String value) {
        this.isikPerenimi = value;
    }

    /**
     * Gets the value of the isikIsikukood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikIsikukood() {
        return isikIsikukood;
    }

    /**
     * Sets the value of the isikIsikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikIsikukood(java.lang.String value) {
        this.isikIsikukood = value;
    }

    /**
     * Gets the value of the isikSynniaeg property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikSynniaeg() {
        return isikSynniaeg;
    }

    /**
     * Sets the value of the isikSynniaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikSynniaeg(java.lang.String value) {
        this.isikSynniaeg = value;
    }

    /**
     * Gets the value of the jurisikNimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getJurisikNimi() {
        return jurisikNimi;
    }

    /**
     * Sets the value of the jurisikNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setJurisikNimi(java.lang.String value) {
        this.jurisikNimi = value;
    }

    /**
     * Gets the value of the jurisikKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getJurisikKood() {
        return jurisikKood;
    }

    /**
     * Sets the value of the jurisikKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setJurisikKood(java.lang.String value) {
        this.jurisikKood = value;
    }

    /**
     * Gets the value of the seoseKehtivus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSeoseKehtivus() {
        return seoseKehtivus;
    }

    /**
     * Sets the value of the seoseKehtivus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSeoseKehtivus(java.lang.String value) {
        this.seoseKehtivus = value;
    }

}
