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
 * <p>Java class for x_oigusliku_vormi_alaliik.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_oigusliku_vormi_alaliik"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TAVA"/&gt;
 *     &lt;enumeration value="ERAK"/&gt;
 *     &lt;enumeration value="KORÜH"/&gt;
 *     &lt;enumeration value="ELÜH"/&gt;
 *     &lt;enumeration value="MUU"/&gt;
 *     &lt;enumeration value="AMETÜ"/&gt;
 *     &lt;enumeration value="LTÜH"/&gt;
 *     &lt;enumeration value="ITÜH"/&gt;
 *     &lt;enumeration value="PTÜH"/&gt;
 *     &lt;enumeration value="KIRIK"/&gt;
 *     &lt;enumeration value="KOGL"/&gt;
 *     &lt;enumeration value="KOGUD"/&gt;
 *     &lt;enumeration value="KLOOS"/&gt;
 *     &lt;enumeration value="KOYL"/&gt;
 *     &lt;enumeration value="HÜ"/&gt;
 *     &lt;enumeration value="LLIIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_oigusliku_vormi_alaliik")
@XmlEnum
public enum XOiguslikuVormiAlaliik {

    TAVA,
    ERAK,
    KORÜH,
    ELÜH,
    MUU,
    AMETÜ,
    LTÜH,
    ITÜH,
    PTÜH,
    KIRIK,
    KOGL,
    KOGUD,
    KLOOS,
    KOYL,
    HÜ,
    LLIIT;

    public java.lang.String value() {
        return name();
    }

    public static XOiguslikuVormiAlaliik fromValue(java.lang.String v) {
        return valueOf(v);
    }

}