package Meetingsz10_Polymorphism;

public class mainPoly {
    public static void main(String[] args) {
        classPoly p = new classPoly();
        classPoly pp = new Persegi();
        classPoly ll = new Lingkaran();
        
        p.hitungLuas();
        pp.hitungLuas();
        ll.hitungLuas();
        //Memanggil method sama tetapi output berbeda        
   }
}