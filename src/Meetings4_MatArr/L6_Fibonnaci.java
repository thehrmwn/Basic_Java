package Meetings4_MatArr;

import java.util.Scanner;

public class L6_Fibonnaci {
    public static void main(String[] args) {
      int n;
      int A=0, B=1, C;
        
        Scanner input = new Scanner (System.in);
        System.out.println(" = = = PROGRAM DERET FIBONNACI = = =");
        System.out.println("------------------------------------");
        System.out.print("Masukan Batas Deret : ");
            n = input.nextInt();
            
        System.out.println("Hasil Deret nya ");
        for (int i=0; i<n-1; i++) {
            if (i==0) {
                System.out.print(A + " " + B + " ");
            }
            else {
                C = A + B;
                A = B;
                B = C;
                System.out.print(C + " ");
            }
        }
 
    }  
}
