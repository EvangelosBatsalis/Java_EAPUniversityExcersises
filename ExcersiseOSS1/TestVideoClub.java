package oss;

/**
 *
 * @author Evangelos Batsalis
 */

//Όνομα Κλάσης
public class TestVideoClub {
    
    //MainMethod
    public static void main(String[] args) {
        
        //Δημιουργία αναφοράς αντικειμένων και δέσμευση μνήμης
        VideoClubObj starWarsMovieV;
        VideoClubObj starWarsMovieVI;
        
        //Δημιουργία αντικειμένου και Αναφορά που δείχνει στα εν λόγω αντικείμενα
        starWarsMovieV = new VideoClubObj(1,"Star Wars: Episode V: The Empire Strikes Back", 
                                            "Ο Πόλεμος των Άστρων: Επισόδιο V: Η Αυτοκρατορία Αντεπιτίθεται", 
                                         (short)124, "SciFi", 2.5f);
        starWarsMovieVI = new VideoClubObj(2,"Star Wars Episode VI: Return of the Jedi", 
                                            "Ο Πόλεμος των Άστρων: Επεισόδιο VI - Η Επιστροφή των Τζεντάι", 
                                 (short)132, "SciFi", 3.0f);
        
        //εκτύπωση πρώτου αντικειμένου
        System.out.println("Τα στοιχεία της πρώτης ταινίας είναι:");
        System.out.println(starWarsMovieV.toString());
        
        //εκτύπωση δεύτερου αντικειμένου
        System.out.println("Τα στοιχεία της δεύτερης ταινίας είναι:");
        System.out.println(starWarsMovieVI.toString());
        
        //εκτύπωση συνολικού κόστους ενοικίασης και των δύο αντικειμένων
        System.out.println("Συνολικό κόστος Κόστος ενικοίασης: "+ (starWarsMovieV.cost(5)+starWarsMovieVI.cost(5)));

        //αλλαγή τιμής μέσω της στατικής μεθόδου
        System.out.println("\nΑλλαγή τιμής μέσω της στατικής μεθόδου setBaseCharge() για όλα τα ανεικείμενα");
        VideoClubObj.setBaseCharge(5.0f);
        
        //εκτύπωση συνολικού κόστους ενοικίασης και των δύο αντικειμένων για την παρατήρηση αλλαγής των τιμών
        System.out.println("\nΣυνολικό κόστος Κόστος ενικοίασης: "+ (starWarsMovieV.cost(5)+starWarsMovieVI.cost(5)));

        
    }
    
}
