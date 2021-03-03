package Meetings4_MatArr;

import java.util.Scanner;

public class L7_KaliMatrix {
    public static void main(String[] args) {
        int i, j;
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][2];
        int[][] matrixC = new int[3][2];
        
        Scanner input = new Scanner (System.in);
        System.out.println("= = = MATRIX A = = =");
        for (i=0; i<3; i++){
            for (j=0; j<3; j++) {
                System.out.print("Indeks ke" +"["+i+"]"+"["+j+"] : ");
                    matrixA[i][j] = input.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("= = = MATRIX B = = =");
        for (i=0; i<3; i++) {
            for (j=0; j<2; j++) {
                System.out.print("Indeks ke" +"["+i+"]"+"["+j+"] : ");
                    matrixB[i][j] = input.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("= = = PROGRAM PERKALIAN MATRIX = = =");
        System.out.println("        = = = MATRIX A = = =        ");
        for (i=0; i<3; i++){
            System.out.println();
            for (j=0; j<3; j++) {
                System.out.print(matrixA[i][j] + " ");     
            }
        }
        System.out.println("\n");
        System.out.println("        = = = MATRIX B = = =");
        for (i=0; i<3; i++) {
            System.out.println();
            for (j=0; j<2; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
        }
        System.out.println("\n");
        System.out.println("        = = = MATRIX C = = =");
        for (i=0; i<3; i++) {
            for (j=0; j<2; j++) {
                matrixC[i][j] = 0;
                for (int k=0; k<3; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                
                }
                System.out.print(matrixC[i][j] + "  ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");

        
    }
    
}