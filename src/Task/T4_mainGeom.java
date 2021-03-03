//Menghitung Volume Bangun Ruang
/*  1. Balok = r pangkat 3
    2. Prisma Segitiga = 1/2 * a * t * T (Luas Alas * T)
    3. Limas Segitiga = 1/6 * a * t * T (Luas Alas * T)
    3. Kerucut = 1/3 * phi * r2 * T
    4. Bola = 4/3 * phi * r3
*/
package Task;

import java.util.Scanner;

public class T4_mainGeom {
    public static void main(String[] args) {
        int pick;
        Scanner input = new Scanner (System.in);
            T4_classGeom Volume = new T4_classGeom();
        
        
       System.out.println("    - - FIND VOLUME OF THE GEOMETRY - - ");
       System.out.println("[=========================================]");
       System.out.println("Choose what you want to Find : ");
       System.out.println("1. Cube Volume");
       System.out.println("2. Triangular Prism Volume");
       System.out.println("3. Triangular Limas Volume");
       System.out.println("4. Cone Volume");
       System.out.println("5. Sphere Volume");
       System.out.print("Pick (1-5)     : ");
        pick = input.nextInt();
        
        switch (pick) {
            case 1 : 
  
                System.out.println("- - - C U B E  VOLUME - - -");
                System.out.println("     Rumus : r * r * r");
                    System.out.print("Input Edge : ");
                        Volume.edge = input.nextInt();
                System.out.print("Volume :  " + Volume.cube(Volume.edge));
//      System.out.println(String.format("%.3f", (Volume.cube(Volume.edge));
//      double xad = 32.07876123;
//      System.out.println(String.format("%.3f", xad));
                break;
                
            case 2 :
                System.out.println("- - - TRIANGULAR  P R I S M  VOLUME - - -");
                System.out.println("        Rumus : 1/2 * a * t * T");
                    System.out.print("Input Base : ");
                        Volume.base = input.nextInt();
                    System.out.print("Input Base height : ");
                        Volume.height = input.nextInt();
                    System.out.print("Input PRISM height : ");
                        Volume.T = input.nextInt();
                System.out.println("Volume : " + Volume.prism(Volume.base, Volume.height, Volume.T) + " m3");
                break;
                
            case 3 : 
                System.out.println("- - - TRIANGULAR  L I M A S  VOLUME - - -");
                System.out.println("        Rumus : 1/6 * a * t * T");
                    System.out.print("Input Base : ");
                        Volume.base = input.nextInt();
                    System.out.print("Input Base height : ");
                        Volume.height = input.nextInt();
                    System.out.print("Input PRISM height : ");
                        Volume.T = input.nextInt();
                System.out.println("Volume : " + Volume.lisma(Volume.base, Volume.height, Volume.T) + " m3");
                break;
                
            case 4 :
                System.out.println("- - - C O N E  VOLUME - - -");
                System.out.println("     Rumus : 1/2 * phi * r * r * T");
                    System.out.print("Input r : ");
                        Volume.r = input.nextFloat();
                    System.out.print("Input CONE height : ");
                        Volume.T = input.nextInt();
                System.out.println("Volume : " + Volume.cone(Volume.r, Volume.T) + " m3");
                break;
                
            case 5 :
                System.out.println("- - - S P H E R E  VOLUME - - -");
                System.out.println("     Rumus : 4/3 * phi * r * r * r");
                    System.out.print("Input r : ");
                        Volume.r = input.nextFloat();
                System.out.println("Volume : " + Volume.sphere(Volume.r) + " m3");
                break;
                
            default :
                System.out.println("Your Choice Can't Find");
                System.out.println("    L     O     L     ");
                break;
                
        }
       
            
            
       
    }
    
}
