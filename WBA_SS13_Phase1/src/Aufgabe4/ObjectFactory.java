//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.10 um 01:10:36 PM CEST 
//


package Aufgabe4;


import javax.xml.bind.annotation.XmlRegistry;

import Aufgabe4.Rezepte.Rezept;
import Aufgabe4.Rezepte.Rezept.Kommentare;
import Aufgabe4.Rezepte.Rezept.Zubereitung;
import Aufgabe4.Rezepte.Rezept.Zutaten;
import Aufgabe4.Rezepte.Rezept.Kommentare.Kommentar;
import Aufgabe4.Rezepte.Rezept.Zubereitung.Arbeitszeit;
import Aufgabe4.Rezepte.Rezept.Zubereitung.BrennwertPP;
import Aufgabe4.Rezepte.Rezept.Zubereitung.Ruhezeit;
import Aufgabe4.Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad;
import Aufgabe4.Rezepte.Rezept.Zubereitung.Zubereitungsschritte;
import Aufgabe4.Rezepte.Rezept.Zutaten.Zutat;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.aufgabe3d package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.aufgabe3d
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezepte }
     * 
     */
    public Rezepte createRezepte() {
        return new Rezepte();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept }
     * 
     */
    public Rezepte.Rezept createRezepteRezept() {
        return new Rezepte.Rezept();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Kommentare }
     * 
     */
    public Rezepte.Rezept.Kommentare createRezepteRezeptKommentare() {
        return new Rezepte.Rezept.Kommentare();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung }
     * 
     */
    public Rezepte.Rezept.Zubereitung createRezepteRezeptZubereitung() {
        return new Rezepte.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten }
     * 
     */
    public Rezepte.Rezept.Zutaten createRezepteRezeptZutaten() {
        return new Rezepte.Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Kommentare.Kommentar }
     * 
     */
    public Rezepte.Rezept.Kommentare.Kommentar createRezepteRezeptKommentareKommentar() {
        return new Rezepte.Rezept.Kommentare.Kommentar();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.Arbeitszeit }
     * 
     */
    public Rezepte.Rezept.Zubereitung.Arbeitszeit createRezepteRezeptZubereitungArbeitszeit() {
        return new Rezepte.Rezept.Zubereitung.Arbeitszeit();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.Ruhezeit }
     * 
     */
    public Rezepte.Rezept.Zubereitung.Ruhezeit createRezepteRezeptZubereitungRuhezeit() {
        return new Rezepte.Rezept.Zubereitung.Ruhezeit();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad }
     * 
     */
    public Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad createRezepteRezeptZubereitungSchwierigkeitsgrad() {
        return new Rezepte.Rezept.Zubereitung.Schwierigkeitsgrad();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.BrennwertPP }
     * 
     */
    public Rezepte.Rezept.Zubereitung.BrennwertPP createRezepteRezeptZubereitungBrennwertPP() {
        return new Rezepte.Rezept.Zubereitung.BrennwertPP();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.Zubereitungsschritte }
     * 
     */
    public Rezepte.Rezept.Zubereitung.Zubereitungsschritte createRezepteRezeptZubereitungZubereitungsschritte() {
        return new Rezepte.Rezept.Zubereitung.Zubereitungsschritte();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten.Zutat }
     * 
     */
    public Rezepte.Rezept.Zutaten.Zutat createRezepteRezeptZutatenZutat() {
        return new Rezepte.Rezept.Zutaten.Zutat();
    }

}
