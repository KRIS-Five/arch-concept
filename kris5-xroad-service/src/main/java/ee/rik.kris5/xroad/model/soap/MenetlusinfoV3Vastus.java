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
 * <p>Java class for menetlusinfo_v3_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="menetlusinfo_v3_vastus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="menetlus_konteiner" type="{http://producers.arireg.xtee.riik.ee/producer/arireg}menetlusinfo_v3_menetlused" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menetlusinfo_v3_vastus", propOrder = {
    "menetlusKonteiner"
})
public class MenetlusinfoV3Vastus {

    @XmlElement(name = "menetlus_konteiner", nillable = true)
    protected List<MenetlusinfoV3Menetlused> menetlusKonteiner;

    /**
     * Gets the value of the menetlusKonteiner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menetlusKonteiner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenetlusKonteiner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenetlusinfoV3Menetlused }
     * 
     * 
     */
    public List<MenetlusinfoV3Menetlused> getMenetlusKonteiner() {
        if (menetlusKonteiner == null) {
            menetlusKonteiner = new ArrayList<MenetlusinfoV3Menetlused>();
        }
        return this.menetlusKonteiner;
    }

}
