package TaskCC;

import java.util.Scanner;

public class mainSepeda {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        char masuk;
        int lagi, next;
        
        classSepeda Obj = new classSepeda();
//        Obj.kecepatan = 0;
        
        System.out.print("Maju Sekarang ? (y/n)  : ");
            masuk = input.next().charAt(0);
        switch (masuk) {
            case 'y' :
                System.out.println("");
                System.out.print("Masukan Jarak : ");
                    Obj.go = input.nextInt();
                        Obj.tambah = Obj.go;
                do {
                    System.out.println("Berikutnya");
                    System.out.println("1. Maju");
                    System.out.println("2. Berhenti");
                    System.out.print("Inputan 1/2  : ");
                        next = input.nextInt();
                    switch (next) {
                        case 1 :
                            System.out.println("");
                            System.out.print("Masukkan Jarak : ");
                                Obj.go = input.nextInt();
                                System.out.println("Jarak saat ini " + Obj.maju(Obj.tambah, Obj.go));
                                Obj.fast = Obj.maju(Obj.tambah, Obj.go);
                            break;
                            
                        case 2 :
                            System.out.println("");
                            System.out.println("Kecepatan saat ini " + Obj.berhenti(Obj.stop));
                            Obj.kecepatan = 0;
                            do {
                                System.out.println("Berikutnya ?");
                                System.out.println("1. Mundur");
                                System.out.println("2. Parkir");
                                System.out.println("3. Maju lagi");
                                System.out.print("Inputan ? (1/2/3)  : ");
                                    lagi = input.nextInt();
                                    switch (lagi) {
                                        case 1 :
                                            System.out.println("");
                                            System.out.print("Masukan Jarak : ");
                                                Obj.back = input.nextInt();
                                                Obj.tambah = Obj.go;
                                                System.out.println("Jarak saat ini " + Obj.mundur(Obj.fast, Obj.back));
                                                Obj.slow = Obj.mundur(Obj.fast, Obj.back);
                                                
                                            break;
                                            
                                        case 2 :
                                            System.out.println("Kecepataan saat ini " + Obj.berhenti(Obj.stop));
                                            System.out.println("PERJALANAN SELESAI");
                                            break;
                                            
                                        case 3 :
                                            System.out.println("");
                                            System.out.print("Masukan Jarak : ");
                                                Obj.go = input.nextInt();
                                                System.out.println("Jarak saat ini " + Obj.maju(Obj.slow, Obj.go));
                                            break;
                                            
                                        default :
                                            break;
                                    }
                            } while (lagi ==1 || lagi == 3);
                        break;
                        
                        default :
                            break;
                    }
                } while (next == 1); 
        break;
        
            case 'n' :
                System.out.println("");
                System.out.println("Kecepatan saat ini " + Obj.berhenti(Obj.stop));
                break;
            default :
                System.out.println("Inputan Salah");
                break;
        }
    }
}