package Meetings9_Encapsulation;
/* Encapsulation = bagaimana cara melindungi satu attribute atau data yang
ada dalam satu class agar tidak dapat diakses oleh class lain. Dijadikan
sebagai Private, dimana untuk mengakses datanya diperlukan Setter and Getter.
*/

class bangunDatar {
    private int panjang;
    private int lebar;
    /*Modifier = mengenal sejauh mana variabel itu dikenal dalam class
      Public = attribute/meth bisa diakses di class itu or else
      Private = tidak berhak diakses class lain, dikenal ditempat
        ia dideklarasikan */
    
    //Setter = Menset nilai/memberikan nilai
    public void setPanjang (int panjang){
        this.panjang = panjang;
    }
     public void setLebar (int lebar){
        this.lebar = lebar;
    }
    //Getter = mendapatkan nilai
    public int getPanjang (){
        return panjang;
    }
    public int getLebar (){
        return lebar;
    }
    
    void hitungLuas(){
       int luas = panjang*lebar;
       System.out.println("Luasnya = " + luas);
    }   
}
