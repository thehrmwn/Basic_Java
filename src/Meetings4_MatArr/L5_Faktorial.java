package Meetings4_MatArr;

import java.util.Scanner;

public class L5_Faktorial {
    public static void main(String[] args) {
      int fakt, i;
      int hasil = 1;
        
        Scanner input = new Scanner (System.in);
        System.out.println("= = = PROGRAM FAKTORIAL = = =");
        System.out.println("-----------------------------");
        System.out.print("Masukan Angka Faktorial : ");
            fakt = input.nextInt();
            
        for (i=1; i<=fakt ; i++){
            hasil *= i;
        }
        
        System.out.println(fakt + "! adalah " + hasil);
    }
    
}
