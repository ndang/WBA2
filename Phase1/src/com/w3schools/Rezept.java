//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 11:47:12 PM CEST 
//


package com.w3schools;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3schools.com}zutaten"/>
 *         &lt;element ref="{http://www.w3schools.com}schritte"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stunde" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="minuten" type="{http://www.w3schools.com}min" />
 *       &lt;attribute name="schwierigkeit" type="{http://www.w3schools.com}stufe" />
 *       &lt;attribute name="kcal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="portionen" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zutaten",
    "schritte"
})
@XmlRootElement(name = "rezept")
public class Rezept {

    @XmlElement(required = true)
    protected ZutatenTyp zutaten;
    @XmlElement(required = true)
    protected SchritteTyp schritte;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "stunde")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stunde;
    @XmlAttribute(name = "minuten")
    protected Integer minuten;
    @XmlAttribute(name = "schwierigkeit")
    protected String schwierigkeit;
    @XmlAttribute(name = "kcal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger kcal;
    @XmlAttribute(name = "portionen", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger portionen;

    /**
     * Gets the value of the zutaten property.
     * 
     * @return
     *     possible object is
     *     {@link ZutatenTyp }
     *     
     */
    public ZutatenTyp getZutaten() {
        return zutaten;
    }

    /**
     * Sets the value of the zutaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZutatenTyp }
     *     
     */
    public void setZutaten(ZutatenTyp value) {
        this.zutaten = value;
    }

    /**
     * Gets the value of the schritte property.
     * 
     * @return
     *     possible object is
     *     {@link SchritteTyp }
     *     
     */
    public SchritteTyp getSchritte() {
        return schritte;
    }

    /**
     * Sets the value of the schritte property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchritteTyp }
     *     
     */
    public void setSchritte(SchritteTyp value) {
        this.schritte = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stunde property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStunde() {
        return stunde;
    }

    /**
     * Sets the value of the stunde property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStunde(BigInteger value) {
        this.stunde = value;
    }

    /**
     * Gets the value of the minuten property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinuten() {
        return minuten;
    }

    /**
     * Sets the value of the minuten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinuten(Integer value) {
        this.minuten = value;
    }

    /**
     * Gets the value of the schwierigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Sets the value of the schwierigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchwierigkeit(String value) {
        this.schwierigkeit = value;
    }

    /**
     * Gets the value of the kcal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKcal() {
        return kcal;
    }

    /**
     * Sets the value of the kcal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKcal(BigInteger value) {
        this.kcal = value;
    }

    /**
     * Gets the value of the portionen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortionen() {
        return portionen;
    }

    /**
     * Sets the value of the portionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortionen(BigInteger value) {
        this.portionen = value;
    }

}