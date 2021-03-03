package Meetingsz11_Abst_Intr;
/* Interface    = bukan sebuah class, subClass can't ussng extends but using
    (Implement), (implementasi)harus berupa public, method can't have the body 
    (definition), Wajib diimplementasikan dalam subClass

   Abstraction  = sebuah class, subClass using extends, 
   boleh tidak berupa public , method can have the body (definition), 
   wajib diimplementasikan dalam subClass
   Polymor = konsep dari inheritance
*/
public class classInterf {
    public static void main (String[] args) {
      BangunDatar bd = new Pers();
      bd.hitungLuas();
      bd.hitungKeliling();
    }
}

interface BangunDatar{
    abstract float hitungLuas();
    abstract float hitungKeliling();
}

class Pers implements BangunDatar {
    @Override
    public float hitungLuas(){ //harus berupa public
        int p = 7;
        int l = 4;
        int luas = p*l;
        System.out.println("Luas    = " + luas);
        return 0;
    }
    @Override
    public float hitungKeliling(){ //harus berupa public
        int s = 4;
        int luas = 4*s;
        System.out.println("Keliling = " + luas);
        return 0;
    }
}