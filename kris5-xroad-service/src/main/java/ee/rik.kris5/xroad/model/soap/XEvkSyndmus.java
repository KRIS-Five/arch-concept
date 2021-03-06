//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.29 at 08:17:10 PM EEST 
//


package ee.rik.kris5.xroad.model.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_evk_syndmus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_evk_syndmus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ESMAREG"/&gt;
 *     &lt;enumeration value="KAPMUUT"/&gt;
 *     &lt;enumeration value="POHMUUT"/&gt;
 *     &lt;enumeration value="ARINMUUT"/&gt;
 *     &lt;enumeration value="ETVMUUT"/&gt;
 *     &lt;enumeration value="YHIN"/&gt;
 *     &lt;enumeration value="JAGUN"/&gt;
 *     &lt;enumeration value="REGKUST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_evk_syndmus")
@XmlEnum
public enum XEvkSyndmus {


    /**
     * esmaregistreerimine
     * 
     */
    ESMAREG,

    /**
     * aktsia- või osakapitali suurendamine või vähendamine
     * 
     */
    KAPMUUT,

    /**
     * põhikirja muutmine
     * 
     */
    POHMUUT,

    /**
     * ärinime muutmine
     * 
     */
    ARINMUUT,

    /**
     * ettevõtlusvormi muutmine
     * 
     */
    ETVMUUT,

    /**
     * ühinemine
     * 
     */
    YHIN,

    /**
     * jagunemine
     * 
     */
    JAGUN,

    /**
     * registrist kustutamine
     * 
     */
    REGKUST;

    public java.lang.String value() {
        return name();
    }

    public static XEvkSyndmus fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
