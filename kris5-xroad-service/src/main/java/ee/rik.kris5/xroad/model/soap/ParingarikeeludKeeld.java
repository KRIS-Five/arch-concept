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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paringarikeelud_keeld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paringarikeelud_keeld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fyysilise_isiku_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fyysilise_isiku_valiskood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fyysilise_isiku_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fyysilise_isiku_perenimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fyysilise_isiku_synniaeg" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="kehtivuse_algus" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="kehtivuse_lopp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ulatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="liik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="liik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="olek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="olek_tekstina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paringarikeelud_keeld", propOrder = {
    "fyysiliseIsikuKood",
    "fyysiliseIsikuValiskood",
    "fyysiliseIsikuEesnimi",
    "fyysiliseIsikuPerenimi",
    "fyysiliseIsikuSynniaeg",
    "kehtivuseAlgus",
    "kehtivuseLopp",
    "ulatus",
    "liik",
    "liikTekstina",
    "olek",
    "olekTekstina"
})
public class ParingarikeeludKeeld {

    @XmlElement(name = "fyysilise_isiku_kood", required = true, nillable = true)
    protected java.lang.String fyysiliseIsikuKood;
    @XmlElement(name = "fyysilise_isiku_valiskood", required = true, nillable = true)
    protected java.lang.String fyysiliseIsikuValiskood;
    @XmlElement(name = "fyysilise_isiku_eesnimi", required = true, nillable = true)
    protected java.lang.String fyysiliseIsikuEesnimi;
    @XmlElement(name = "fyysilise_isiku_perenimi", required = true, nillable = true)
    protected java.lang.String fyysiliseIsikuPerenimi;
    @XmlElement(name = "fyysilise_isiku_synniaeg", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fyysiliseIsikuSynniaeg;
    @XmlElement(name = "kehtivuse_algus", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kehtivuseAlgus;
    @XmlElement(name = "kehtivuse_lopp", required = true, nillable = true)
    protected java.lang.String kehtivuseLopp;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String ulatus;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String liik;
    @XmlElement(name = "liik_tekstina", required = true, nillable = true)
    protected java.lang.String liikTekstina;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String olek;
    @XmlElement(name = "olek_tekstina", required = true, nillable = true)
    protected java.lang.String olekTekstina;

    /**
     * Gets the value of the fyysiliseIsikuKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFyysiliseIsikuKood() {
        return fyysiliseIsikuKood;
    }

    /**
     * Sets the value of the fyysiliseIsikuKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFyysiliseIsikuKood(java.lang.String value) {
        this.fyysiliseIsikuKood = value;
    }

    /**
     * Gets the value of the fyysiliseIsikuValiskood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFyysiliseIsikuValiskood() {
        return fyysiliseIsikuValiskood;
    }

    /**
     * Sets the value of the fyysiliseIsikuValiskood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFyysiliseIsikuValiskood(java.lang.String value) {
        this.fyysiliseIsikuValiskood = value;
    }

    /**
     * Gets the value of the fyysiliseIsikuEesnimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFyysiliseIsikuEesnimi() {
        return fyysiliseIsikuEesnimi;
    }

    /**
     * Sets the value of the fyysiliseIsikuEesnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFyysiliseIsikuEesnimi(java.lang.String value) {
        this.fyysiliseIsikuEesnimi = value;
    }

    /**
     * Gets the value of the fyysiliseIsikuPerenimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFyysiliseIsikuPerenimi() {
        return fyysiliseIsikuPerenimi;
    }

    /**
     * Sets the value of the fyysiliseIsikuPerenimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFyysiliseIsikuPerenimi(java.lang.String value) {
        this.fyysiliseIsikuPerenimi = value;
    }

    /**
     * Gets the value of the fyysiliseIsikuSynniaeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFyysiliseIsikuSynniaeg() {
        return fyysiliseIsikuSynniaeg;
    }

    /**
     * Sets the value of the fyysiliseIsikuSynniaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFyysiliseIsikuSynniaeg(XMLGregorianCalendar value) {
        this.fyysiliseIsikuSynniaeg = value;
    }

    /**
     * Gets the value of the kehtivuseAlgus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKehtivuseAlgus() {
        return kehtivuseAlgus;
    }

    /**
     * Sets the value of the kehtivuseAlgus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKehtivuseAlgus(XMLGregorianCalendar value) {
        this.kehtivuseAlgus = value;
    }

    /**
     * Gets the value of the kehtivuseLopp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKehtivuseLopp() {
        return kehtivuseLopp;
    }

    /**
     * Sets the value of the kehtivuseLopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKehtivuseLopp(java.lang.String value) {
        this.kehtivuseLopp = value;
    }

    /**
     * Gets the value of the ulatus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUlatus() {
        return ulatus;
    }

    /**
     * Sets the value of the ulatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUlatus(java.lang.String value) {
        this.ulatus = value;
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
     * Gets the value of the liikTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLiikTekstina() {
        return liikTekstina;
    }

    /**
     * Sets the value of the liikTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLiikTekstina(java.lang.String value) {
        this.liikTekstina = value;
    }

    /**
     * Gets the value of the olek property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOlek() {
        return olek;
    }

    /**
     * Sets the value of the olek property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOlek(java.lang.String value) {
        this.olek = value;
    }

    /**
     * Gets the value of the olekTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOlekTekstina() {
        return olekTekstina;
    }

    /**
     * Sets the value of the olekTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOlekTekstina(java.lang.String value) {
        this.olekTekstina = value;
    }

}
