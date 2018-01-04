/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 * @student David Wong
 */
package leseenheidapp.models;

public class Project extends LesEenheid {
    
    double productCijfer;
    double procesCijfer;
    double methodenEnTechniekenCijfer;
    
    
     //**********************EXTRA CONSTRUCTOR**********************
    
    public Project (){
//            setNaam ("X");
//            setEcts(-1);
//            setStudiejaar(0);
            super("X",-1,0);
            this.procesCijfer = -1;
            this.procesCijfer = -1;
            this.methodenEnTechniekenCijfer = -1;
            
    }
    // **********************Constructors**********************
    public Project ( double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer, String naam, int ects, int studiejaar) {
        super ( naam, ects, studiejaar);
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
        this.procesCijfer = procesCijfer;
        this.productCijfer = productCijfer;
        
//        setNaam (naam);
//        setEcts (ects);
//        setStudiejaar(studiejaar);
    }
    
    public Project ( String naam , int ects, int studiejaar) {
//        setNaam (naam);
//        setEcts(ects);
//        setStudiejaar(studiejaar);
    super ( naam, ects, studiejaar);
    }
    //***********************Getters**********************
    public double getProductCijfer (){
        return productCijfer;
    }
    
    public double getProcesCijfer (){
        return procesCijfer;
    }
    
    public double getMethodenEnTechniekCijfer (){
        return methodenEnTechniekenCijfer;
    }
    
    //*********************Setters**********************
    public void setProductCijfer (int productCijfer){
        this.productCijfer = productCijfer;
    }
    
    public void setProcesCijfer (double procesCijfer){
        this.procesCijfer = procesCijfer;
    }
    
    public void setMethodenEnTechniekCijfer (double methodenEnTechniekCijfer){
        this.methodenEnTechniekenCijfer = methodenEnTechniekCijfer;
    }
    //***************METHODES************************
    public boolean isAfgerond () {
        //controleer of de cijfer 5.5 (meer of minder is)
        double c1 =getProductCijfer ();
        double c2 = getProcesCijfer();
        double c3 = getMethodenEnTechniekCijfer();
        //**********************************************
        
        if ( (c1>= 5.5) && (c2>=5.5) && (c3 >=5.5)){
           return true;
        } else {
        
        
        return false;
        }
    }
    
    //**********************To STRING**********************
    @Override
    public String toString() {
        //Calling the isAfgerond here and pass into a variable
        String isAfgerond ;
        if(isAfgerond())
        {
            isAfgerond = " AFGEROND ";
        } else {
            isAfgerond = " NIET AFGEROND ";   
        }
        
        
        //**********************TO_STRING for isAfgerond
        String s = super.toString() + " ( "
                + getProductCijfer() + " , "+ getProcesCijfer()+ " , " + getMethodenEnTechniekCijfer() 
                + " ) is "+ isAfgerond;
        
        return s;
    }
}
