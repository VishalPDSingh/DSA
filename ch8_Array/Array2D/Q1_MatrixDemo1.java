package ch8_Array.Array2D;

import java.util.Scanner;

public class Q1_MatrixDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of col: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter the matrix Ele One by one: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }
        sc.close();
    }
}
