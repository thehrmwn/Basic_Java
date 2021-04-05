package Try;
import java.util.Scanner;

public class Cek {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukan Angka : ");
        int angka = inp.nextInt();
      
        try{
            throw new Exception ("Masukan Anda Salah");
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
    
}
