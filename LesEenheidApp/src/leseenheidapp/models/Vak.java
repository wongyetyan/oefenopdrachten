/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 * @student David Wong
 */
package leseenheidapp.models;

public class Vak extends LesEenheid {
    
    private double cijfer;
    
    //lezen over constructors inherit
    public Vak ( String naam, int ects, int studiejaar) {
       
       super (naam, ects, studiejaar);
       
    }
    
    
    public Vak ( String naam, int ects , int studiejaar, double cijfer ) {
       super(naam,ects,studiejaar);
       this.cijfer = cijfer;
    }
  //EXTRA CONSTRUCTOR
    
    public Vak (){
            setNaam ("X");
            setEcts(-1);
            setStudiejaar(0);
            this.cijfer = -1;
            
    }
    
    @Override
    public String toString() {
        String s = "Vak: "+ getNaam() + " ECTS : "+ getEcts() + " Studiejaar : "+ getStudiejaar() +" Cijfer : "+ this.cijfer;
        return s;
    }
    
}
