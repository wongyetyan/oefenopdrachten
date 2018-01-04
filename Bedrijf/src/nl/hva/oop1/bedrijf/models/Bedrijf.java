/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;

import java.util.ArrayList;
import nl.hva.oop1.bedrijf.models.Persoon;
/**
 * 
 * @author Wong David
 */
public class Bedrijf {
    
    private String naam;
    private ArrayList<Persoon> medewerkers = new ArrayList<Persoon>();
    
    
    // CONSTRUCTORS
    public Bedrijf () {
        this.naam = "XXFOUTXX";
        
    }
    
    //Constructors
     public Bedrijf ( String naam) {
         this.naam = naam;
        
    }
    // methods
     public void printInkomsten (){
         /*
         Deze methode print een lijst van medewerkers met daarbij hun
           inkomsten. Maak hierbij slim gebruik van de methode toString()
         */
         for (int i = 0; i < medewerkers.size(); i++) {
             System.out.println(medewerkers.get(i));
         }
         
         
     };
     
     public int aantalManagers () {
         /*
         Deze methode geeft het aantal managers van het bedrijf terug.
Tip: loop hiervoor door de medewerkers van het bedrijf en gebruik instanceof
         */
         
         
         return 0;
     }
        
     
     
     public void neemInDienst (Object persoon) {
       //lijst van medewerkers toegevoegd
      medewerkers.add((Persoon) persoon);
      
      
     }
      
     
     
    
      //********ToString*******
    public String toString () {
        return this.naam;
    }
}
