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
 * <p>Java class for x_joustumise_tunnus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_joustumise_tunnus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_joustumise_tunnus")
@XmlEnum
public enum XJoustumiseTunnus {

    M,
    T,
    L,
    K,
    J,
    E,
    A;

    public java.lang.String value() {
        return name();
    }

    public static XJoustumiseTunnus fromValue(java.lang.String v) {
        return valueOf(v);
    }

}