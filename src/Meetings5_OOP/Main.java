package Meetings5_OOP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        // Instansiasi
        Lingkaran L1 = new Lingkaran();  //Mengakses Class
        L1.jariJari = 7;  //Mengakses Atribut di Class Lingkaran
        
          System.out.println("Menghitung Luas Lingkaran 1");
          System.out.println("Jari - Jari : " );
          System.out.println("Luas : " + L1.findArea(L1.jariJari));
        
        Lingkaran L2 = new Lingkaran();
        L2.jariJari = 10;
          System.out.println("Menghitung Luas Lingkaran 2");
          System.out.println("Jari - Jari : " + L2.jariJari);
          System.out.println("Luas : " + L2.findArea(L2.jariJari));
          
        Lingkaran L3 = new Lingkaran();
          System.out.println("Menghitung Luas Lingkaran 2");
          System.out.print("Jari - Jari : " );
          L3.jariJari = input.nextDouble();
          System.out.println("Luas : " + L2.findArea(L3.jariJari));
        
    }
    
}
