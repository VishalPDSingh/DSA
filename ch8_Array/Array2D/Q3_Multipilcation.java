package ch8_Array.Array2D;

import java.util.Scanner;

public class Q3_Multipilcation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix-A size
        System.out.println("Enter Matrix-A row size:");
        int row = sc.nextInt();

        System.out.println("Enter Matrix-A column size:");
        int col = sc.nextInt();

        System.out.println("**************************");

        // Matrix-B size
        System.out.println("Enter Matrix-B row size:");
        int rsize2 = sc.nextInt();

        System.out.println("Enter Matrix-B column size:");
        int csize2 = sc.nextInt();

        // Check multiplication condition
        if (col == rsize2) {

            int a[][] = new int[row][col];
            int b[][] = new int[rsize2][csize2];
            int c[][] = new int[row][csize2];

            // Input Matrix-A
            System.out.println("Enter elements in Matrix-A:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            // Input Matrix-B
            System.out.println("Enter elements in Matrix-B:");
            for (int i = 0; i < rsize2; i++) {
                for (int j = 0; j < csize2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Matrix Multiplication
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < csize2; j++) {

                    c[i][j] = 0;

                    for (int k = 0; k < col; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Print Matrix-A
            System.out.println("\nMATRIX-A:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            // Print Matrix-B
            System.out.println("\nMATRIX-B:");
            for (int i = 0; i < rsize2; i++) {
                for (int j = 0; j < csize2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            // Print Result Matrix
            System.out.println("\nMATRIX-C (MULTIPLICATION):");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < csize2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Matrix multiplication is not possible");
        }

        sc.close();
    }
}