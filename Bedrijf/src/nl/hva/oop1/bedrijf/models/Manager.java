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
public class Manager extends Werknemer{
    
    private double bonus;
    
    public Manager(double maandSalaris, String naam) {
        super(maandSalaris, naam);
    }
    
    
    // ********** METHOD *******************
    public void kenBonusToe () {
        
    }
    
    public double berekeningInkomsten () {
        return 0;
    }
    
    //**********
}
