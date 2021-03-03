package Meetings7_Overloading;

public class belajarConstruction {
    public static void main(String[] args) {
        //Membuat Objek dari Class Data
        // sekaligus memanggil Konstruktor
        Data out = new Data ();
        
        // Membuat Objek dari Class Nama
        Nama Mhs = new Nama (2, "Nama Telah Terdaftar"); 
    }
}
    class Data {
        //Konstruktor Class Data
        public Data () { //Ini yang disebut Konstruktor
            System.out.println("Data Anda Ada");
        }
    }
    class Nama {
        //Konstruktor dengan Parameter
        public Nama (int x, String n) {
            for (int i = 1; i <= x; i++)
                System.out.println(n);
        }
    }