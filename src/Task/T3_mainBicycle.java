     /* 
        Buatlah Class + 5 Atribute + 5 Method
        --- Sebuah Sepeda mempunyai kmampuan untuk melaju, berhenti dan mundur,
           jarak awal sebelum kemampuannya digunakan adalah 0 km.
        ----- Buatlah program java untuk menentukan jarak tempuh dengan
             mengimplemetasikan kemampuan dari sepeda tersebut.  
     */
package Task;

import java.util.Scanner;

public class T3_mainBicycle {
    public static void main (String[] args) {
        
        int pilih;
        int next;
            
            Scanner input = new Scanner (System.in);
            T3_classBicycle Sepeda = new T3_classBicycle();
        
        System.out.println(" - - - - - - PROGRAM BERMAIN SEPEDA - - - - - ");
        System.out.println("================================================");
        System.out.println("Saat ini anda dalam kondisi Diam ");
        System.out.println("Jarak awal : 0 km");
        System.out.println("Kemampuan Sepeda ");
        System.out.println("1. Melaju ");
        System.out.println("2. Mundur ");
        System.out.println("3. Berhenti ");
        System.out.println("... exit ");
        System.out.print("Silahkan Pilih (1-3) :  ");
            pilih = input.nextInt();
            

            switch (pilih) {
                case 1 :
                    System.out.print("Jarak : ");
                        Sepeda.go = input.nextInt();
                    System.out.println("Menempuh " + Sepeda.melaju(Sepeda.go) + " km");
                    Sepeda.tambahan = Sepeda.melaju(Sepeda.go);
                    break;
                case 2 :
                     System.out.print("Jarak : ");
                        Sepeda.back = input.nextInt();
                    System.out.println("Menempuh " + Sepeda.mundur(Sepeda.back, Sepeda.tambahan) + " km");
                    Sepeda.tambahan = Sepeda.mundur(Sepeda.back, Sepeda.tambahan);
                    break;
                case 3 :
                    System.out.println("Kecepatan : " + Sepeda.berhenti(Sepeda.tambahan));
                    System.out.println("Sepeda anda telah Berhenti pada jarak " + 
                            Sepeda.berhenti(Sepeda.tambahan));
                    break;
                default :
                    System.out.println("Anda Tidak Menggunakan Sepeda");
                    break;
            }  
    }
}