package Meetings2_Hello;

import java.util.Scanner; //libraries

public class HelloWord {
    public static void main(String[] args) {
        String name;
        int umur;
       
        // Output
        System.out.print("Hello World \n");
        System.out.println("Apa atu" + "Oke");
        
        // Input
        System.out.print("Masukan Nama Anda : ");
        Scanner input = new Scanner(System.in); //inputan
        name = input.nextLine(); // nextLine = membaca spasi  (char + string).
                                 // nextInt = membaca spasi di Integer.
        System.out.println("Nama Anda adalah " + name);
        
        // CONTOH 
        System.out.print("Masukan Usia Anda : ");
        Scanner in = new Scanner(System.in); //inputan
        umur = input.nextInt(); 
    }
    
}
