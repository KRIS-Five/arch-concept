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
 * <p>Java class for detailandmed_v4_Query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_v4_Query"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arinimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ariregistri_kood" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="asukoht_ettevotja_aadressis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="haldyksus_ettevotja_aadressis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fyysilise_isiku_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fyysilise_isiku_perekonnanimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fyysilise_isiku_synniaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fyysilise_isiku_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fyysilise_isiku_roll_jada" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_paring_rollid" minOccurs="0"/&gt;
 *         &lt;element name="yandmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iandmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="kandmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dandmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maarused" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ainult_kehtivad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="staatused" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_paring_staatused" minOccurs="0"/&gt;
 *         &lt;element name="keel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evarv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_v4_Query", propOrder = {
    "arinimi",
    "ariregistriKood",
    "asukohtEttevotjaAadressis",
    "haldyksusEttevotjaAadressis",
    "fyysiliseIsikuEesnimi",
    "fyysiliseIsikuPerekonnanimi",
    "fyysiliseIsikuSynniaeg",
    "fyysiliseIsikuKood",
    "fyysiliseIsikuRollJada",
    "yandmed",
    "iandmed",
    "kandmed",
    "dandmed",
    "maarused",
    "ainultKehtivad",
    "staatused",
    "keel",
    "evarv"
})
public class DetailandmedV4Query {

    protected java.lang.String arinimi;
    @XmlElement(name = "ariregistri_kood")
    protected java.lang.Integer ariregistriKood;
    @XmlElement(name = "asukoht_ettevotja_aadressis")
    protected java.lang.String asukohtEttevotjaAadressis;
    @XmlElement(name = "haldyksus_ettevotja_aadressis")
    protected java.lang.String haldyksusEttevotjaAadressis;
    @XmlElement(name = "fyysilise_isiku_eesnimi")
    protected java.lang.String fyysiliseIsikuEesnimi;
    @XmlElement(name = "fyysilise_isiku_perekonnanimi")
    protected java.lang.String fyysiliseIsikuPerekonnanimi;
    @XmlElement(name = "fyysilise_isiku_synniaeg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fyysiliseIsikuSynniaeg;
    @XmlElement(name = "fyysilise_isiku_kood")
    protected java.lang.String fyysiliseIsikuKood;
    @XmlElement(name = "fyysilise_isiku_roll_jada")
    protected DetailandmedParingRollid fyysiliseIsikuRollJada;
    protected boolean yandmed;
    protected boolean iandmed;
    protected boolean kandmed;
    protected boolean dandmed;
    protected boolean maarused;
    @XmlElement(name = "ainult_kehtivad")
    protected java.lang.Boolean ainultKehtivad;
    protected DetailandmedParingStaatused staatused;
    protected java.lang.String keel;
    protected java.lang.Integer evarv;

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
     * Gets the value of the ariregistriKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getAriregistriKood() {
        return ariregistriKood;
    }

    /**
     * Sets the value of the ariregistriKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setAriregistriKood(java.lang.Integer value) {
        this.ariregistriKood = value;
    }

    /**
     * Gets the value of the asukohtEttevotjaAadressis property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAsukohtEttevotjaAadressis() {
        return asukohtEttevotjaAadressis;
    }

    /**
     * Sets the value of the asukohtEttevotjaAadressis property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAsukohtEttevotjaAadressis(java.lang.String value) {
        this.asukohtEttevotjaAadressis = value;
    }

    /**
     * Gets the value of the haldyksusEttevotjaAadressis property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHaldyksusEttevotjaAadressis() {
        return haldyksusEttevotjaAadressis;
    }

    /**
     * Sets the value of the haldyksusEttevotjaAadressis property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHaldyksusEttevotjaAadressis(java.lang.String value) {
        this.haldyksusEttevotjaAadressis = value;
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
     * Gets the value of the fyysiliseIsikuPerekonnanimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFyysiliseIsikuPerekonnanimi() {
        return fyysiliseIsikuPerekonnanimi;
    }

    /**
     * Sets the value of the fyysiliseIsikuPerekonnanimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFyysiliseIsikuPerekonnanimi(java.lang.String value) {
        this.fyysiliseIsikuPerekonnanimi = value;
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
     * Gets the value of the fyysiliseIsikuRollJada property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedParingRollid }
     *     
     */
    public DetailandmedParingRollid getFyysiliseIsikuRollJada() {
        return fyysiliseIsikuRollJada;
    }

    /**
     * Sets the value of the fyysiliseIsikuRollJada property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedParingRollid }
     *     
     */
    public void setFyysiliseIsikuRollJada(DetailandmedParingRollid value) {
        this.fyysiliseIsikuRollJada = value;
    }

    /**
     * Gets the value of the yandmed property.
     * 
     */
    public boolean isYandmed() {
        return yandmed;
    }

    /**
     * Sets the value of the yandmed property.
     * 
     */
    public void setYandmed(boolean value) {
        this.yandmed = value;
    }

    /**
     * Gets the value of the iandmed property.
     * 
     */
    public boolean isIandmed() {
        return iandmed;
    }

    /**
     * Sets the value of the iandmed property.
     * 
     */
    public void setIandmed(boolean value) {
        this.iandmed = value;
    }

    /**
     * Gets the value of the kandmed property.
     * 
     */
    public boolean isKandmed() {
        return kandmed;
    }

    /**
     * Sets the value of the kandmed property.
     * 
     */
    public void setKandmed(boolean value) {
        this.kandmed = value;
    }

    /**
     * Gets the value of the dandmed property.
     * 
     */
    public boolean isDandmed() {
        return dandmed;
    }

    /**
     * Sets the value of the dandmed property.
     * 
     */
    public void setDandmed(boolean value) {
        this.dandmed = value;
    }

    /**
     * Gets the value of the maarused property.
     * 
     */
    public boolean isMaarused() {
        return maarused;
    }

    /**
     * Sets the value of the maarused property.
     * 
     */
    public void setMaarused(boolean value) {
        this.maarused = value;
    }

    /**
     * Gets the value of the ainultKehtivad property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isAinultKehtivad() {
        return ainultKehtivad;
    }

    /**
     * Sets the value of the ainultKehtivad property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setAinultKehtivad(java.lang.Boolean value) {
        this.ainultKehtivad = value;
    }

    /**
     * Gets the value of the staatused property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedParingStaatused }
     *     
     */
    public DetailandmedParingStaatused getStaatused() {
        return staatused;
    }

    /**
     * Sets the value of the staatused property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedParingStaatused }
     *     
     */
    public void setStaatused(DetailandmedParingStaatused value) {
        this.staatused = value;
    }

    /**
     * Gets the value of the keel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKeel() {
        return keel;
    }

    /**
     * Sets the value of the keel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKeel(java.lang.String value) {
        this.keel = value;
    }

    /**
     * Gets the value of the evarv property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getEvarv() {
        return evarv;
    }

    /**
     * Sets the value of the evarv property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setEvarv(java.lang.Integer value) {
        this.evarv = value;
    }

}
