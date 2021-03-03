package Meetings4_MatArr;

import java.util.Scanner;

public class L2_ArrayBarang {
    public static void main(String[] args) {
     String nama;
     String[][] Barang = new String[3][2];
         Barang[0][0] = "Mouse";
         Barang[0][1] = "   Rp 30.000";
         Barang[1][0] = "Keyboard";
         Barang[1][1] = "Rp 80.000";
         Barang[2][0] = "Monitor";
         Barang[2][1] = " Rp 500.000";
        
            Scanner input = new Scanner (System.in);
            for (int i=0; i<3; i++){
                System.out.println ("");
                for (int j=0; j<2; j++) {
                    System.out.print( Barang[i][j] + "  " );  
                } 
            }
            
            System.out.println("");
            System.out.print("Masukan Nama Barang : ");
                nama = input.nextLine();
            
            switch (nama) {
                case "Mouse" :
                    System.out.println("Data Ditemukan");
                    System.out.println(Barang[0][0] + Barang[0][1]);
                    break;
                case "Keyboard" :
                    System.out.println("Data Ditemukan");
                    System.out.println(Barang[1][0] + Barang[1][1]);
                    break;
                case "Monitor" :
                    System.out.println("Data Ditemukan");
                    System.out.println(Barang[2][0] + Barang[2][1]);
                    break;
                default :
                    System.out.println("Data Tidak Ditemukan");
                    break;
            }
          
        
    
}
}
