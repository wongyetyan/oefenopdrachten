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
public class Zzper extends Persoon implements Oproepbaar {
    
    private double uurTarief;
    private int urenGewerkt;
    
    
    @Override
    public double berekenInkomsten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hurenln( int uren) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Zzper ( double uurTarief, String naam) {
        this.uurTarief = uurTarief;
        //naam van een persoon van een bedrijf!!
        //Tarief wordt berekent
        
        
    }
    
}
