package Task;
import java.util.Scanner;

public class awddwa_class {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        awddwa pri = new Persegi();
        System.out.print("Masukan Sisi : ");
        System.out.print("Luas : " + pri.hitungLuas());
        System.out.print("Luas : " + pri.hitungVolume());
    }
    
}
