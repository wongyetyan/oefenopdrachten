/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;

/**
 *
 * @author David Wong
 */
public class Werknemer extends Persoon {
    private double maandSalaris;
    private int personeelNummer;
    private static int laatstePersoneelsNummer; 
    //STATIC: only accessable through an instance
    
    //***************
        
    //**************
    public Werknemer (double maandSalaris ,String naam )
    {
        super(naam);
        this.maandSalaris = maandSalaris;
        
        
    }
    
    @Override
    public double berekenInkomsten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String ToString () {
        
        return this.maandSalaris+super.toString();
    }
    
    
  
}
