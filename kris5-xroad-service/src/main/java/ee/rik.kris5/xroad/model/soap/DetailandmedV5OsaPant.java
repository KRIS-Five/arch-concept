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
 * <p>Java class for detailandmed_v5_osa_pant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v5_osa_pant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kirje_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="osapant_voi_tingimuslik_voorandamine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osa_omaniku_liik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osa_omaniku_isikukood_registrikood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osa_omaniku_valis_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osa_omaniku_synniaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="osa_omaniku_nimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osa_omaniku_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osa_suurus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="osapandi_jarjekoht" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="osapandi_kirjeldus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osapandi_algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="osapandi_lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="pandipidajad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_v5_pandipidajad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_v5_osa_pant", propOrder = {
    "kirjeId",
    "osapantVoiTingimuslikVoorandamine",
    "osaOmanikuLiik",
    "osaOmanikuIsikukoodRegistrikood",
    "osaOmanikuValisKood",
    "osaOmanikuSynniaeg",
    "osaOmanikuNimi",
    "osaOmanikuEesnimi",
    "osaSuurus",
    "osapandiJarjekoht",
    "osapandiKirjeldus",
    "osapandiAlgusKpv",
    "osapandiLoppKpv",
    "pandipidajad"
})
public class DetailandmedV5OsaPant {

    @XmlElement(name = "kirje_id")
    protected BigInteger kirjeId;
    @XmlElement(name = "osapant_voi_tingimuslik_voorandamine")
    protected java.lang.String osapantVoiTingimuslikVoorandamine;
    @XmlElement(name = "osa_omaniku_liik")
    protected java.lang.String osaOmanikuLiik;
    @XmlElement(name = "osa_omaniku_isikukood_registrikood")
    protected java.lang.String osaOmanikuIsikukoodRegistrikood;
    @XmlElement(name = "osa_omaniku_valis_kood")
    protected java.lang.String osaOmanikuValisKood;
    @XmlElement(name = "osa_omaniku_synniaeg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar osaOmanikuSynniaeg;
    @XmlElement(name = "osa_omaniku_nimi")
    protected java.lang.String osaOmanikuNimi;
    @XmlElement(name = "osa_omaniku_eesnimi")
    protected java.lang.String osaOmanikuEesnimi;
    @XmlElement(name = "osa_suurus")
    protected BigDecimal osaSuurus;
    @XmlElement(name = "osapandi_jarjekoht")
    protected BigInteger osapandiJarjekoht;
    @XmlElement(name = "osapandi_kirjeldus")
    protected java.lang.String osapandiKirjeldus;
    @XmlElement(name = "osapandi_algus_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar osapandiAlgusKpv;
    @XmlElement(name = "osapandi_lopp_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar osapandiLoppKpv;
    protected DetailandmedV5Pandipidajad pandipidajad;

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
     * Gets the value of the osapantVoiTingimuslikVoorandamine property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsapantVoiTingimuslikVoorandamine() {
        return osapantVoiTingimuslikVoorandamine;
    }

    /**
     * Sets the value of the osapantVoiTingimuslikVoorandamine property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsapantVoiTingimuslikVoorandamine(java.lang.String value) {
        this.osapantVoiTingimuslikVoorandamine = value;
    }

    /**
     * Gets the value of the osaOmanikuLiik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaOmanikuLiik() {
        return osaOmanikuLiik;
    }

    /**
     * Sets the value of the osaOmanikuLiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaOmanikuLiik(java.lang.String value) {
        this.osaOmanikuLiik = value;
    }

    /**
     * Gets the value of the osaOmanikuIsikukoodRegistrikood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaOmanikuIsikukoodRegistrikood() {
        return osaOmanikuIsikukoodRegistrikood;
    }

    /**
     * Sets the value of the osaOmanikuIsikukoodRegistrikood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaOmanikuIsikukoodRegistrikood(java.lang.String value) {
        this.osaOmanikuIsikukoodRegistrikood = value;
    }

    /**
     * Gets the value of the osaOmanikuValisKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaOmanikuValisKood() {
        return osaOmanikuValisKood;
    }

    /**
     * Sets the value of the osaOmanikuValisKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaOmanikuValisKood(java.lang.String value) {
        this.osaOmanikuValisKood = value;
    }

    /**
     * Gets the value of the osaOmanikuSynniaeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOsaOmanikuSynniaeg() {
        return osaOmanikuSynniaeg;
    }

    /**
     * Sets the value of the osaOmanikuSynniaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOsaOmanikuSynniaeg(XMLGregorianCalendar value) {
        this.osaOmanikuSynniaeg = value;
    }

    /**
     * Gets the value of the osaOmanikuNimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaOmanikuNimi() {
        return osaOmanikuNimi;
    }

    /**
     * Sets the value of the osaOmanikuNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaOmanikuNimi(java.lang.String value) {
        this.osaOmanikuNimi = value;
    }

    /**
     * Gets the value of the osaOmanikuEesnimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsaOmanikuEesnimi() {
        return osaOmanikuEesnimi;
    }

    /**
     * Sets the value of the osaOmanikuEesnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsaOmanikuEesnimi(java.lang.String value) {
        this.osaOmanikuEesnimi = value;
    }

    /**
     * Gets the value of the osaSuurus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsaSuurus() {
        return osaSuurus;
    }

    /**
     * Sets the value of the osaSuurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsaSuurus(BigDecimal value) {
        this.osaSuurus = value;
    }

    /**
     * Gets the value of the osapandiJarjekoht property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOsapandiJarjekoht() {
        return osapandiJarjekoht;
    }

    /**
     * Sets the value of the osapandiJarjekoht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOsapandiJarjekoht(BigInteger value) {
        this.osapandiJarjekoht = value;
    }

    /**
     * Gets the value of the osapandiKirjeldus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOsapandiKirjeldus() {
        return osapandiKirjeldus;
    }

    /**
     * Sets the value of the osapandiKirjeldus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOsapandiKirjeldus(java.lang.String value) {
        this.osapandiKirjeldus = value;
    }

    /**
     * Gets the value of the osapandiAlgusKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOsapandiAlgusKpv() {
        return osapandiAlgusKpv;
    }

    /**
     * Sets the value of the osapandiAlgusKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOsapandiAlgusKpv(XMLGregorianCalendar value) {
        this.osapandiAlgusKpv = value;
    }

    /**
     * Gets the value of the osapandiLoppKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOsapandiLoppKpv() {
        return osapandiLoppKpv;
    }

    /**
     * Sets the value of the osapandiLoppKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOsapandiLoppKpv(XMLGregorianCalendar value) {
        this.osapandiLoppKpv = value;
    }

    /**
     * Gets the value of the pandipidajad property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedV5Pandipidajad }
     *     
     */
    public DetailandmedV5Pandipidajad getPandipidajad() {
        return pandipidajad;
    }

    /**
     * Sets the value of the pandipidajad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedV5Pandipidajad }
     *     
     */
    public void setPandipidajad(DetailandmedV5Pandipidajad value) {
        this.pandipidajad = value;
    }

}