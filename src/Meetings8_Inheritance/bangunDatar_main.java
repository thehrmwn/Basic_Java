package Meetings8_Inheritance;
import java.util.Scanner;

public class bangunDatar_main {
    public static void main(String[] args) {
        int pilih;
        Scanner inp = new Scanner(System.in);
        
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        persegiPanjang pp = new persegiPanjang();
        Segitiga s = new Segitiga();
        
        System.out.println("Program Mencari Luas dan Keliling Bangun Datar");
        System.out.println("   ---- Menggunakan Konsep Inheritance ----");
        System.out.println("----------------------------------------------");
        System.out.print("Pilihan Bangun Datar : \n1. Persegi \n2. Lingkaran "
                + "\n3. Persegi Panjang \n4. Segitiga \n5. Exit\n");
//        System.out.print("Masukan Pilihan : ");
//        pilih = inp.nextInt();
        
//        switch(pilih) {
//            case 1:
                System.out.println("----- Persegi -----");
                System.out.print("Masukan Sisi : ");
                p.sisi = inp.nextFloat();
                System.out.println("Luas Persegi = " + p.luas()); p.keliling();
//                break;
//            case 2:
                System.out.println("----- Lingkaran -----");
                System.out.print("Masukan jari-jari : ");
                l.r = inp.nextFloat();
                l.luas(); l.keliling();
//                break;
//            case 3:
                System.out.println("----- Persegi Panjang -----");
                System.out.print("Masukan Panjang : ");
                pp.panjang = inp.nextFloat();
                System.out.print("Masukan Lebar : ");
                pp.lebar = inp.nextFloat();
                pp.luas(); pp.keliling();
//                break;
//            case 4:
                System.out.println("----- Segitiga -----");
                System.out.print("Masukan Alas : ");
                s.alas = inp.nextFloat();
                System.out.print("Masukan Tinggi : ");
                s.tinggi = inp.nextFloat();
                s.luas(); s.keliling();
//                break;
//        }   
    }
}
