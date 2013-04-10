//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.10 um 01:10:36 PM CEST 
//


package Aufgabe4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rezept" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Untertitel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="Zutaten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Zutat" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Bezeichnung" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="Einheit">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="g"/>
 *                                           &lt;enumeration value="TL"/>
 *                                           &lt;enumeration value="Pkt."/>
 *                                           &lt;enumeration value="Stk."/>
 *                                           &lt;enumeration value="ml"/>
 *                                           &lt;enumeration value="l"/>
 *                                           &lt;enumeration value="Pck."/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Portionen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Arbeitszeit">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Zeitangabe">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Min."/>
 *                                           &lt;enumeration value="Std."/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Ruhezeit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Zeitangabe">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Min."/>
 *                                           &lt;enumeration value="Std."/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Schwierigkeitsgrad">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Typ">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="simpel"/>
 *                                           &lt;enumeration value="normal"/>
 *                                           &lt;enumeration value="pfiffig"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Brennwert_p.P.">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Einheit">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="kcal"/>
 *                                           &lt;enumeration value="keine Angabe"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Zubereitungsschritte">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Zubereitungsschritt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Kommentare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                                     &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezept"
})
@XmlRootElement(name = "Rezepte")
public class Rezepte {

    @XmlElement(name = "Rezept", required = true)
    protected List<Rezepte.Rezept> rezept;

    /**
     * Gets the value of the rezept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRezept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rezepte.Rezept }
     * 
     * 
     */
    public List<Rezepte.Rezept> getRezept() {
        if (rezept == null) {
            rezept = new ArrayList<Rezepte.Rezept>();
        }
        return this.rezept;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Untertitel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Bild" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="Zutaten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Zutat" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Bezeichnung" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="Einheit">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="g"/>
     *                                 &lt;enumeration value="TL"/>
     *                                 &lt;enumeration value="Pkt."/>
     *                                 &lt;enumeration value="Stk."/>
     *                                 &lt;enumeration value="ml"/>
     *                                 &lt;enumeration value="l"/>
     *                                 &lt;enumeration value="Pck."/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Portionen" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Arbeitszeit">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Zeitangabe">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Min."/>
     *                                 &lt;enumeration value="Std."/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Ruhezeit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Zeitangabe">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Min."/>
     *                                 &lt;enumeration value="Std."/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Schwierigkeitsgrad">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Typ">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="simpel"/>
     *                                 &lt;enumeration value="normal"/>
     *                                 &lt;enumeration value="pfiffig"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Brennwert_p.P.">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Einheit">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="kcal"/>
     *                                 &lt;enumeration value="keine Angabe"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Zubereitungsschritte">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Zubereitungsschritt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Kommentare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titel",
        "untertitel",
        "autor",
        "bild",
        "zutaten",
        "zubereitung",
        "kommentare"
    })
    public static class Rezept {

        @XmlElement(name = "Titel", required = true)
        protected String titel;
        @XmlElement(name = "Untertitel")
        protected String untertitel;
        @XmlElement(name = "Autor", required = true)
        protected String autor;
        @XmlElement(name = "Bild")
        @XmlSchemaType(name = "anyURI")
        protected String bild;
        @XmlElement(name = "Zutaten", required = true)
        protected Rezepte.Rezept.Zutaten zutaten;
        @XmlElement(name = "Zubereitung", required = true)
        protected Rezepte.Rezept.Zubereitung zubereitung;
        @XmlElement(name = "Kommentare")
        protected Rezepte.Rezept.Kommentare kommentare;

        /**
         * Ruft den Wert der titel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitel() {
            return titel;
        }

        /**
         * Legt den Wert der titel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitel(String value) {
            this.titel = value;
        }

        /**
         * Ruft den Wert der untertitel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUntertitel() {
            return untertitel;
        }

        /**
         * Legt den Wert der untertitel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUntertitel(String value) {
            this.untertitel = value;
        }

        /**
         * Ruft den Wert der autor-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutor() {
            return autor;
        }

        /**
         * Legt den Wert der autor-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutor(String value) {
            this.autor = value;
        }

        /**
         * Ruft den Wert der bild-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBild() {
            return bild;
        }

        /**
         * Legt den Wert der bild-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBild(String value) {
            this.bild = value;
        }

        /**
         * Ruft den Wert der zutaten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Zutaten }
         *     
         */
        public Rezepte.Rezept.Zutaten getZutaten() {
            return zutaten;
        }

        /**
         * Legt den Wert der zutaten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Zutaten }
         *     
         */
        public void setZutaten(Rezepte.Rezept.Zutaten value) {
            this.zutaten = value;
        }

        /**
         * Ruft den Wert der zubereitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Zubereitung }
         *     
         */
        public Rezepte.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Legt den Wert der zubereitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Rezepte.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Ruft den Wert der kommentare-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezepte.Rezept.Kommentare }
         *     
         */
        public Rezepte.Rezept.Kommentare getKommentare() {
            return kommentare;
        }

        /**
         * Legt den Wert der kommentare-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezepte.Rezept.Kommentare }
         *     
         */
        public void setKommentare(Rezepte.Rezept.Kommentare value) {
            this.kommentare = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
         *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kommentar"
        })
        public static class Kommentare {

            @XmlElement(name = "Kommentar")
            protected List<Rezepte.Rezept.Kommentare.Kommentar> kommentar;

            /**
             * Gets the value of the kommentar property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommentar property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKommentar().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Kommentare.Kommentar }
             * 
             * 
             */
            public List<Rezepte.Rezept.Kommentare.Kommentar> getKommentar() {
                if (kommentar == null) {
                    kommentar = new ArrayList<Rezepte.Rezept.Kommentare.Kommentar>();
                }
                return this.kommentar;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="Uhrzeit" type="{http://www.w3.org/2001/XMLSchema}time" />
             *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Kommentar {

                @XmlAttribute(name = "Autor")
                protected String autor;
                @XmlAttribute(name = "Datum")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar datum;
                @XmlAttribute(name = "Uhrzeit")
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar uhrzeit;
                @XmlAttribute(name = "Text")
                protected String text;

                /**
                 * Ruft den Wert der autor-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAutor() {
                    return autor;
                }

                /**
                 * Legt den Wert der autor-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAutor(String value) {
                    this.autor = value;
                }

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDatum() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDatum(XMLGregorianCalendar value) {
                    this.datum = value;
                }

                /**
                 * Ruft den Wert der uhrzeit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getUhrzeit() {
                    return uhrzeit;
                }

                /**
                 * Legt den Wert der uhrzeit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setUhrzeit(XMLGregorianCalendar value) {
                    this.uhrzeit = value;
                }

                /**
                 * Ruft den Wert der text-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Legt den Wert der text-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Portionen" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Arbeitszeit">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Zeitangabe">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="Min."/>
         *                       &lt;enumeration value="Std."/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Ruhezeit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Zeitangabe">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="Min."/>
         *                       &lt;enumeration value="Std."/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Schwierigkeitsgrad">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Typ">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="simpel"/>
         *                       &lt;enumeration value="normal"/>
         *                       &lt;enumeration value="pfiffig"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Brennwert_p.P.">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Einheit">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="kcal"/>
         *                       &lt;enumeration value="keine Angabe"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Zubereitungsschritte">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Zubereitungsschritt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "portionen",
            "arbeitszeit",
            "ruhezeit",
            "schwierigkeitsgrad",
            "brennwertPP",
            "zubereitungsschritte"
        })
        public static class Zubereitung {

            @XmlElement(name = "Portionen")
            protected int portionen;
            @XmlElement(name = "Arbeitszeit", required = true)
            protected Rezepte.Rezept.Zubereitung.Arbeitszeit arbeitszeit;
            @XmlElement(name = "Ruhezeit")
            protected Rezepte.Rezept.Zubereitung.Ruhezeit ruhezeit;
            @XmlElement(name = "Schwierigkeitsgrad", required = true)
            protected Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad schwierigkeitsgrad;
            @XmlElement(name = "Brennwert_p.P.", required = true)
            protected Rezepte.Rezept.Zubereitung.BrennwertPP brennwertPP;
            @XmlElement(name = "Zubereitungsschritte", required = true)
            protected Rezepte.Rezept.Zubereitung.Zubereitungsschritte zubereitungsschritte;

            /**
             * Ruft den Wert der portionen-Eigenschaft ab.
             * 
             */
            public int getPortionen() {
                return portionen;
            }

            /**
             * Legt den Wert der portionen-Eigenschaft fest.
             * 
             */
            public void setPortionen(int value) {
                this.portionen = value;
            }

            /**
             * Ruft den Wert der arbeitszeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
             *     
             */
            public Rezepte.Rezept.Zubereitung.Arbeitszeit getArbeitszeit() {
                return arbeitszeit;
            }

            /**
             * Legt den Wert der arbeitszeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
             *     
             */
            public void setArbeitszeit(Rezepte.Rezept.Zubereitung.Arbeitszeit value) {
                this.arbeitszeit = value;
            }

            /**
             * Ruft den Wert der ruhezeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.Ruhezeit }
             *     
             */
            public Rezepte.Rezept.Zubereitung.Ruhezeit getRuhezeit() {
                return ruhezeit;
            }

            /**
             * Legt den Wert der ruhezeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.Ruhezeit }
             *     
             */
            public void setRuhezeit(Rezepte.Rezept.Zubereitung.Ruhezeit value) {
                this.ruhezeit = value;
            }

            /**
             * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad }
             *     
             */
            public Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad getSchwierigkeitsgrad() {
                return schwierigkeitsgrad;
            }

            /**
             * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad }
             *     
             */
            public void setSchwierigkeitsgrad(Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad value) {
                this.schwierigkeitsgrad = value;
            }

            /**
             * Ruft den Wert der brennwertPP-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.BrennwertPP }
             *     
             */
            public Rezepte.Rezept.Zubereitung.BrennwertPP getBrennwertPP() {
                return brennwertPP;
            }

            /**
             * Legt den Wert der brennwertPP-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.BrennwertPP }
             *     
             */
            public void setBrennwertPP(Rezepte.Rezept.Zubereitung.BrennwertPP value) {
                this.brennwertPP = value;
            }

            /**
             * Ruft den Wert der zubereitungsschritte-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezepte.Rezept.Zubereitung.Zubereitungsschritte }
             *     
             */
            public Rezepte.Rezept.Zubereitung.Zubereitungsschritte getZubereitungsschritte() {
                return zubereitungsschritte;
            }

            /**
             * Legt den Wert der zubereitungsschritte-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezepte.Rezept.Zubereitung.Zubereitungsschritte }
             *     
             */
            public void setZubereitungsschritte(Rezepte.Rezept.Zubereitung.Zubereitungsschritte value) {
                this.zubereitungsschritte = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Zeitangabe">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="Min."/>
             *             &lt;enumeration value="Std."/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Arbeitszeit {

                @XmlAttribute(name = "Dauer")
                protected Integer dauer;
                @XmlAttribute(name = "Zeitangabe")
                protected String zeitangabe;

                /**
                 * Ruft den Wert der dauer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDauer() {
                    return dauer;
                }

                /**
                 * Legt den Wert der dauer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDauer(Integer value) {
                    this.dauer = value;
                }

                /**
                 * Ruft den Wert der zeitangabe-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZeitangabe() {
                    return zeitangabe;
                }

                /**
                 * Legt den Wert der zeitangabe-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZeitangabe(String value) {
                    this.zeitangabe = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Einheit">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="kcal"/>
             *             &lt;enumeration value="keine Angabe"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BrennwertPP {

                @XmlAttribute(name = "Einheit")
                protected String einheit;
                @XmlAttribute(name = "Menge")
                protected Integer menge;

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMenge(Integer value) {
                    this.menge = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Dauer" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Zeitangabe">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="Min."/>
             *             &lt;enumeration value="Std."/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Ruhezeit {

                @XmlAttribute(name = "Dauer")
                protected Integer dauer;
                @XmlAttribute(name = "Zeitangabe")
                protected String zeitangabe;

                /**
                 * Ruft den Wert der dauer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDauer() {
                    return dauer;
                }

                /**
                 * Legt den Wert der dauer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDauer(Integer value) {
                    this.dauer = value;
                }

                /**
                 * Ruft den Wert der zeitangabe-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZeitangabe() {
                    return zeitangabe;
                }

                /**
                 * Legt den Wert der zeitangabe-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZeitangabe(String value) {
                    this.zeitangabe = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Typ">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="simpel"/>
             *             &lt;enumeration value="normal"/>
             *             &lt;enumeration value="pfiffig"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Schwierigkeitsgrad {

                @XmlAttribute(name = "Typ")
                protected String typ;

                /**
                 * Ruft den Wert der typ-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTyp() {
                    return typ;
                }

                /**
                 * Legt den Wert der typ-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTyp(String value) {
                    this.typ = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Zubereitungsschritt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "zubereitungsschritt"
            })
            public static class Zubereitungsschritte {

                @XmlElement(name = "Zubereitungsschritt", required = true)
                protected List<String> zubereitungsschritt;

                /**
                 * Gets the value of the zubereitungsschritt property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the zubereitungsschritt property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getZubereitungsschritt().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getZubereitungsschritt() {
                    if (zubereitungsschritt == null) {
                        zubereitungsschritt = new ArrayList<String>();
                    }
                    return this.zubereitungsschritt;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Zutat" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Bezeichnung" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="Einheit">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="g"/>
         *                       &lt;enumeration value="TL"/>
         *                       &lt;enumeration value="Pkt."/>
         *                       &lt;enumeration value="Stk."/>
         *                       &lt;enumeration value="ml"/>
         *                       &lt;enumeration value="l"/>
         *                       &lt;enumeration value="Pck."/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zutat"
        })
        public static class Zutaten {

            @XmlElement(name = "Zutat", required = true)
            protected List<Rezepte.Rezept.Zutaten.Zutat> zutat;

            /**
             * Gets the value of the zutat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the zutat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getZutat().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezepte.Rezept.Zutaten.Zutat }
             * 
             * 
             */
            public List<Rezepte.Rezept.Zutaten.Zutat> getZutat() {
                if (zutat == null) {
                    zutat = new ArrayList<Rezepte.Rezept.Zutaten.Zutat>();
                }
                return this.zutat;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Bezeichnung" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Menge" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="Einheit">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="g"/>
             *             &lt;enumeration value="TL"/>
             *             &lt;enumeration value="Pkt."/>
             *             &lt;enumeration value="Stk."/>
             *             &lt;enumeration value="ml"/>
             *             &lt;enumeration value="l"/>
             *             &lt;enumeration value="Pck."/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Zutat {

                @XmlAttribute(name = "Bezeichnung", required = true)
                protected String bezeichnung;
                @XmlAttribute(name = "Menge")
                protected Float menge;
                @XmlAttribute(name = "Einheit")
                protected String einheit;

                /**
                 * Ruft den Wert der bezeichnung-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBezeichnung() {
                    return bezeichnung;
                }

                /**
                 * Legt den Wert der bezeichnung-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBezeichnung(String value) {
                    this.bezeichnung = value;
                }

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setMenge(Float value) {
                    this.menge = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

            }

        }

    }

}
