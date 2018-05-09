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
 * <p>Java class for SooritaKannev2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SooritaKannev2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kande_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kandeliik" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}x_kandeliik"/&gt;
 *         &lt;element name="seisund" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}seisundType" minOccurs="0"/&gt;
 *         &lt;element name="eelmine_lahend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kande_kuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ametitoiming" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}sooritakanne_ametitoiming"/&gt;
 *         &lt;element name="riigiloivud" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}riigiloivTypeArray" minOccurs="0"/&gt;
 *         &lt;element name="kande_sisu" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}sooritakanne_kandesisuv2" minOccurs="0"/&gt;
 *         &lt;element name="markus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dokumendid" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}dokumentTypeArray" minOccurs="0"/&gt;
 *         &lt;element name="registri_piirkond" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}x_regpiirkond" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SooritaKannev2", propOrder = {
    "kandeId",
    "kandeliik",
    "seisund",
    "eelmineLahend",
    "kandeKuupaev",
    "ametitoiming",
    "riigiloivud",
    "kandeSisu",
    "markus",
    "dokumendid",
    "registriPiirkond"
})
public class SooritaKannev2 {

    @XmlElement(name = "kande_id", required = true)
    protected java.lang.String kandeId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected XKandeliik kandeliik;
    protected SeisundType seisund;
    @XmlElement(name = "eelmine_lahend")
    protected java.lang.String eelmineLahend;
    @XmlElement(name = "kande_kuupaev", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kandeKuupaev;
    @XmlElement(required = true)
    protected SooritakanneAmetitoiming ametitoiming;
    protected RiigiloivTypeArray riigiloivud;
    @XmlElement(name = "kande_sisu")
    protected SooritakanneKandesisuv2 kandeSisu;
    protected java.lang.String markus;
    protected DokumentTypeArray dokumendid;
    @XmlElement(name = "registri_piirkond")
    protected java.lang.String registriPiirkond;

    /**
     * Gets the value of the kandeId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKandeId() {
        return kandeId;
    }

    /**
     * Sets the value of the kandeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKandeId(java.lang.String value) {
        this.kandeId = value;
    }

    /**
     * Gets the value of the kandeliik property.
     * 
     * @return
     *     possible object is
     *     {@link XKandeliik }
     *     
     */
    public XKandeliik getKandeliik() {
        return kandeliik;
    }

    /**
     * Sets the value of the kandeliik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XKandeliik }
     *     
     */
    public void setKandeliik(XKandeliik value) {
        this.kandeliik = value;
    }

    /**
     * Gets the value of the seisund property.
     * 
     * @return
     *     possible object is
     *     {@link SeisundType }
     *     
     */
    public SeisundType getSeisund() {
        return seisund;
    }

    /**
     * Sets the value of the seisund property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeisundType }
     *     
     */
    public void setSeisund(SeisundType value) {
        this.seisund = value;
    }

    /**
     * Gets the value of the eelmineLahend property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEelmineLahend() {
        return eelmineLahend;
    }

    /**
     * Sets the value of the eelmineLahend property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEelmineLahend(java.lang.String value) {
        this.eelmineLahend = value;
    }

    /**
     * Gets the value of the kandeKuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKandeKuupaev() {
        return kandeKuupaev;
    }

    /**
     * Sets the value of the kandeKuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKandeKuupaev(XMLGregorianCalendar value) {
        this.kandeKuupaev = value;
    }

    /**
     * Gets the value of the ametitoiming property.
     * 
     * @return
     *     possible object is
     *     {@link SooritakanneAmetitoiming }
     *     
     */
    public SooritakanneAmetitoiming getAmetitoiming() {
        return ametitoiming;
    }

    /**
     * Sets the value of the ametitoiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link SooritakanneAmetitoiming }
     *     
     */
    public void setAmetitoiming(SooritakanneAmetitoiming value) {
        this.ametitoiming = value;
    }

    /**
     * Gets the value of the riigiloivud property.
     * 
     * @return
     *     possible object is
     *     {@link RiigiloivTypeArray }
     *     
     */
    public RiigiloivTypeArray getRiigiloivud() {
        return riigiloivud;
    }

    /**
     * Sets the value of the riigiloivud property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiigiloivTypeArray }
     *     
     */
    public void setRiigiloivud(RiigiloivTypeArray value) {
        this.riigiloivud = value;
    }

    /**
     * Gets the value of the kandeSisu property.
     * 
     * @return
     *     possible object is
     *     {@link SooritakanneKandesisuv2 }
     *     
     */
    public SooritakanneKandesisuv2 getKandeSisu() {
        return kandeSisu;
    }

    /**
     * Sets the value of the kandeSisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SooritakanneKandesisuv2 }
     *     
     */
    public void setKandeSisu(SooritakanneKandesisuv2 value) {
        this.kandeSisu = value;
    }

    /**
     * Gets the value of the markus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMarkus() {
        return markus;
    }

    /**
     * Sets the value of the markus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMarkus(java.lang.String value) {
        this.markus = value;
    }

    /**
     * Gets the value of the dokumendid property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentTypeArray }
     *     
     */
    public DokumentTypeArray getDokumendid() {
        return dokumendid;
    }

    /**
     * Sets the value of the dokumendid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentTypeArray }
     *     
     */
    public void setDokumendid(DokumentTypeArray value) {
        this.dokumendid = value;
    }

    /**
     * Gets the value of the registriPiirkond property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRegistriPiirkond() {
        return registriPiirkond;
    }

    /**
     * Sets the value of the registriPiirkond property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRegistriPiirkond(java.lang.String value) {
        this.registriPiirkond = value;
    }

}