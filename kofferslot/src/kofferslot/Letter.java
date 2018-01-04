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
public class Letter {
    private char letter;
     
    
    public Letter () {
      
        this.letter = 'A';
     
       
    }
    
    public char getLetter  () {
        
        return this.letter;
    }
    
    public void setLetter ( char letter ) {
        this.letter = letter;
       // return this.letter;
    }
    
    public char volgende () {
        
        this.letter += 1;
      return this.letter;
    }
}
