package ch8_Array.Array2D;

import java.util.Scanner;

public class Q2_AdditionOfTwo_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix-A size
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the size of col: ");
        int col = sc.nextInt();

        System.out.println("**************************");

        // Matrix-B size
        System.out.println("Enter matrix-B row size:");
        int rsize2 = sc.nextInt();

        System.out.println("Enter matrix-B column size:");
        int csize2 = sc.nextInt();

        // Check whether addition is possible
        if (row == rsize2 && col == csize2) {

            int a[][] = new int[row][col];
            int b[][] = new int[rsize2][csize2];
            int c[][] = new int[row][col];

            // Input Matrix-A
            System.out.println("Enter the elements in Matrix-A:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            // Input Matrix-B
            System.out.println("Enter the elements in Matrix-B:");
            for (int i = 0; i < rsize2; i++) {
                for (int j = 0; j < csize2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Addition of matrices
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            // Print Matrix-A
            System.out.println("\nMATRIX-A ELEMENTS ARE:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            // Print Matrix-B
            System.out.println("\nMATRIX-B ELEMENTS ARE:");
            for (int i = 0; i < rsize2; i++) {
                for (int j = 0; j < csize2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            // Print Result Matrix-C
            System.out.println("\nMATRIX-C (ADDITION) IS:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Matrix addition is not possible");
        }

        sc.close();
    }
}