package Meetings4_MatArr;

import java.util.Scanner;

public class L1_Kasir {
    public static void main(String[] args) {
      int nominal, belanja;
      int kembalian = 0, diskon = 0, total=0; 
      char kartu;
      char belanja1, belanja2, belanja3;
        
        Scanner input = new Scanner (System.in);
        System.out.println ("= = = PROGRAM KASIR = = =");
        System.out.println ("-------------------------");
        System.out.print ("Masukan Nominal Pembayaran anda : ");
           nominal = input.nextInt();     
        System.out.print ("Masukan Total Belanjaan Anda    : " );
           belanja = input.nextInt();
        System.out.print("Apakah Anda Memiliki Kartu Member ? (Y/N) : ");
           kartu = input.next().charAt(0);
           
         if (kartu == 'Y') {
             System.out.print("Apakah Total Belanja Anda > Rp500.000 ? (Y/N) : ");
             belanja1 = input.next().charAt(0);
             if (belanja1 == 'Y') {
                 diskon = 50000;
                 total = belanja - diskon;
                 kembalian = nominal - total;
                 System.out.println("Anda Mendapatkan Diskon : Rp50.000");
             } else {
                 diskon = 0;
                 total = belanja - diskon;
                 kembalian = nominal - total;
                 System.out.println("Anda Tidak Mendapatkan Diskon");
             }

             System.out.print("Apakah Total Belanja Anda > Rp100.000 ? (Y/N) : ");
             belanja2 = input.next().charAt(0);
             if (belanja2 == 'Y') {
                 diskon = 15000;
                 total = belanja - diskon;
                 kembalian = nominal - total;
                 System.out.println("Anda Mendapatkan Diskon : Rp15.000");
             } else {
                 diskon = 0;
                 total = belanja - diskon;
                 kembalian = nominal - total;
                 System.out.println("Anda Tidak Mendapatkan Diskon");
             }
         }
         
         else if (kartu == 'N') { 
             System.out.print("Apakah Total Belanja Anda > Rp100.000 ? (Y/N) : ");
             belanja3 = input.next().charAt(0);
             if (belanja3 == 'Y') {
                 diskon = 5000;
                 total = belanja - diskon;
                 kembalian = nominal - total;
                 System.out.println("Anda Mendapatkan Diskon : Rp5.000");
             } else {
                 diskon = 0;
                 total = belanja - diskon;
                 kembalian = nominal - total;
                 System.out.println("Anda Tidak Mendapatkan Diskon");
             }
         }
         
         else {
         System.out.println ("Mohon Maaf Inputan anda Salah");
         }
         
         System.out.println ("Total Belanja Anda Adalah ");
         System.out.println ("Nominal   :  Rp." + nominal);
         System.out.println ("Belanja   :  Rp." + belanja);
         System.out.println ("Diskon    :  Rp." + diskon);
         System.out.println ("============================");
         System.out.println ("Total Belanja Anda Sebesar :  Rp." + total);
         System.out.println ("Kembalian Anda Sebesar     :  Rp." + kembalian);
    }
}
