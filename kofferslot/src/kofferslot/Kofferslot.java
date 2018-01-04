/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kofferslot;

/**
 *
 * @author Wong David
 */
public class Kofferslot {

    /**
     * Aggregated class
     */
    //***Dit is Association
    
     private Letter[] letterlijst;
     private Cijfer cijferKoffer;
     
    public static int count1;
    // keep track of how many times the kofferslot is called
    
    
    //***default constructor******************************************
    public Kofferslot () {
     letterlijst = new Letter[2]; //intialize
    
     
     letterlijst [0] = new Letter();
     letterlijst [1] = new Letter();
     
     cijferKoffer = new Cijfer();
     
    }
    //*****************constructor******************************************
    public Kofferslot ( char firstLetter ,char secondLetter ,int cijfer) {
     letterlijst = new Letter[2];
     letterlijst [0] = new Letter ();  
     letterlijst [1] = new Letter ();
     letterlijst[0].setLetter(firstLetter);
     letterlijst[1].setLetter(secondLetter);
     
      cijferKoffer = new Cijfer();
      cijferKoffer.setCijfer(cijfer);
    }
     //*******METHOD*Set combinatie******************************
     void setCombinatie ( char firstLetter ,char secondLetter ,int cijfer) {
        //waarvoor is dit?
         
    }
      //******METHOD*Volgende*****************************
     public String volgende () {
         letterlijst [0].volgende();
         letterlijst [1].volgende();
         cijferKoffer.volgende();
         
         //ALGORITHM
             
         //in die termen van veelvoud van 9 voor starters.
         //

         
         
         
         
         
         
         return ( "This "+ letterlijst[0].getLetter() + letterlijst[1].getLetter() + cijferKoffer.getCijfer() );
     }
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        Letter alfa = new Letter();
        System.out.println( " This Letter is " + alfa.getLetter() );
        System.out.println(" ");
        System.out.println( " Setting new letter ");
        alfa.setLetter('B');
        System.out.println( " This Letter is " + alfa.getLetter() );
        System.out.println(" Volgende " + alfa.volgende());
        System.out.println( " This Letter is " + alfa.getLetter() );
        System.out.println(" ");
        Cijfer beta = new Cijfer();
        System.out.println(" This Cijfer is " + beta.getCijfer() );
        System.out.println(" ");
        System.out.println(" Setting new cijfer " + beta.setCijfer(5));
        System.out.println( beta.volgende());
        System.out.println(" This is nu " +  beta.getCijfer());
        // VOLGENDE LETTER TEST
        alfa.volgende();
        beta.volgende();
        //NEXT PRINT
        System.out.println( " This Letter is " + alfa.getLetter() );
        System.out.println(" This is nu " +  beta.getCijfer());
        // KOFFERSLOT
        
        Kofferslot kofferslot1 = new Kofferslot();
        
        System.out.println(kofferslot1.volgende());
        
       // System.out.println(" This slot " + );
    }


    
    
}
