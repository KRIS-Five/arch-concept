//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seotud_isiku_otsing_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seotud_isiku_otsing_vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isikud" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}fys_jur_isik" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isikute_arv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seotud_isiku_otsing_vastus", propOrder = {
    "isikud",
    "isikuteArv"
})
public class SeotudIsikuOtsingVastus {

    protected List<FysJurIsik> isikud;
    @XmlElement(name = "isikute_arv")
    protected java.lang.Integer isikuteArv;

    /**
     * Gets the value of the isikud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isikud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsikud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FysJurIsik }
     * 
     * 
     */
    public List<FysJurIsik> getIsikud() {
        if (isikud == null) {
            isikud = new ArrayList<FysJurIsik>();
        }
        return this.isikud;
    }

    /**
     * Gets the value of the isikuteArv property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getIsikuteArv() {
        return isikuteArv;
    }

    /**
     * Sets the value of the isikuteArv property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setIsikuteArv(java.lang.Integer value) {
        this.isikuteArv = value;
    }

}
