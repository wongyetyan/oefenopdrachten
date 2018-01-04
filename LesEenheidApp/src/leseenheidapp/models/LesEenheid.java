/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 * @student David Wong
 */
package leseenheidapp.models;

public class LesEenheid {
    
   private String naam;
   private int ects;
   private int studiejaar; //keuze waarde uit 1,2,3,4.
   
   //******Default Constructor******
    public LesEenheid () {
        
            this.naam ="x";
            this.ects = -1;
            this.studiejaar =0;
            
           
            
    
   }
  
   //******LesEenheid******
   public LesEenheid ( String naam, int ects, int studiejaar ) {
       this.naam = naam;
       this.ects = ects;
       this.studiejaar = studiejaar;
   }
   
   //****SETTERS**methods******
   public void setNaam ( String naam ) {
       this.naam = naam;
   }
   
   public void setEcts ( int ects) {
       this.ects = ects;
   }
   
   public void setStudiejaar ( int studiejaar ) {
       this.studiejaar = studiejaar;
   }
   //****GETTERS**methods******
   public String getNaam () {
      return naam;
   }
   
   public int getEcts () {
       return ects;
   }
   
   public int getStudiejaar ( ) {
       return studiejaar;
   }
   
   
    //*********************
    @Override
    public String toString() {
        
        String s = "Vak: " +this.naam + "," + this.ects + "ECTS,"  + " studiejaar "+this.studiejaar ;
        return (s);
        
        
    }
}
