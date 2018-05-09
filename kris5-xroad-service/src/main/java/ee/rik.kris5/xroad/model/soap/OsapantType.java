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
 * <p>Java class for osapantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osapantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pandipidajad" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}kapitaliOmanikTypeArray"/&gt;
 *         &lt;element name="liik" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}x_pandiliik"/&gt;
 *         &lt;element name="jarjekoht" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="omandiliik" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}x_omandiliik"/&gt;
 *         &lt;element name="algus" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lopp" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osapantType", propOrder = {
    "pandipidajad",
    "liik",
    "jarjekoht",
    "omandiliik",
    "algus",
    "lopp"
})
public class OsapantType {

    @XmlElement(required = true)
    protected KapitaliOmanikTypeArray pandipidajad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected XPandiliik liik;
    protected short jarjekoht;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected XOmandiliik omandiliik;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lopp;

    /**
     * Gets the value of the pandipidajad property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaliOmanikTypeArray }
     *     
     */
    public KapitaliOmanikTypeArray getPandipidajad() {
        return pandipidajad;
    }

    /**
     * Sets the value of the pandipidajad property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaliOmanikTypeArray }
     *     
     */
    public void setPandipidajad(KapitaliOmanikTypeArray value) {
        this.pandipidajad = value;
    }

    /**
     * Gets the value of the liik property.
     * 
     * @return
     *     possible object is
     *     {@link XPandiliik }
     *     
     */
    public XPandiliik getLiik() {
        return liik;
    }

    /**
     * Sets the value of the liik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPandiliik }
     *     
     */
    public void setLiik(XPandiliik value) {
        this.liik = value;
    }

    /**
     * Gets the value of the jarjekoht property.
     * 
     */
    public short getJarjekoht() {
        return jarjekoht;
    }

    /**
     * Sets the value of the jarjekoht property.
     * 
     */
    public void setJarjekoht(short value) {
        this.jarjekoht = value;
    }

    /**
     * Gets the value of the omandiliik property.
     * 
     * @return
     *     possible object is
     *     {@link XOmandiliik }
     *     
     */
    public XOmandiliik getOmandiliik() {
        return omandiliik;
    }

    /**
     * Sets the value of the omandiliik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOmandiliik }
     *     
     */
    public void setOmandiliik(XOmandiliik value) {
        this.omandiliik = value;
    }

    /**
     * Gets the value of the algus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgus() {
        return algus;
    }

    /**
     * Sets the value of the algus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgus(XMLGregorianCalendar value) {
        this.algus = value;
    }

    /**
     * Gets the value of the lopp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLopp() {
        return lopp;
    }

    /**
     * Sets the value of the lopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLopp(XMLGregorianCalendar value) {
        this.lopp = value;
    }

}