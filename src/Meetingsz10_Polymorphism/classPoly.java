package Meetingsz10_Polymorphism;
/*Kemampuan suatu objek untuk mengungkapkan berbagai hal
   dengan cara yang sama (Pewarisan)
   ==>> Method sama tetapi output berbeda jika
        dilewatkan melalui class berbeda */

//Overriding = konsep dalam membuat method yang sama dengan supperclass

public class classPoly {
    void hitungLuas(){
        System.out.println("Menghitung Luas Bangun Datar");
    }
}

class Persegi extends classPoly {
    @Override
    void hitungLuas() {
        int p = 6;
        int l = 4;
        System.out.println("Luas Persegi   : " + p*l);
    }
}

class Lingkaran extends classPoly {
    @Override
    void hitungLuas() {
        double jari = 7;
        System.out.println("Luas lingkaran : " + (3.14 * jari));
    }
}
