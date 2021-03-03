package Meetingsz11_Abst_Intr;
/* Penerapan konsep Polymorphism !!
  
   Abstraction =
   class Abstract = class yang tidak jelas, method2 tidak jelas
      method = method tidak jelas, tidak terdapat proses, tidak
        ada implementasinya
*/

//Subclass harus punya method dari superClass
public abstract class classAbs {
    //Boleh ada method abstract/tidak
    abstract void hitungLuas(); // <== wajib ada di class sub
    //Method abstract = tidak jelas, tidak memiliki badan tubuh
    void hitungKeliling(){} //Seharusnya tidak jelas
} 

  class Persegi extends classAbs {
      @Override
      void hitungLuas() {
        int p = 7;
        int l = 5;
        System.out.println("Luas Persegi = " + p*l);
      }
 }