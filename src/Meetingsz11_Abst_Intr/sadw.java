package Meetingsz11_Abst_Intr;
import java.util.Scanner;

public class sadw {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        bangun sya = new Syalala();
        System.out.print(sya.hitungKeliling());
        System.out.print(sya.hitungLuas());
    }
}

interface bangun {
    abstract float hitungLuas();
    abstract float hitungKeliling();
}

    class Syalala implements bangun {
    public float sisi = 7;
    @Override
    public float hitungLuas(){
        return (sisi*sisi);
    }
    @Override
    public float hitungKeliling(){
        return (4*sisi);
    }
}