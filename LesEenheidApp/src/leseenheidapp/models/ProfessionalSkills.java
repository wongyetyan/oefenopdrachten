/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 * @student David Wong
 */
package leseenheidapp.models;

public class ProfessionalSkills extends LesEenheid {
    
    private boolean gehaald;
    
    
       public ProfessionalSkills ( String naam, int ects , int studiejaar, boolean gehaald ) {
       super (naam, ects, studiejaar);
       this.gehaald = gehaald;
    }
       
       //*******Getter
       public String getGehaald (){
            String isAfgerond ;
        if(this.gehaald)
        {
            isAfgerond = " AFGEROND ";
        } else {
            isAfgerond = " NIET AFGEROND ";   
        }
           return isAfgerond;
          
       }
       
       //******Setter
       public void setGehaald (boolean gehaald) {
           this.gehaald = gehaald;
           
       }
       
        //EXTRA CONSTRUCTOR
    
    public ProfessionalSkills (){
            setNaam ("X");
            setEcts(-1);
            setStudiejaar(0);
            
            this.gehaald = false;
            
    }
       
    @Override
    public String toString() {
        
        
        String s = " Vak: " + getNaam () + " ECTS: " + getEcts() + " Studiejaar: " + getStudiejaar() + " Gehaald: " + getGehaald();
        
        return s;
    }
}
