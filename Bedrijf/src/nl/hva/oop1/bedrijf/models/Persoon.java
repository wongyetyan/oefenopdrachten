/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;

/**
 *
 * @author DAVID WONG
 */
public abstract class Persoon {
    
    private String naam;
    
    //********Default constructors*******
    Persoon () {
       this.naam = "XXXX";  
    }
    
    
    
    
    //********Condtructors*******
    
    public Persoon ( String naam) {
        this.naam = naam;
    }
    
    
    //********Methods*******
    
    
   
    //********CompareTo<Persoon>*******
    
    public int compareTo(Persoon o) {
        if ( naam.equals(o.naam) ){
            return 1;
        } else
            return 0;
    }
  
    
    //********Bereken inkomsten*******
    
    public abstract double berekenInkomsten ();
    
      //********ToString*******
    public String toString () {
        return this.naam;
    }
}
