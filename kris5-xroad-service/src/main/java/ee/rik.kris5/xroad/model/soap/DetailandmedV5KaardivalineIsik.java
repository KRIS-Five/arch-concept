//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detailandmed_v5_kaardivaline_isik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v5_kaardivaline_isik"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kirje_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
 *         &lt;element name="aadress_riik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_riik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ehak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ehak_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_tanav_maja_korter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ads__ads_oid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ads__adr_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ads__ads_normaliseeritud_taisaadress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_protsent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_suurus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_valuuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_valuuta_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_omandiliik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_omandiliik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_murdosa_lugeja" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="osaluse_murdosa_nimetaja" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="volituste_loppemise_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="kontrolli_allikas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kontrolli_allikas_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kontrolli_allika_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="grupp" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_v5_kaardivaline_isik", propOrder = {
    "kirjeId",
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
    "aadressRiik",
    "aadressRiikTekstina",
    "aadressEhak",
    "aadressEhakTekstina",
    "aadressTanavMajaKorter",
    "aadressAdsAdsOid",
    "aadressAdsAdrId",
    "aadressAdsAdsNormaliseeritudTaisaadress",
    "osaluseProtsent",
    "osaluseSuurus",
    "osaluseValuuta",
    "osaluseValuutaTekstina",
    "osaluseOmandiliik",
    "osaluseOmandiliikTekstina",
    "osaluseMurdosaLugeja",
    "osaluseMurdosaNimetaja",
    "volitusteLoppemiseKpv",
    "kontrolliAllikas",
    "kontrolliAllikasTekstina",
    "kontrolliAllikaKpv",
    "algusKpv",
    "loppKpv",
    "grupp"
})
public class DetailandmedV5KaardivalineIsik {

    @XmlElement(name = "kirje_id")
    protected BigInteger kirjeId;
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
    @XmlElement(name = "aadress_ads__ads_oid")
    protected java.lang.String aadressAdsAdsOid;
    @XmlElement(name = "aadress_ads__adr_id")
    protected java.lang.String aadressAdsAdrId;
    @XmlElement(name = "aadress_ads__ads_normaliseeritud_taisaadress")
    protected java.lang.String aadressAdsAdsNormaliseeritudTaisaadress;
    @XmlElement(name = "osaluse_protsent")
    protected BigDecimal osaluseProtsent;
    @XmlElement(name = "osaluse_suurus")
    protected BigDecimal osaluseSuurus;
    @XmlElement(name = "osaluse_valuuta")
    protected java.lang.String osaluseValuuta;
    @XmlElement(name = "osaluse_valuuta_tekstina")
    protected java.lang.String osaluseValuutaTekstina;
    @XmlElement(name = "osaluse_omandiliik")
    protected java.lang.String osaluseOmandiliik;
    @XmlElement(name = "osaluse_omandiliik_tekstina")
    protected java.lang.String osaluseOmandiliikTekstina;
    @XmlElement(name = "osaluse_murdosa_lugeja")
    protected BigInteger osaluseMurdosaLugeja;
    @XmlElement(name = "osaluse_murdosa_nimetaja")
    protected BigInteger osaluseMurdosaNimetaja;
    @XmlElement(name = "volituste_loppemise_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar volitusteLoppemiseKpv;
    @XmlElement(name = "kontrolli_allikas")
    protected java.lang.String kontrolliAllikas;
    @XmlElement(name = "kontrolli_allikas_tekstina")
    protected java.lang.String kontrolliAllikasTekstina;
    @XmlElement(name = "kontrolli_allika_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kontrolliAllikaKpv;
    @XmlElement(name = "algus_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKpv;
    @XmlElement(name = "lopp_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKpv;
    protected BigInteger grupp;

    /**
     * Gets the value of the kirjeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKirjeId() {
        return kirjeId;
    }

    /**
     * Sets the value of the kirjeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKirjeId(BigInteger value) {
        this.kirjeId = value;
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
     * Gets the value of the aadressAdsAdsOid property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressAdsAdsOid() {
        return aadressAdsAdsOid;
    }

    /**
     * Sets the value of the aadressAdsAdsOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressAdsAdsOid(java.lang.String value) {
        this.aadressAdsAdsOid = value;
    }

    /**
     * Gets the value of the aadressAdsAdrId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressAdsAdrId() {
        return aadressAdsAdrId;
    }

    /**
     * Sets the value of the aadressAdsAdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressAdsAdrId(java.lang.String value) {
        this.aadressAdsAdrId = value;
    }

    /**
     * Gets the value of the aadressAdsAdsNormaliseeritudTaisaadress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadressAdsAdsNormaliseeritudTaisaadress() {
        return aadressAdsAdsNormaliseeritudTaisaadress;
    }

    /**
     * Sets the value of the aadressAdsAdsNormaliseeritudTaisaadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadressAdsAdsNormaliseeritudTaisaadress(java.lang.String value) {
        this.aadressAdsAdsNormaliseeritudTaisaadress = value;
    }

    /**
     * Gets the value of the osaluseProtsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsaluseProtsent() {
        return osaluseProtsent;
    }

    /**
     * Sets the value of the osaluseProtsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsaluseProtsent(BigDecimal value) {
        this.osaluseProtsent = value;
    }

    /**
     * Gets the value of the osaluseSuurus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsaluseSuurus() {
        return osaluseSuurus;
    }

    /**
     * Sets the value of the osaluseSuurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsaluseSuurus(BigDecimal value) {
        this.osaluseSuurus = value;
    }

    /**
     * Gets the value of the osaluseValuuta property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaluseValuuta() {
        return osaluseValuuta;
    }

    /**
     * Sets the value of the osaluseValuuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaluseValuuta(java.lang.String value) {
        this.osaluseValuuta = value;
    }

    /**
     * Gets the value of the osaluseValuutaTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaluseValuutaTekstina() {
        return osaluseValuutaTekstina;
    }

    /**
     * Sets the value of the osaluseValuutaTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaluseValuutaTekstina(java.lang.String value) {
        this.osaluseValuutaTekstina = value;
    }

    /**
     * Gets the value of the osaluseOmandiliik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaluseOmandiliik() {
        return osaluseOmandiliik;
    }

    /**
     * Sets the value of the osaluseOmandiliik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaluseOmandiliik(java.lang.String value) {
        this.osaluseOmandiliik = value;
    }

    /**
     * Gets the value of the osaluseOmandiliikTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaluseOmandiliikTekstina() {
        return osaluseOmandiliikTekstina;
    }

    /**
     * Sets the value of the osaluseOmandiliikTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaluseOmandiliikTekstina(java.lang.String value) {
        this.osaluseOmandiliikTekstina = value;
    }

    /**
     * Gets the value of the osaluseMurdosaLugeja property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOsaluseMurdosaLugeja() {
        return osaluseMurdosaLugeja;
    }

    /**
     * Sets the value of the osaluseMurdosaLugeja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOsaluseMurdosaLugeja(BigInteger value) {
        this.osaluseMurdosaLugeja = value;
    }

    /**
     * Gets the value of the osaluseMurdosaNimetaja property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOsaluseMurdosaNimetaja() {
        return osaluseMurdosaNimetaja;
    }

    /**
     * Sets the value of the osaluseMurdosaNimetaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOsaluseMurdosaNimetaja(BigInteger value) {
        this.osaluseMurdosaNimetaja = value;
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
     * Gets the value of the kontrolliAllikas property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKontrolliAllikas() {
        return kontrolliAllikas;
    }

    /**
     * Sets the value of the kontrolliAllikas property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKontrolliAllikas(java.lang.String value) {
        this.kontrolliAllikas = value;
    }

    /**
     * Gets the value of the kontrolliAllikasTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKontrolliAllikasTekstina() {
        return kontrolliAllikasTekstina;
    }

    /**
     * Sets the value of the kontrolliAllikasTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKontrolliAllikasTekstina(java.lang.String value) {
        this.kontrolliAllikasTekstina = value;
    }

    /**
     * Gets the value of the kontrolliAllikaKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKontrolliAllikaKpv() {
        return kontrolliAllikaKpv;
    }

    /**
     * Sets the value of the kontrolliAllikaKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKontrolliAllikaKpv(XMLGregorianCalendar value) {
        this.kontrolliAllikaKpv = value;
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
     * Gets the value of the grupp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrupp() {
        return grupp;
    }

    /**
     * Sets the value of the grupp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrupp(BigInteger value) {
        this.grupp = value;
    }

}
