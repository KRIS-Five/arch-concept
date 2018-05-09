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
 * <p>Java class for mtaasutajad_asutaja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtaasutajad_asutaja"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asutaja_id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ark" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="liik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sissemaks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="as_tyyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eesnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="liignimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="synnipaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="riik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valis_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="arinimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ark_jur" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="haldyks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aadress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postiind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="protsent" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="volituste_kpv" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="algus_kp" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lopp_kp" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="muutus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mkuup" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtaasutajad_asutaja", propOrder = {
    "asutajaId",
    "ark",
    "liik",
    "sissemaks",
    "asTyyp",
    "eesnimi",
    "liignimi",
    "isikukood",
    "synnipaev",
    "riik",
    "valisKood",
    "arinimi",
    "arkJur",
    "haldyks",
    "aadress",
    "postiind",
    "protsent",
    "volitusteKpv",
    "algusKp",
    "loppKp",
    "muutus",
    "mkuup"
})
public class MtaasutajadAsutaja {

    @XmlElement(name = "asutaja_id", required = true)
    protected BigInteger asutajaId;
    @XmlElement(required = true, type = java.lang.Integer.class, nillable = true)
    protected java.lang.Integer ark;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String liik;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String sissemaks;
    @XmlElement(name = "as_tyyp", required = true, nillable = true)
    protected java.lang.String asTyyp;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String eesnimi;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String liignimi;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String isikukood;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar synnipaev;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String riik;
    @XmlElement(name = "valis_kood", required = true, nillable = true)
    protected java.lang.String valisKood;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String arinimi;
    @XmlElement(name = "ark_jur", required = true, nillable = true)
    protected BigInteger arkJur;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String haldyks;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String aadress;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String postiind;
    @XmlElement(required = true, nillable = true)
    protected BigInteger protsent;
    @XmlElement(name = "volituste_kpv", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar volitusteKpv;
    @XmlElement(name = "algus_kp", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKp;
    @XmlElement(name = "lopp_kp", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKp;
    @XmlElement(required = true)
    protected java.lang.String muutus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mkuup;

    /**
     * Gets the value of the asutajaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsutajaId() {
        return asutajaId;
    }

    /**
     * Sets the value of the asutajaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsutajaId(BigInteger value) {
        this.asutajaId = value;
    }

    /**
     * Gets the value of the ark property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getArk() {
        return ark;
    }

    /**
     * Sets the value of the ark property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setArk(java.lang.Integer value) {
        this.ark = value;
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
     * Gets the value of the sissemaks property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSissemaks() {
        return sissemaks;
    }

    /**
     * Sets the value of the sissemaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSissemaks(java.lang.String value) {
        this.sissemaks = value;
    }

    /**
     * Gets the value of the asTyyp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAsTyyp() {
        return asTyyp;
    }

    /**
     * Sets the value of the asTyyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAsTyyp(java.lang.String value) {
        this.asTyyp = value;
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
     * Gets the value of the liignimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLiignimi() {
        return liignimi;
    }

    /**
     * Sets the value of the liignimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLiignimi(java.lang.String value) {
        this.liignimi = value;
    }

    /**
     * Gets the value of the isikukood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }

    /**
     * Sets the value of the isikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikukood(java.lang.String value) {
        this.isikukood = value;
    }

    /**
     * Gets the value of the synnipaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSynnipaev() {
        return synnipaev;
    }

    /**
     * Sets the value of the synnipaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSynnipaev(XMLGregorianCalendar value) {
        this.synnipaev = value;
    }

    /**
     * Gets the value of the riik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRiik() {
        return riik;
    }

    /**
     * Sets the value of the riik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRiik(java.lang.String value) {
        this.riik = value;
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
     * Gets the value of the arkJur property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArkJur() {
        return arkJur;
    }

    /**
     * Sets the value of the arkJur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArkJur(BigInteger value) {
        this.arkJur = value;
    }

    /**
     * Gets the value of the haldyks property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHaldyks() {
        return haldyks;
    }

    /**
     * Sets the value of the haldyks property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHaldyks(java.lang.String value) {
        this.haldyks = value;
    }

    /**
     * Gets the value of the aadress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAadress() {
        return aadress;
    }

    /**
     * Sets the value of the aadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAadress(java.lang.String value) {
        this.aadress = value;
    }

    /**
     * Gets the value of the postiind property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPostiind() {
        return postiind;
    }

    /**
     * Sets the value of the postiind property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPostiind(java.lang.String value) {
        this.postiind = value;
    }

    /**
     * Gets the value of the protsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProtsent() {
        return protsent;
    }

    /**
     * Sets the value of the protsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProtsent(BigInteger value) {
        this.protsent = value;
    }

    /**
     * Gets the value of the volitusteKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVolitusteKpv() {
        return volitusteKpv;
    }

    /**
     * Sets the value of the volitusteKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVolitusteKpv(XMLGregorianCalendar value) {
        this.volitusteKpv = value;
    }

    /**
     * Gets the value of the algusKp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgusKp() {
        return algusKp;
    }

    /**
     * Sets the value of the algusKp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgusKp(XMLGregorianCalendar value) {
        this.algusKp = value;
    }

    /**
     * Gets the value of the loppKp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoppKp() {
        return loppKp;
    }

    /**
     * Sets the value of the loppKp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoppKp(XMLGregorianCalendar value) {
        this.loppKp = value;
    }

    /**
     * Gets the value of the muutus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMuutus() {
        return muutus;
    }

    /**
     * Sets the value of the muutus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMuutus(java.lang.String value) {
        this.muutus = value;
    }

    /**
     * Gets the value of the mkuup property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMkuup() {
        return mkuup;
    }

    /**
     * Sets the value of the mkuup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMkuup(XMLGregorianCalendar value) {
        this.mkuup = value;
    }

}
