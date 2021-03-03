package Meetings7_Overloading;
import java.util.Scanner;

class Bank {
    int saldo;
        
        Bank (int saldo) { //Constructor
            this.saldo = saldo;
        }
        void simpanUang (int hasil) {
            saldo = saldo + hasil;
        }
        void ambilUang (int hasil) {
            saldo = saldo - hasil;
        }
//        int getBunga(){
//            int hasil = (int) (saldo * 0.0075);
//            saldo = saldo - hasil;
//            return saldo;
//        }
        int getSaldo () {
            return saldo;
        }
}

public class aksiBank {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        Bank act = new Bank (100000);
        int simpan, ambil;
        int bunga;
        
            System.out.println("Selamat Datang di Bank ABC");
            System.out.println("Saldo saat ini : Rp." + act.getSaldo());
            System.out.print("Simpan Uang    : Rp.");
                simpan = inp.nextInt();
                act.simpanUang(simpan);
            System.out.println("Saldo Saat ini : Rp." + act.getSaldo());
            System.out.print("Ambil Uang     : Rp.");
                ambil = inp.nextInt();
                act.ambilUang(ambil);
            System.out.println("Saldo Saat Ini : Rp." + act.getSaldo());
            
            if (act.getSaldo() > 1000000) {
                bunga = (int) (act.getSaldo() * 0.0075);
                System.out.print("Mendapatkan Bunga 0.75% = Rp." + bunga);
                System.out.print("Saldo Saat Ini : Rp." + (act.getSaldo() + bunga));
            }
    }     
}