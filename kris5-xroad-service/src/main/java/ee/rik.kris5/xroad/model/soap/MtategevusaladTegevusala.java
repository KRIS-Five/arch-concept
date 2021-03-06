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
 * <p>Java class for mtategevusalad_tegevusala complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtategevusalad_tegevusala"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tegevusala_id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ark" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="emtak_kood" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="emtak_versioon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pohiteg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="allikas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allika_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="muutus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mkuup" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtategevusalad_tegevusala", propOrder = {
    "tegevusalaId",
    "ark",
    "emtakKood",
    "emtakVersioon",
    "pohiteg",
    "algusKpv",
    "loppKpv",
    "allikas",
    "allikaKpv",
    "muutus",
    "mkuup"
})
public class MtategevusaladTegevusala {

    @XmlElement(name = "tegevusala_id", required = true)
    protected BigInteger tegevusalaId;
    protected BigInteger ark;
    @XmlElement(name = "emtak_kood")
    protected java.lang.Integer emtakKood;
    @XmlElement(name = "emtak_versioon")
    protected java.lang.Integer emtakVersioon;
    protected java.lang.String pohiteg;
    @XmlElement(name = "algus_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKpv;
    @XmlElement(name = "lopp_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKpv;
    protected java.lang.String allikas;
    @XmlElement(name = "allika_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar allikaKpv;
    protected java.lang.String muutus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mkuup;

    /**
     * Gets the value of the tegevusalaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTegevusalaId() {
        return tegevusalaId;
    }

    /**
     * Sets the value of the tegevusalaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTegevusalaId(BigInteger value) {
        this.tegevusalaId = value;
    }

    /**
     * Gets the value of the ark property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArk() {
        return ark;
    }

    /**
     * Sets the value of the ark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArk(BigInteger value) {
        this.ark = value;
    }

    /**
     * Gets the value of the emtakKood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getEmtakKood() {
        return emtakKood;
    }

    /**
     * Sets the value of the emtakKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setEmtakKood(java.lang.Integer value) {
        this.emtakKood = value;
    }

    /**
     * Gets the value of the emtakVersioon property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getEmtakVersioon() {
        return emtakVersioon;
    }

    /**
     * Sets the value of the emtakVersioon property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setEmtakVersioon(java.lang.Integer value) {
        this.emtakVersioon = value;
    }

    /**
     * Gets the value of the pohiteg property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPohiteg() {
        return pohiteg;
    }

    /**
     * Sets the value of the pohiteg property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPohiteg(java.lang.String value) {
        this.pohiteg = value;
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
     * Gets the value of the allikas property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAllikas() {
        return allikas;
    }

    /**
     * Sets the value of the allikas property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAllikas(java.lang.String value) {
        this.allikas = value;
    }

    /**
     * Gets the value of the allikaKpv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllikaKpv() {
        return allikaKpv;
    }

    /**
     * Sets the value of the allikaKpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllikaKpv(XMLGregorianCalendar value) {
        this.allikaKpv = value;
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
