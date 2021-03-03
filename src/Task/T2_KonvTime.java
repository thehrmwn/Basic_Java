package Task;

import java.util.Scanner;

public class T2_KonvTime {
    public static void main(String[] args) {
       
        int jam, menit, detik, totdet;
        Scanner input = new Scanner (System.in);
       
            System.out.println ("== PROGRAM KONVERSI WAKTU ==");
            System.out.println ("----------------------------");
            System.out.print (" Masukan Jam : ");
            jam = input.nextInt();
            System.out.print(" Masukan Menit : ");
            menit = input.nextInt();
            System.out.print(" Masukan Detik : ");
            detik = input.nextInt();
        
        totdet = (jam*3600) + (menit*60) + (detik);
            System.out.println ("Hasil Konversi dari " + jam + " Jam "+ menit + " Menit " + detik + " Detik = " + totdet ); 
    }
    
}
