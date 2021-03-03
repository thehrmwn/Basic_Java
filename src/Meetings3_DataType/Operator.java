
package Meetings3_DataType;

public class Operator {
    public static void main (String[] args) {
        /* OPERATOR BITWISE
             berlaku untuk tipe data int, long, short, char, dan byte
             Menghitung bit-bit.
             1. Shift left ( << )
             2. Shift right ( >> )
             3. and ( & )
             4. or ( | )
             5. XOR ( ^ )
             6. Negasi ( ~ )
                TRUE XOR TRUE = FALSE
                TRUE XOR FALSE = TRUE
                FALSE XOR TRUE = TRUE
                FALSE XOR FASLE = FALSE
        */
        int a, b, c, d, e, f, g;
        
        // shift left
            a= 5;
            b = (a << 2);
        String abits, bbits;
        abits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        bbits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println("a = " + a);
        System.out.println("abits = " + abits);
        System.out.println("b = " + b);
        System.out.println("bbits = " + bbits);
        
        // shift right
            c = (b >> 1);
        String cbits;
        cbits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.println("c = " + c);
        System.out.println("cbits = " + cbits);
        
        // and
        String dbits;
        System.out.println("\n");
        System.out.println("abits = " + abits);
        System.out.println("cbits = " + cbits);
        System.out.println("------------------- &");
            d = (a&c);
           dbits = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
           System.out.println("dbits = " + dbits);
           System.out.println("d     = " + d);
           
        // or
        String ebits;
        System.out.println("\n");
        System.out.println("abits = " + abits);
        System.out.println("cbits = " + cbits);
        System.out.println("------------------- |");
            e = (a | c);
           ebits = String.format("%8s", Integer.toBinaryString(e)).replace(" ", "0");
           System.out.println("ebits = " + ebits);
           System.out.println("e     = " + e);
           
        // XOR
        String fbits;
        System.out.println("\n");
        System.out.println("abits = " + abits);
        System.out.println("bbits = " + bbits);
        System.out.println("------------------- ^");
            f = (a ^ b);
           fbits = String.format("%8s", Integer.toBinaryString(f)).replace(" ", "0");
           System.out.println("fbits = " + fbits);
           System.out.println("f     = " + f);
        
        // Negasi
        String gbits;
        System.out.println("\n");
        System.out.println("abits = " + abits);
        System.out.println("cbits = " + cbits);
        System.out.println("------------------- |");
            g = (a ^ ~c);
           gbits = String.format("%8s", Integer.toBinaryString(g)).replace(" ", "0");
           System.out.println("gbits = " + gbits);
           System.out.println("g     = " + g);
           
        // TERNARY OPERATOR = 2 kondisi True / 
        boolean Agree = true;
        String answer = (Agree ? "Yes" : "No"); //Statement Kiri : Statement Kanan
        
        System.out.println(answer);
    }
}
