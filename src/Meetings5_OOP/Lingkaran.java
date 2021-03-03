package Meetings5_OOP;

public class Lingkaran { //Class
    double jariJari;
    
    double findArea(double j) { //Method
        jariJari = j;
        double luas;
        luas = 3.14 * jariJari * jariJari;
        
        return luas;
    }
    
}
