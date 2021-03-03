package Meetings9_Encapsulation;

public class mainEncapsulation {
    public static void main(String[] args) {
        bangunDatar bd = new bangunDatar();
        //bd.panjang = 8; (Tidak bisa digunakan)
        
        bd.setPanjang(10);
        bd.setLebar(3);
        System.out.println("Panjang = " + bd.getPanjang());
        System.out.println("Lebar   = " + bd.getLebar());
        bd.hitungLuas();
        
    }
    
}
