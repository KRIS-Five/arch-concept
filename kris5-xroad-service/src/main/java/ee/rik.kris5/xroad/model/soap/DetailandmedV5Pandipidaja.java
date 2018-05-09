//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detailandmed_v5_pandipidaja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v5_pandipidaja"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kirje_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="pandipidaja_isiku_liik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandipidaja_isikukood_registrikood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandipidaja_valis_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandipidaja_synniaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="pandipidaja_nimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandipidaja_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_riik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_riik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ehak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ehak_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ads__ads_oid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ads__adr_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aadress_ads__ads_normaliseeritud_taisaadress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="omandiliik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="omandiliik_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="murdosa_lugeja" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="murdosa_nimetaja" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_v5_pandipidaja", propOrder = {
    "kirjeId",
    "pandipidajaIsikuLiik",
    "pandipidajaIsikukoodRegistrikood",
    "pandipidajaValisKood",
    "pandipidajaSynniaeg",
    "pandipidajaNimi",
    "pandipidajaEesnimi",
    "aadressRiik",
    "aadressRiikTekstina",
    "aadressEhak",
    "aadressEhakTekstina",
    "aadressAdsAdsOid",
    "aadressAdsAdrId",
    "aadressAdsAdsNormaliseeritudTaisaadress",
    "omandiliik",
    "omandiliikTekstina",
    "murdosaLugeja",
    "murdosaNimetaja",
    "algusKpv",
    "loppKpv"
})
public class DetailandmedV5Pandipidaja {

    @XmlElement(name = "kirje_id")
    protected BigInteger kirjeId;
    @XmlElement(name = "pandipidaja_isiku_liik")
    protected java.lang.String pandipidajaIsikuLiik;
    @XmlElement(name = "pandipidaja_isikukood_registrikood")
    protected java.lang.String pandipidajaIsikukoodRegistrikood;
    @XmlElement(name = "pandipidaja_valis_kood")
    protected java.lang.String pandipidajaValisKood;
    @XmlElement(name = "pandipidaja_synniaeg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pandipidajaSynniaeg;
    @XmlElement(name = "pandipidaja_nimi")
    protected java.lang.String pandipidajaNimi;
    @XmlElement(name = "pandipidaja_eesnimi")
    protected java.lang.String pandipidajaEesnimi;
    @XmlElement(name = "aadress_riik")
    protected java.lang.String aadressRiik;
    @XmlElement(name = "aadress_riik_tekstina")
    protected java.lang.String aadressRiikTekstina;
    @XmlElement(name = "aadress_ehak")
    protected java.lang.String aadressEhak;
    @XmlElement(name = "aadress_ehak_tekstina")
    protected java.lang.String aadressEhakTekstina;
    @XmlElement(name = "aadress_ads__ads_oid")
    protected java.lang.String aadressAdsAdsOid;
    @XmlElement(name = "aadress_ads__adr_id")
    protected java.lang.String aadressAdsAdrId;
    @XmlElement(name = "aadress_ads__ads_normaliseeritud_taisaadress")
    protected java.lang.String aadressAdsAdsNormaliseeritudTaisaadress;
    protected java.lang.String omandiliik;
    @XmlElement(name = "omandiliik_tekstina")
    protected java.lang.String omandiliikTekstina;
    @XmlElement(name = "murdosa_lugeja")
    protected BigInteger murdosaLugeja;
    @XmlElement(name = "murdosa_nimetaja")
    protected BigInteger murdosaNimetaja;
    @XmlElement(name = "algus_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKpv;
    @XmlElement(name = "lopp_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKpv;

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
     * Gets the value of the pandipidajaIsikuLiik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandipidajaIsikuLiik() {
        return pandipidajaIsikuLiik;
    }

    /**
     * Sets the value of the pandipidajaIsikuLiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandipidajaIsikuLiik(java.lang.String value) {
        this.pandipidajaIsikuLiik = value;
    }

    /**
     * Gets the value of the pandipidajaIsikukoodRegistrikood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandipidajaIsikukoodRegistrikood() {
        return pandipidajaIsikukoodRegistrikood;
    }

    /**
     * Sets the value of the pandipidajaIsikukoodRegistrikood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandipidajaIsikukoodRegistrikood(java.lang.String value) {
        this.pandipidajaIsikukoodRegistrikood = value;
    }

    /**
     * Gets the value of the pandipidajaValisKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandipidajaValisKood() {
        return pandipidajaValisKood;
    }

    /**
     * Sets the value of the pandipidajaValisKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandipidajaValisKood(java.lang.String value) {
        this.pandipidajaValisKood = value;
    }

    /**
     * Gets the value of the pandipidajaSynniaeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPandipidajaSynniaeg() {
        return pandipidajaSynniaeg;
    }

    /**
     * Sets the value of the pandipidajaSynniaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPandipidajaSynniaeg(XMLGregorianCalendar value) {
        this.pandipidajaSynniaeg = value;
    }

    /**
     * Gets the value of the pandipidajaNimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandipidajaNimi() {
        return pandipidajaNimi;
    }

    /**
     * Sets the value of the pandipidajaNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandipidajaNimi(java.lang.String value) {
        this.pandipidajaNimi = value;
    }

    /**
     * Gets the value of the pandipidajaEesnimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandipidajaEesnimi() {
        return pandipidajaEesnimi;
    }

    /**
     * Sets the value of the pandipidajaEesnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandipidajaEesnimi(java.lang.String value) {
        this.pandipidajaEesnimi = value;
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
     * Gets the value of the omandiliik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOmandiliik() {
        return omandiliik;
    }

    /**
     * Sets the value of the omandiliik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOmandiliik(java.lang.String value) {
        this.omandiliik = value;
    }

    /**
     * Gets the value of the omandiliikTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOmandiliikTekstina() {
        return omandiliikTekstina;
    }

    /**
     * Sets the value of the omandiliikTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOmandiliikTekstina(java.lang.String value) {
        this.omandiliikTekstina = value;
    }

    /**
     * Gets the value of the murdosaLugeja property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMurdosaLugeja() {
        return murdosaLugeja;
    }

    /**
     * Sets the value of the murdosaLugeja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMurdosaLugeja(BigInteger value) {
        this.murdosaLugeja = value;
    }

    /**
     * Gets the value of the murdosaNimetaja property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMurdosaNimetaja() {
        return murdosaNimetaja;
    }

    /**
     * Sets the value of the murdosaNimetaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMurdosaNimetaja(BigInteger value) {
        this.murdosaNimetaja = value;
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

}
