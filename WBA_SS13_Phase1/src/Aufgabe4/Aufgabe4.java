package Aufgabe4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import Aufgabe4.Rezepte.Rezept.Kommentare.Kommentar;

public class Aufgabe4 {

  
  static Scanner scanner = new Scanner (System.in);
  /**
   * @param args
   * @throws JAXBException 
   * @throws IOException 
   */
  public static void main(String[] args) throws JAXBException, IOException{
    Boolean menue = true;
    int eingabe = 0;
    
    //Die Variable "datei" wird hier angelegt, um die .xml-Datei darin zu speichern
    File datei = new File("/Users/Sven/git/WBA2-SS13-Phase-1/WBA_SS13_Phase1/src/Aufgabe4/Aufgabe3d.xml");    
     
    //Hier wird das JAXB Objekt erstellt
    JAXBContext context = JAXBContext.newInstance(Rezepte.class);
    
    //Marshaller
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    
    //Unmarshaller
    Unmarshaller um = context.createUnmarshaller();
    Rezepte rezepte = (Rezepte) um.unmarshal (datei);
      
    //So lange die while-Schleife = true ist wird das Menue ausgeführt
    //Es ist moeglich die XML-Daten mit einer 1 auszugeben, neue Kommentare mit einer 2 an ein Rezept hinzuzufügen oder das Programm mit einer 3 zu beenden  
    while (menue == true){
      System.out.println("");
      System.out.println("Waehlen Sie die 1 für die Ausgabe der XML-Datei: ");
      System.out.println("Waehlen Sie die 2 für einen neuen Kommentar: ");
      System.out.println("Waehlen Sie die 3 zum Beenden: ");
      System.out.println("");
        
      eingabe = scanner.nextInt();
        
      if(eingabe == 1)
        ausgabe(rezepte);
        
      if(eingabe == 2)
        neuerKommentar(rezepte, datei, m);
          
      if(eingabe == 3)
        menue = false;
        
      if(eingabe < 1 || eingabe > 3)
        System.out.println("Bitte einen Wert zwischen 1 und 3 eingeben: ");
      }
      
  }
  
  public static void ausgabe(Rezepte rezepte){
    for (int i = 0; i < rezepte.getRezept().size();i++){
        
        //Allgemeine Rezeptangaben
        
        //Titel
        System.out.println("Titel: " + rezepte.getRezept().get(i).getTitel());
        
        //Untertiel
        if(rezepte.getRezept().get(i).untertitel != null){
          System.out.println("Untertitel: " + rezepte.getRezept().get(i).getUntertitel());
        }
        
        //Autor
        System.out.println("Autor: " + rezepte.getRezept().get(i).getAutor());
        
        //Bild
        System.out.println("Bild: " + rezepte.getRezept().get(i).getBild());
        
        //Zutaten
        for (int j = 0; j < rezepte.getRezept().get(i).getZutaten().getZutat().size();j++){
          System.out.print("Zutat: " + rezepte.getRezept().get(i).getZutaten().getZutat().get(j).getMenge() + " ");
          System.out.print(rezepte.getRezept().get(i).getZutaten().getZutat().get(j).getEinheit() + " ");
          System.out.println(rezepte.getRezept().get(i).getZutaten().getZutat().get(j).getBezeichnung());
        }
        
        //Zubereitung
        
        //Portionen
        System.out.println("Portionen: " + rezepte.getRezept().get(i).getZubereitung().getPortionen());
        
        //Arbeitszeit
        System.out.print("Arbeitszeit: " + rezepte.getRezept().get(i).getZubereitung().getArbeitszeit().getDauer() + " ");
        System.out.println(rezepte.getRezept().get(i).getZubereitung().getArbeitszeit().getZeitangabe());
        
        //Ruhezeit
        if(rezepte.getRezept().get(i).getZubereitung().ruhezeit != null){
          System.out.print("Ruhezeit: " + rezepte.getRezept().get(i).getZubereitung().getRuhezeit().getDauer() + " ");
          System.out.println(rezepte.getRezept().get(i).getZubereitung().getRuhezeit().getZeitangabe());
        }
        
        //Schwierigkeitsgrad
        System.out.println("Schwierigkeitsgrad: " + rezepte.getRezept().get(i).getZubereitung().getSchwierigkeitsgrad().getTyp());
        
        //Brennwert p.P.
        System.out.print("Brennwert p.P.: " + rezepte.getRezept().get(i).getZubereitung().getBrennwertPP().getMenge() + " ");
        System.out.println(rezepte.getRezept().get(i).getZubereitung().getBrennwertPP().getEinheit());
        
        //Zubereitungsschritte
        for (int k = 0; k < rezepte.getRezept().get(i).getZubereitung().getZubereitungsschritte().getZubereitungsschritt().size();k++){
          System.out.println("Zubereitungsschritt: " + rezepte.getRezept().get(i).getZubereitung().getZubereitungsschritte().getZubereitungsschritt().get(k));
        }
        
        //Kommentare
        for (int l = 0; l < rezepte.getRezept().get(i).getKommentare().getKommentar().size();l++){
          System.out.print("Kommentar: Autor: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(l).getAutor() + " ");
          System.out.print("Datum: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(l).getDatum() + " ");
          System.out.print("Uhrzeit: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(l).getUhrzeit() + " ");
          System.out.println("Text: " + rezepte.getRezept().get(i).getKommentare().getKommentar().get(l).getText() + " ");
        }
        
        System.out.println(" ");
      }
  }
  
  //Einen  neuen Kommentar hinzufuegen
  //Datum und Uhrzeit muessen noch eingebunden werden, bisher noch auskommentiert
  @SuppressWarnings("resource")
  public static void neuerKommentar(Rezepte rezepte, File datei, Marshaller m) throws IOException, JAXBException{
    Writer w = new FileWriter(datei);
    Kommentar kommentar = new Kommentar();
    
    int x=0, y=0;
    
    System.out.println("Welchem Rezept möchten Sie einen Kommentar hinzufügen: ");
    x = scanner.nextInt();
    
    if(x > rezepte.getRezept().size()){
      System.out.println("Gewähltes Rezept nicht verfügbar.");
      return;
    }
    
    System.out.println("Bitte geben Sie einen Autor ein: ");
    kommentar.setAutor(getString());
    //System.out.println("Bitte geben Sie ein Datum ein (JJJJ-MM-TT): ");
    //kommentar.setDatum(getString());
    //System.out.println("Bitte geben Sie eine Uhrzeit ein (HH:MM:SS): ");
    //kommentar.setAutor(getString());
    System.out.println("Bitte geben Sie einen Text ein: ");
    kommentar.setText(getString());
    
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    //x-1, damit das erste Rezept benutzt wird, um einen Kommentar dort hinzufuegen zu koennen
    y=rezepte.getRezept().get(x-1).getKommentare().getKommentar().size();
    rezepte.getRezept().get(x-1).getKommentare().getKommentar().add(y, kommentar);
    
    m.marshal(rezepte, w);
  }
  
  //diese Funktion liest die ganze Zeile ein
  public static String getString (){
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }

} 
