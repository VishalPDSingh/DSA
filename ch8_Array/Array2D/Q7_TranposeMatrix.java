package ch8_Array.Array2D;

import java.util.Scanner;

public class Q7_TranposeMatrix {
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

        int b[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = arr[j][i];
            }
        }
        System.out.println("Original MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[j][i] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }
        System.out.println("T-MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[j][i] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }
        sc.close();
    }
}
