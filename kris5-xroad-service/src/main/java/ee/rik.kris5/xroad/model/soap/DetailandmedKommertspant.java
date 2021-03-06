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
 * <p>Java class for detailandmed_kommertspant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailandmed_kommertspant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kaardi_piirkond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_nr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kaardi_tyyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kande_nr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pandi_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_olek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_olek_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_jarjekoht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_jarjekoht_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_summa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_valuuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pandi_valuuta_tekstina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="algus_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lopp_kpv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="jarjekohad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_kp_jarjekohad"/&gt;
 *         &lt;element name="pandisummad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_kp_pandisummad"/&gt;
 *         &lt;element name="pandipidajad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_kp_pandipidajad"/&gt;
 *         &lt;element name="markused" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}detailandmed_kp_markused"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailandmed_kommertspant", propOrder = {
    "kaardiPiirkond",
    "kaardiNr",
    "kaardiTyyp",
    "kandeNr",
    "pandiId",
    "pandiNumber",
    "pandiOlek",
    "pandiOlekTekstina",
    "pandiJarjekoht",
    "pandiJarjekohtTekstina",
    "pandiSumma",
    "pandiValuuta",
    "pandiValuutaTekstina",
    "algusKpv",
    "loppKpv",
    "jarjekohad",
    "pandisummad",
    "pandipidajad",
    "markused"
})
public class DetailandmedKommertspant {

    @XmlElement(name = "kaardi_piirkond")
    protected java.lang.Integer kaardiPiirkond;
    @XmlElement(name = "kaardi_nr")
    protected java.lang.Integer kaardiNr;
    @XmlElement(name = "kaardi_tyyp")
    protected java.lang.String kaardiTyyp;
    @XmlElement(name = "kande_nr")
    protected java.lang.Integer kandeNr;
    @XmlElement(name = "pandi_id")
    protected java.lang.String pandiId;
    @XmlElement(name = "pandi_number")
    protected java.lang.String pandiNumber;
    @XmlElement(name = "pandi_olek")
    protected java.lang.String pandiOlek;
    @XmlElement(name = "pandi_olek_tekstina")
    protected java.lang.String pandiOlekTekstina;
    @XmlElement(name = "pandi_jarjekoht")
    protected java.lang.String pandiJarjekoht;
    @XmlElement(name = "pandi_jarjekoht_tekstina")
    protected java.lang.String pandiJarjekohtTekstina;
    @XmlElement(name = "pandi_summa")
    protected java.lang.String pandiSumma;
    @XmlElement(name = "pandi_valuuta")
    protected java.lang.String pandiValuuta;
    @XmlElement(name = "pandi_valuuta_tekstina")
    protected java.lang.String pandiValuutaTekstina;
    @XmlElement(name = "algus_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algusKpv;
    @XmlElement(name = "lopp_kpv")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loppKpv;
    @XmlElement(required = true)
    protected DetailandmedKpJarjekohad jarjekohad;
    @XmlElement(required = true)
    protected DetailandmedKpPandisummad pandisummad;
    @XmlElement(required = true)
    protected DetailandmedKpPandipidajad pandipidajad;
    @XmlElement(required = true)
    protected DetailandmedKpMarkused markused;

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
     * Gets the value of the pandiId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiId() {
        return pandiId;
    }

    /**
     * Sets the value of the pandiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiId(java.lang.String value) {
        this.pandiId = value;
    }

    /**
     * Gets the value of the pandiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiNumber() {
        return pandiNumber;
    }

    /**
     * Sets the value of the pandiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiNumber(java.lang.String value) {
        this.pandiNumber = value;
    }

    /**
     * Gets the value of the pandiOlek property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiOlek() {
        return pandiOlek;
    }

    /**
     * Sets the value of the pandiOlek property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiOlek(java.lang.String value) {
        this.pandiOlek = value;
    }

    /**
     * Gets the value of the pandiOlekTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiOlekTekstina() {
        return pandiOlekTekstina;
    }

    /**
     * Sets the value of the pandiOlekTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiOlekTekstina(java.lang.String value) {
        this.pandiOlekTekstina = value;
    }

    /**
     * Gets the value of the pandiJarjekoht property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiJarjekoht() {
        return pandiJarjekoht;
    }

    /**
     * Sets the value of the pandiJarjekoht property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiJarjekoht(java.lang.String value) {
        this.pandiJarjekoht = value;
    }

    /**
     * Gets the value of the pandiJarjekohtTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiJarjekohtTekstina() {
        return pandiJarjekohtTekstina;
    }

    /**
     * Sets the value of the pandiJarjekohtTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiJarjekohtTekstina(java.lang.String value) {
        this.pandiJarjekohtTekstina = value;
    }

    /**
     * Gets the value of the pandiSumma property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiSumma() {
        return pandiSumma;
    }

    /**
     * Sets the value of the pandiSumma property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiSumma(java.lang.String value) {
        this.pandiSumma = value;
    }

    /**
     * Gets the value of the pandiValuuta property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiValuuta() {
        return pandiValuuta;
    }

    /**
     * Sets the value of the pandiValuuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiValuuta(java.lang.String value) {
        this.pandiValuuta = value;
    }

    /**
     * Gets the value of the pandiValuutaTekstina property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPandiValuutaTekstina() {
        return pandiValuutaTekstina;
    }

    /**
     * Sets the value of the pandiValuutaTekstina property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPandiValuutaTekstina(java.lang.String value) {
        this.pandiValuutaTekstina = value;
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
     * Gets the value of the jarjekohad property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedKpJarjekohad }
     *     
     */
    public DetailandmedKpJarjekohad getJarjekohad() {
        return jarjekohad;
    }

    /**
     * Sets the value of the jarjekohad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedKpJarjekohad }
     *     
     */
    public void setJarjekohad(DetailandmedKpJarjekohad value) {
        this.jarjekohad = value;
    }

    /**
     * Gets the value of the pandisummad property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedKpPandisummad }
     *     
     */
    public DetailandmedKpPandisummad getPandisummad() {
        return pandisummad;
    }

    /**
     * Sets the value of the pandisummad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedKpPandisummad }
     *     
     */
    public void setPandisummad(DetailandmedKpPandisummad value) {
        this.pandisummad = value;
    }

    /**
     * Gets the value of the pandipidajad property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedKpPandipidajad }
     *     
     */
    public DetailandmedKpPandipidajad getPandipidajad() {
        return pandipidajad;
    }

    /**
     * Sets the value of the pandipidajad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedKpPandipidajad }
     *     
     */
    public void setPandipidajad(DetailandmedKpPandipidajad value) {
        this.pandipidajad = value;
    }

    /**
     * Gets the value of the markused property.
     * 
     * @return
     *     possible object is
     *     {@link DetailandmedKpMarkused }
     *     
     */
    public DetailandmedKpMarkused getMarkused() {
        return markused;
    }

    /**
     * Sets the value of the markused property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailandmedKpMarkused }
     *     
     */
    public void setMarkused(DetailandmedKpMarkused value) {
        this.markused = value;
    }

}
