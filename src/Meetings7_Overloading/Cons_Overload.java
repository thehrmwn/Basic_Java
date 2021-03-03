package Meetings7_Overloading;

class Box { 
        double width, height, depth; 
        // Konstruktor digunakan ketika semua parameter sudah ditentukan
        Box(double w, double h, double d) { 
            width  = w; 
            height = h; 
            depth  = d; 
        } 
        // Konstruktor digunakan ketika parameter tidak ditentukan
        Box() { 
            width = height = depth = 0; 
        } 
        // Konstruktor digunakan ketika cube dibuat 
        Box(double len) { 
            width = height = depth = len; 
        } 
        // Membentuk dan mengeluarkan Volume
        double volume() { 
            return width * height * depth; 
        } 
    } 

public class Cons_Overload {
    public static void main(String[] args) {
       Box mybox1 = new Box(5, 15, 10); 
       Box mybox2 = new Box(); 
       Box mycube = new Box(9); 
  
       double vol; 
         vol = mybox1.volume(); //Volume 1
         System.out.println(" Volume of mybox1 is " + vol); 
         vol = mybox2.volume(); //Volume 2
         System.out.println(" Volume of mybox2 is " + vol); 
         vol = mycube.volume(); //Volume cube 3
         System.out.println(" Volume of mycube is " + vol); 
    }
}