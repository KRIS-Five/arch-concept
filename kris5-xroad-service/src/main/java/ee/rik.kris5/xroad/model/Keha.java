package ee.rik.kris5.xroad.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;

@XmlType(name = "paringliht_v3_paring", propOrder = {
        "evnimi",
        "ariregistriKood",
        "evarv",
        "keel"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Keha {

    protected java.lang.String evnimi;
    @XmlElement(name = "ariregistri_kood")
    protected BigInteger ariregistriKood;
    protected BigInteger evarv;
    protected java.lang.String keel;

    /**
     * Gets the value of the evnimi property.
     *
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *
     */
    public java.lang.String getEvnimi() {
        return evnimi;
    }

    /**
     * Sets the value of the evnimi property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *
     */
    public void setEvnimi(java.lang.String value) {
        this.evnimi = value;
    }

    /**
     * Gets the value of the ariregistriKood property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getAriregistriKood() {
        return ariregistriKood;
    }

    /**
     * Sets the value of the ariregistriKood property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setAriregistriKood(BigInteger value) {
        this.ariregistriKood = value;
    }

    /**
     * Gets the value of the evarv property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getEvarv() {
        return evarv;
    }

    /**
     * Sets the value of the evarv property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setEvarv(BigInteger value) {
        this.evarv = value;
    }

    /**
     * Gets the value of the keel property.
     *
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *
     */
    public java.lang.String getKeel() {
        return keel;
    }

    /**
     * Sets the value of the keel property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *
     */
    public void setKeel(java.lang.String value) {
        this.keel = value;
    }


}