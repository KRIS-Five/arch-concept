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
 * <p>Java class for x_esindustyyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_esindustyyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PHEIE"/&gt;
 *     &lt;enumeration value="JTEHP"/&gt;
 *     &lt;enumeration value="AJPES"/&gt;
 *     &lt;enumeration value="ERES"/&gt;
 *     &lt;enumeration value="MARKP"/&gt;
 *     &lt;enumeration value="PHES"/&gt;
 *     &lt;enumeration value="YHES"/&gt;
 *     &lt;enumeration value="YHPRO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_esindustyyp")
@XmlEnum
public enum XEsindustyyp {

    PHEIE,
    JTEHP,
    AJPES,
    ERES,
    MARKP,
    PHES,
    YHES,
    YHPRO;

    public java.lang.String value() {
        return name();
    }

    public static XEsindustyyp fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
