package Meetings5_OOP;

public class Tabung {
    double r;
    double tinggi;
    double luasAlas;
    
    double findLuas (double jari) {
        r = jari;
        double luas;
            luas = 3.14 * r * r;
            
         return luas;
    }
    double findVolume (double La, double t){
       tinggi = t;
       luasAlas = La;
         double volume;
            volume = La * t;
     
         return volume;
    }
}