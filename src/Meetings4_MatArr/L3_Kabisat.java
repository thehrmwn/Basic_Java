package Meetings4_MatArr;

import java.util.Scanner;

public class L3_Kabisat {
    public static void main(String[] args) {
        int tahun;
        String ans;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("= = = PROGRAM MENENTUKAN TAHUN KABISAT = = =");
        System.out.println("--------------------------------------------");
        // 1900 - 2005
        System.out.print("Masukan Tahun (1900 - 2005) : ");
            tahun = input.nextInt();
            
        if ((tahun > 1900) && (tahun < 2005))   {     
            
            if (tahun % 4 == 0) {
                System.out.println(tahun + " adalah Tahun Kabisat");
            }
            if (tahun % 4 != 0) {
                System.out.println(tahun + " bukan Tahun Kabisat");
            }
        }
        
        if (tahun < 1900) {
            System.out.println("Maaf, Tahun input Dibawah 1900");
        }
        if (tahun > 2005) {
            System.out.println("Maaf, Tahun input Diatas 2005");
        }
        
        
    }  
}
