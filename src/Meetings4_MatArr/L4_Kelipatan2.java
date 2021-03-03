package Meetings4_MatArr;

public class L4_Kelipatan2 {
    public static void main(String[] args) {
        //Genap dari 2 - 20.... Tanpa Kelipatan 6 (6,12,18)
        int i, x, y;
        
        for ( i=2; i<=20 ; i++) {
            x = i%2; y = i%6;
            if ((y==1) || (x==0)) {
                System.out.println(i + " ");    
            }
            
        }
        
    }
}
