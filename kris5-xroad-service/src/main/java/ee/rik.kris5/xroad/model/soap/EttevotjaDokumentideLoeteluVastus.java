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
 * <p>Java class for ettevotja_dokumentide_loetelu_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ettevotja_dokumentide_loetelu_vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ettevotja_dokumendid" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}ettevotja_dokument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ettevotja_dokumentide_loetelu_vastus", propOrder = {
    "ettevotjaDokumendid"
})
public class EttevotjaDokumentideLoeteluVastus {

    @XmlElement(name = "ettevotja_dokumendid")
    protected List<EttevotjaDokument> ettevotjaDokumendid;

    /**
     * Gets the value of the ettevotjaDokumendid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ettevotjaDokumendid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEttevotjaDokumendid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EttevotjaDokument }
     * 
     * 
     */
    public List<EttevotjaDokument> getEttevotjaDokumendid() {
        if (ettevotjaDokumendid == null) {
            ettevotjaDokumendid = new ArrayList<EttevotjaDokument>();
        }
        return this.ettevotjaDokumendid;
    }

}
