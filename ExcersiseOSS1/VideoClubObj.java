
package oss;

/**
 *
 * @author Evangelos Batsalis
 */
public class VideoClubObj {
    //State Fields (δηλώσεις πεδίων)
    private int code;
    private String titleEN;
    private String titleGR;
    private short duration;
    private String category;
    private float rentCostPerDay;
    //δήλωση στατικής μεταβλητής για την στατική μέθοδο setBaseCharge(float b)
    private static float baseCharge = 2.0f;
    
    //Δλώσεις Constructors
    //constructor without parameter. Also Constructor with default values
    public VideoClubObj(){
        code = 0;
        titleEN = null;
        titleGR = null;
        duration = 0;
        category = null;
        rentCostPerDay = 3.0f;
    }

    //Overloading Costructor with Full parameters
    public VideoClubObj(int code, String titleEN, String titleGR,short duration,String category, float rentCostPerDay){
        this.code = code;
        this.titleEN = titleEN;
        this.titleGR = titleGR;
        this.duration = duration;
        this.category = category;
        this.rentCostPerDay = rentCostPerDay;
    }
    
    //Δηλώσεις μεθόδων
    //Μέθοδος εμφάνισης Κωδικού, αγγλικού τίτλου και διάρκεια ενός αντικεμένου
    public void shortPrint(){
        System.out.println("Movie Code: "+code+"\n"+
                           "Movie Title: "+titleEN+"\n"+
                           "Movie Duration: "+duration);
    }
    
    //Μέθοδος cost(int days) υπολογίζει το κόστος ενοικίασης
    public float cost(int days){
        return baseCharge +days * rentCostPerDay;
    }

    //Μέθοδος toString(), η οποία να επιστρέφει σε μορφή κειμένου τα στοιχεία ενός αντικειμένου. 
    @Override
    public String toString() {
        return "Κωδικός ταινίας= " + code +"\n"+ 
               "Movie Title= " + titleEN +"\n"+
               "Όνομα Ταινίας= " + titleGR + "\n"+
               "Διάρκεια= " + duration + " λεπτά"+"\n"+
               "Κατηγορία= " + category + "\n"+
               "Κόστος ενοικίασης(ανά ημέρα)= " + rentCostPerDay+" Ευρώ"+"\n";
    }
    
    //Στατική Μέθοδο setBaseCharge(float b), αλλάζει τη βασική χρέωση που ισχύει για όλες τις ταινίες.
    public static void setBaseCharge(float b){
        if (b>0){
            baseCharge = b;
        }else{
            baseCharge=0.0f;
        }
    }
    
    
}//Τέλος VideoClubObj Κλάσης
    
    

