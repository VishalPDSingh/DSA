package ch8_Array.Array2D;

import java.util.Scanner;

public class Q3_Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the value of col: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter at the index " + "( " + i + "," + j + ")");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows: ");
        int row2 = sc.nextInt();
        System.out.println("Enter the value of col: ");
        int col2 = sc.nextInt();
        int b[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Enter at the index " + "( " + i + "," + j + ")");
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[row][col];
        if (row == row2 && col == col2) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < col2; k++) {
                        c[i][j] = c[i][j] + (arr[i][k] * b[k][j]);
                    }
                }
            }
        }
        System.out.println("A-MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }

        System.out.println("B-MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }

        System.out.println("C-MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }
        sc.close();
    }
}
