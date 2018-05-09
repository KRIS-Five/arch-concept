//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detailandmed_v4_kaardile_kantud_isik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v4_kaardile_kantud_isik"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kaardi_piirkond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_nr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_tyyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kande_nr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isiku_tyyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isiku_roll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isiku_roll_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nimi_arinimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isikukood_registrikood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valis_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valis_kood_riik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valis_kood_riik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="synniaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="osamaks" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="osamaksu_valuuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osamaksu_valuuta_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="volituste_loppemise_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="aadress_riik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_riik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ehak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ehak_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_tanav_maja_korter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_v4_kaardile_kantud_isik", propOrder = {
    "kaardiPiirkond",
    "kaardiNr",
    "kaardiTyyp",
    "kandeNr",
    "isikuTyyp",
    "isikuRoll",
    "isikuRollTekstina",
    "eesnimi",
    "nimiArinimi",
    "isikukoodRegistrikood",
    "valisKood",
    "valisKoodRiik",
    "valisKoodRiikTekstina",
    "synniaeg",
    "osamaks",
    "osamaksuValuuta",
    "osamaksuValuutaTekstina",
    "volitusteLoppemiseKpv",
    "aadressRiik",
    "aadressRiikTekstina",
    "aadressEhak",
    "aadressEhakTekstina",
    "aadressTanavMajaKorter",
    "algusKpv",
    "loppKpv",
    "email"
})
public class DetailandmedV4KaardileKantudIsik {

    @XmlElement(name = "kaardi_piirkond")
    protected java.lang.Integer kaardiPiirkond;
    @XmlElement(name = "kaardi_nr")
    protected java.lang.Integer kaardiNr;
    @XmlElement(name = "kaardi_tyyp")
    protected java.lang.String kaardiTyyp;
    @XmlElement(name = "kande_nr")
    protected java.lang.Integer kandeNr;
    @XmlElement(name = "isiku_tyyp")
    protected java.lang.String isikuTyyp;
    @XmlElement(name = "isiku_roll")
    protected java.lang.String isikuRoll;
    @XmlElement(name = "isiku_roll_tekstina")
    protected java.lang.String isikuRollTekstina;
    protected java.lang.String eesnimi;
    @XmlElement(name = "nimi_arinimi")
    protected java.lang.String nimiArinimi;
    @XmlElement(name = "isikukood_registrikood")
    protected java.lang.String isikukoodRegistrikood;
    @XmlElement(name = "valis_kood")
    protected java.lang.String valisKood;
    @XmlElement(name = "valis_kood_riik")
    protected java.lang.String valisKoodRiik;
    @XmlElement(name = "valis_kood_riik_tekstina")
    protected java.lang.String valisKoodRiikTekstina;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar synniaeg;
    protected BigDecimal osamaks;
    @XmlElement(name = "osamaksu_valuuta")
    protected java.lang.String osamaksuValuuta;
    @XmlElement(name = "osamaksu_valuuta_tekstina")
    protected java.lang.String osamaksuValuutaTekstina;
    @XmlElement(name = "volituste_loppemise_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar volitusteLoppemiseKpv;
    @XmlElement(name = "aadress_riik")
    protected java.lang.String aadressRiik;
    @XmlElement(name = "aadress_riik_tekstina")
    protected java.lang.String aadressRiikTekstina;
    @XmlElement(name = "aadress_ehak")
    protected java.lang.String aadressEhak;
    @XmlElement(name = "aadress_ehak_tekstina")
    protected java.lang.String aadressEhakTekstina;
    @XmlElement(name = "aadress_tanav_maja_korter")
    protected java.lang.String aadressTanavMajaKorter;
    @XmlElement(name = "algus_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKpv;
    @XmlElement(name = "lopp_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKpv;
    protected java.lang.String email;

    /**
     * Gets the value of the kaardiPiirkond property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getKaardiPiirkond() {
        return kaardiPiirkond;
    }

    /**
     * Sets the value of the kaardiPiirkond property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setKaardiPiirkond(java.lang.Integer value) {
        this.kaardiPiirkond = value;
    }

    /**
     * Gets the value of the kaardiNr property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getKaardiNr() {
        return kaardiNr;
    }

    /**
     * Sets the value of the kaardiNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setKaardiNr(java.lang.Integer value) {
        this.kaardiNr = value;
    }

    /**
     * Gets the value of the kaardiTyyp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKaardiTyyp() {
        return kaardiTyyp;
    }

    /**
     * Sets the value of the kaardiTyyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKaardiTyyp(java.lang.String value) {
        this.kaardiTyyp = value;
    }

    /**
     * Gets the value of the kandeNr property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getKandeNr() {
        return kandeNr;
    }

    /**
     * Sets the value of the kandeNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setKandeNr(java.lang.Integer value) {
        this.kandeNr = value;
    }

    /**
     * Gets the value of the isikuTyyp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikuTyyp() {
        return isikuTyyp;
    }

    /**
     * Sets the value of the isikuTyyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikuTyyp(java.lang.String value) {
        this.isikuTyyp = value;
    }

    /**
     * Gets the value of the isikuRoll property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikuRoll() {
        return isikuRoll;
    }

    /**
     * Sets the value of the isikuRoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikuRoll(java.lang.String value) {
        this.isikuRoll = value;
    }

    /**
     * Gets the value of the isikuRollTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikuRollTekstina() {
        return isikuRollTekstina;
    }

    /**
     * Sets the value of the isikuRollTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikuRollTekstina(java.lang.String value) {
        this.isikuRollTekstina = value;
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
     * Gets the value of the nimiArinimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNimiArinimi() {
        return nimiArinimi;
    }

    /**
     * Sets the value of the nimiArinimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNimiArinimi(java.lang.String value) {
        this.nimiArinimi = value;
    }

    /**
     * Gets the value of the isikukoodRegistrikood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikukoodRegistrikood() {
        return isikukoodRegistrikood;
    }

    /**
     * Sets the value of the isikukoodRegistrikood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikukoodRegistrikood(java.lang.String value) {
        this.isikukoodRegistrikood = value;
    }

    /**
     * Gets the value of the valisKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValisKood() {
        return valisKood;
    }

    /**
     * Sets the value of the valisKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValisKood(java.lang.String value) {
        this.valisKood = value;
    }

    /**
     * Gets the value of the valisKoodRiik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValisKoodRiik() {
        return valisKoodRiik;
    }

    /**
     * Sets the value of the valisKoodRiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValisKoodRiik(java.lang.String value) {
        this.valisKoodRiik = value;
    }

    /**
     * Gets the value of the valisKoodRiikTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValisKoodRiikTekstina() {
        return valisKoodRiikTekstina;
    }

    /**
     * Sets the value of the valisKoodRiikTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValisKoodRiikTekstina(java.lang.String value) {
        this.valisKoodRiikTekstina = value;
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
     * Gets the value of the osamaks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsamaks() {
        return osamaks;
    }

    /**
     * Sets the value of the osamaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsamaks(BigDecimal value) {
        this.osamaks = value;
    }

    /**
     * Gets the value of the osamaksuValuuta property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsamaksuValuuta() {
        return osamaksuValuuta;
    }

    /**
     * Sets the value of the osamaksuValuuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsamaksuValuuta(java.lang.String value) {
        this.osamaksuValuuta = value;
    }

    /**
     * Gets the value of the osamaksuValuutaTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsamaksuValuutaTekstina() {
        return osamaksuValuutaTekstina;
    }

    /**
     * Sets the value of the osamaksuValuutaTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsamaksuValuutaTekstina(java.lang.String value) {
        this.osamaksuValuutaTekstina = value;
    }

    /**
     * Gets the value of the volitusteLoppemiseKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVolitusteLoppemiseKpv() {
        return volitusteLoppemiseKpv;
    }

    /**
     * Sets the value of the volitusteLoppemiseKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVolitusteLoppemiseKpv(XMLGregorianCalendar value) {
        this.volitusteLoppemiseKpv = value;
    }

    /**
     * Gets the value of the aadressRiik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressRiik() {
        return aadressRiik;
    }

    /**
     * Sets the value of the aadressRiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressRiik(java.lang.String value) {
        this.aadressRiik = value;
    }

    /**
     * Gets the value of the aadressRiikTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressRiikTekstina() {
        return aadressRiikTekstina;
    }

    /**
     * Sets the value of the aadressRiikTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressRiikTekstina(java.lang.String value) {
        this.aadressRiikTekstina = value;
    }

    /**
     * Gets the value of the aadressEhak property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressEhak() {
        return aadressEhak;
    }

    /**
     * Sets the value of the aadressEhak property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressEhak(java.lang.String value) {
        this.aadressEhak = value;
    }

    /**
     * Gets the value of the aadressEhakTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressEhakTekstina() {
        return aadressEhakTekstina;
    }

    /**
     * Sets the value of the aadressEhakTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressEhakTekstina(java.lang.String value) {
        this.aadressEhakTekstina = value;
    }

    /**
     * Gets the value of the aadressTanavMajaKorter property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressTanavMajaKorter() {
        return aadressTanavMajaKorter;
    }

    /**
     * Sets the value of the aadressTanavMajaKorter property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressTanavMajaKorter(java.lang.String value) {
        this.aadressTanavMajaKorter = value;
    }

    /**
     * Gets the value of the algusKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgusKpv() {
        return algusKpv;
    }

    /**
     * Sets the value of the algusKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgusKpv(XMLGregorianCalendar value) {
        this.algusKpv = value;
    }

    /**
     * Gets the value of the loppKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoppKpv() {
        return loppKpv;
    }

    /**
     * Sets the value of the loppKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoppKpv(XMLGregorianCalendar value) {
        this.loppKpv = value;
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

}
