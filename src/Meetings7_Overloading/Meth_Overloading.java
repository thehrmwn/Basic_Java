package Meetings7_Overloading;
   
class Addition{  
    int add(int a, int b) { 
           
        int sum = a+b; 
        return sum; 
    }
    // Method yang sama == Method Overloading
    int add(int a, int b, double c) { //Berbeda isi parameter
        
        int sum = a + b + (int)c;
        return (sum);
        
    } 
} 
public class Meth_Overloading { 
    public static void main (String[] args) { 
           
        Addition ob = new Addition(); 
           
        int sum1 = ob.add(1,2); 
        System.out.println("Hasil Penjumlahan (2angka) :" + sum1); 
        int sum2 = ob.add(1,2,3.0); 
        System.out.println("Hasil Penjumlahan (3angka) :" + sum2);       
    } 
} 