package Try;
import java.util.Scanner;

public class onee {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Persegi per = new Persegi();
        
        System.out.print("Menghitung Sisi : ");
        per.sisi = inp.nextFloat();
        System.out.println("Luas     : " + per.hitungLuas());
        System.out.println("Keliling : " + per.hitungKeliling());
        System.out.println();
        
        poly p1 = new Perr();
        poly p2 = new Loll();
        System.out.println("Persegi : " + p1.hitungLL());
        System.out.println("Free    : " + p2.hitungLL());
        System.out.println();
    }
    
}
