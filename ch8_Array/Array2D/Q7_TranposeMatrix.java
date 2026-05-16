
package ch8_Array.Array2D;

import java.util.Scanner;

public class Q7_TranposeMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the size of col: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        // Input matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.println(
                        "Enter the element at index (" + i + "," + j + "):");

                a[i][j] = sc.nextInt();
            }
        }

        // Transpose matrix size = col x row
        int c[][] = new int[col][row];

        // Transpose logic
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                c[j][i] = a[i][j];
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix Elements:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Print transpose matrix
        System.out.println("\nTranspose Matrix Elements:");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}