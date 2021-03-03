package Meetings3_DataType;

import java.util.Scanner;

public class Exc_Kabisat {
    public static void main (String[] args){
        int tahun;
        int x = 2020;
        boolean cek;
        String answer;
        
        Scanner input = new Scanner (System.in);
        
            System.out.println("Masukan Tahun (1909 - 2020) : ");
            tahun = input.nextInt();
            
            answer = (x % 4 == 0 && (tahun < 2021 && tahun > 1909) ?" adalah tahun kabisat" : " adalah bukan tahun kabisat");
            
            
            
        
        
    }
}
