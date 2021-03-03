package Task;

import java.util.Scanner;

public class T2_LCircle {
    public static void main(String[] args) {
        
        float jari, keliling, luas ;
        float Phi = 3.14f;
        
            System.out.println("== PROGRAM LUAS DAN KELILING LINGKARAN ==");
            System.out.println("-----------------------------------------");
        Scanner input = new Scanner (System.in);
            System.out.print (" Masukan Jari-jari (r) : ");
            jari = input.nextFloat();
        luas = Phi * jari * jari;
        keliling = 2 * Phi * jari;
            System.out.println("Kelilingnya sebesar = " + keliling);
            System.out.println("Luasnya sebesar     = " + luas);
        
    }
    
}
