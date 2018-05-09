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
 * <p>Java class for detailandmed_v5_kp_markus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v5_kp_markus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kirje_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_piirkond" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_nr" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_tyyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kande_nr" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="veeru_nr" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="tyyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tyyp_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sisu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "detailandmed_v5_kp_markus", propOrder = {
    "kirjeId",
    "kaardiPiirkond",
    "kaardiNr",
    "kaardiTyyp",
    "kandeNr",
    "veeruNr",
    "tyyp",
    "tyypTekstina",
    "sisu",
    "algusKpv",
    "loppKpv"
})
public class DetailandmedV5KpMarkus {

    @XmlElement(name = "kirje_id")
    protected BigInteger kirjeId;
    @XmlElement(name = "kaardi_piirkond")
    protected BigInteger kaardiPiirkond;
    @XmlElement(name = "kaardi_nr")
    protected BigInteger kaardiNr;
    @XmlElement(name = "kaardi_tyyp")
    protected java.lang.String kaardiTyyp;
    @XmlElement(name = "kande_nr")
    protected BigInteger kandeNr;
    @XmlElement(name = "veeru_nr")
    protected BigInteger veeruNr;
    protected java.lang.String tyyp;
    @XmlElement(name = "tyyp_tekstina")
    protected java.lang.String tyypTekstina;
    protected java.lang.String sisu;
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
     * Gets the value of the kaardiPiirkond property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKaardiPiirkond() {
        return kaardiPiirkond;
    }

    /**
     * Sets the value of the kaardiPiirkond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKaardiPiirkond(BigInteger value) {
        this.kaardiPiirkond = value;
    }

    /**
     * Gets the value of the kaardiNr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKaardiNr() {
        return kaardiNr;
    }

    /**
     * Sets the value of the kaardiNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKaardiNr(BigInteger value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKandeNr() {
        return kandeNr;
    }

    /**
     * Sets the value of the kandeNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKandeNr(BigInteger value) {
        this.kandeNr = value;
    }

    /**
     * Gets the value of the veeruNr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVeeruNr() {
        return veeruNr;
    }

    /**
     * Sets the value of the veeruNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVeeruNr(BigInteger value) {
        this.veeruNr = value;
    }

    /**
     * Gets the value of the tyyp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }

    /**
     * Sets the value of the tyyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTyyp(java.lang.String value) {
        this.tyyp = value;
    }

    /**
     * Gets the value of the tyypTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTyypTekstina() {
        return tyypTekstina;
    }

    /**
     * Sets the value of the tyypTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTyypTekstina(java.lang.String value) {
        this.tyypTekstina = value;
    }

    /**
     * Gets the value of the sisu property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSisu() {
        return sisu;
    }

    /**
     * Sets the value of the sisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSisu(java.lang.String value) {
        this.sisu = value;
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
