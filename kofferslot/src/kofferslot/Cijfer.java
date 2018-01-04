/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kofferslot;

/**
 *
 * @author Gebruiker
 */
public class Cijfer {
    private int cijfer;
    
    //default constructor
    
    public Cijfer (){
      this.cijfer = 0; 
    }
    
    public int getCijfer () {
       return this.cijfer; 
    }
    
    public int setCijfer(int cijfer){
        this.cijfer = cijfer;
        return this.cijfer;
    }
    
    public int volgende () {
        this.cijfer+=1;
    return this.cijfer;
    }
}
