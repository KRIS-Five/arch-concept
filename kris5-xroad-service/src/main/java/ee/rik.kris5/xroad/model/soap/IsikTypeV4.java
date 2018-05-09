//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for isikType_v4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isikType_v4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tegevus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="liik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="roll" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="volituste_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="sissemaksu_summa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sissemaksu_valuuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sissemaksu_lugeja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sissemaksu_nimetaja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="synniaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valiskood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valiskood_riik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}aadressType_v4" minOccurs="0"/&gt;
 *         &lt;element name="residentsus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kontakt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isikType_v4", propOrder = {
    "tegevus",
    "liik",
    "roll",
    "volitusteTahtaeg",
    "sissemaksuSumma",
    "sissemaksuValuuta",
    "sissemaksuLugeja",
    "sissemaksuNimetaja",
    "eesnimi",
    "nimi",
    "synniaeg",
    "kood",
    "valiskood",
    "valiskoodRiik",
    "aadress",
    "residentsus",
    "email",
    "kontakt"
})
public class IsikTypeV4 {

    @XmlElement(required = true)
    protected java.lang.String tegevus;
    @XmlElement(required = true)
    protected java.lang.String liik;
    @XmlElement(required = true)
    protected java.lang.String roll;
    @XmlElement(name = "volituste_tahtaeg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar volitusteTahtaeg;
    @XmlElementRef(name = "sissemaksu_summa", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sissemaksuSumma;
    @XmlElementRef(name = "sissemaksu_valuuta", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> sissemaksuValuuta;
    @XmlElement(name = "sissemaksu_lugeja")
    protected java.lang.Integer sissemaksuLugeja;
    @XmlElement(name = "sissemaksu_nimetaja")
    protected java.lang.Integer sissemaksuNimetaja;
    protected java.lang.String eesnimi;
    @XmlElement(required = true)
    protected java.lang.String nimi;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar synniaeg;
    protected java.lang.String kood;
    protected java.lang.String valiskood;
    @XmlElement(name = "valiskood_riik")
    protected java.lang.String valiskoodRiik;
    @XmlElementRef(name = "aadress", type = JAXBElement.class, required = false)
    protected JAXBElement<AadressTypeV4> aadress;
    @XmlElementRef(name = "residentsus", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> residentsus;
    protected java.lang.String email;
    protected java.lang.String kontakt;

    /**
     * Gets the value of the tegevus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTegevus() {
        return tegevus;
    }

    /**
     * Sets the value of the tegevus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTegevus(java.lang.String value) {
        this.tegevus = value;
    }

    /**
     * Gets the value of the liik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLiik() {
        return liik;
    }

    /**
     * Sets the value of the liik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLiik(java.lang.String value) {
        this.liik = value;
    }

    /**
     * Gets the value of the roll property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRoll() {
        return roll;
    }

    /**
     * Sets the value of the roll property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRoll(java.lang.String value) {
        this.roll = value;
    }

    /**
     * Gets the value of the volitusteTahtaeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVolitusteTahtaeg() {
        return volitusteTahtaeg;
    }

    /**
     * Sets the value of the volitusteTahtaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVolitusteTahtaeg(XMLGregorianCalendar value) {
        this.volitusteTahtaeg = value;
    }

    /**
     * Gets the value of the sissemaksuSumma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSissemaksuSumma() {
        return sissemaksuSumma;
    }

    /**
     * Sets the value of the sissemaksuSumma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSissemaksuSumma(JAXBElement<BigDecimal> value) {
        this.sissemaksuSumma = value;
    }

    /**
     * Gets the value of the sissemaksuValuuta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getSissemaksuValuuta() {
        return sissemaksuValuuta;
    }

    /**
     * Sets the value of the sissemaksuValuuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setSissemaksuValuuta(JAXBElement<java.lang.String> value) {
        this.sissemaksuValuuta = value;
    }

    /**
     * Gets the value of the sissemaksuLugeja property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getSissemaksuLugeja() {
        return sissemaksuLugeja;
    }

    /**
     * Sets the value of the sissemaksuLugeja property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setSissemaksuLugeja(java.lang.Integer value) {
        this.sissemaksuLugeja = value;
    }

    /**
     * Gets the value of the sissemaksuNimetaja property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getSissemaksuNimetaja() {
        return sissemaksuNimetaja;
    }

    /**
     * Sets the value of the sissemaksuNimetaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setSissemaksuNimetaja(java.lang.Integer value) {
        this.sissemaksuNimetaja = value;
    }

    /**
     * Gets the value of the eesnimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEesnimi() {
        return eesnimi;
    }

    /**
     * Sets the value of the eesnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEesnimi(java.lang.String value) {
        this.eesnimi = value;
    }

    /**
     * Gets the value of the nimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNimi() {
        return nimi;
    }

    /**
     * Sets the value of the nimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNimi(java.lang.String value) {
        this.nimi = value;
    }

    /**
     * Gets the value of the synniaeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSynniaeg() {
        return synniaeg;
    }

    /**
     * Sets the value of the synniaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSynniaeg(XMLGregorianCalendar value) {
        this.synniaeg = value;
    }

    /**
     * Gets the value of the kood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKood() {
        return kood;
    }

    /**
     * Sets the value of the kood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKood(java.lang.String value) {
        this.kood = value;
    }

    /**
     * Gets the value of the valiskood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValiskood() {
        return valiskood;
    }

    /**
     * Sets the value of the valiskood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValiskood(java.lang.String value) {
        this.valiskood = value;
    }

    /**
     * Gets the value of the valiskoodRiik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValiskoodRiik() {
        return valiskoodRiik;
    }

    /**
     * Sets the value of the valiskoodRiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValiskoodRiik(java.lang.String value) {
        this.valiskoodRiik = value;
    }

    /**
     * Gets the value of the aadress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AadressTypeV4 }{@code >}
     *     
     */
    public JAXBElement<AadressTypeV4> getAadress() {
        return aadress;
    }

    /**
     * Sets the value of the aadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AadressTypeV4 }{@code >}
     *     
     */
    public void setAadress(JAXBElement<AadressTypeV4> value) {
        this.aadress = value;
    }

    /**
     * Gets the value of the residentsus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getResidentsus() {
        return residentsus;
    }

    /**
     * Sets the value of the residentsus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setResidentsus(JAXBElement<java.lang.String> value) {
        this.residentsus = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEmail(java.lang.String value) {
        this.email = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKontakt(java.lang.String value) {
        this.kontakt = value;
    }

}
