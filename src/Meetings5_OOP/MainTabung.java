package Meetings5_OOP;

import java.util.Scanner;

public class MainTabung {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        Tabung T1 = new Tabung();
        
        System.out.println(" - - Menghitung Volume Tabung - - ");
        System.out.print(" Masukan Jari-jari Anda : ");
            T1.r = input.nextDouble();
            
        System.out.println("Luasnya : " + T1.findLuas(T1.r));
        System.out.print(" Masukan Tinggi Anda    : ");
            T1.tinggi = input.nextDouble();
            
            T1.luasAlas = T1.findLuas(T1.r);
        System.out.println("Volumenya : " + T1.findVolume(T1.luasAlas, T1.tinggi));        
        
    }   
}