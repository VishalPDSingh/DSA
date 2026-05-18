package ch8_Array.Easy;

import java.util.Scanner;

/*
 * Transpose of Matrix
 * 
 * ---------------------------------------------------
 * What is Transpose?
 * 
 * Transpose means:
 * 
 * Convert rows into columns
 * and columns into rows.
 * 
 * ---------------------------------------------------
 * Mathematical Rule:
 * 
 * arr[i][j]  ->  arr[j][i]
 * 
 * Swap:
 * 
 * (i,j) with (j,i)
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * Original Matrix:
 * 
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * Transpose:
 * 
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * ---------------------------------------------------
 * 
 * Important:
 * 
 * In-place transpose is possible only
 * for square matrix (n × n).
 * 
 * Because:
 * rows = columns
 * 
 * ---------------------------------------------------
 * Rectangle Matrix:
 * 
 * Example:
 * 2 × 3
 * 
 * After transpose:
 * 3 × 2
 * 
 * So size changes.
 * 
 * Therefore,
 * transpose cannot be done
 * inside same matrix.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q26_TranposeOfMatrix {

    // ---------------------------------------------------
    // Transpose for Square Matrix
    // ---------------------------------------------------
    static void tranposeMatrix(int arr[][]) {

        /*
         * Traverse lower triangle only
         * 
         * Why?
         * 
         * Because upper triangle elements
         * are automatically swapped.
         */

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {

                /*
                 * Swap:
                 * arr[i][j] <-> arr[j][i]
                 */

                int temp = arr[i][j];

                arr[i][j] = arr[j][i];

                arr[j][i] = temp;
            }
        }

        // Print transpose matrix
        System.out.println("TRANSPOSE MATRIX ELEMENTS ARE:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + "[" + i + "," + j + "] ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows
        System.out.println("Enter the number of rows:");

        int row = sc.nextInt();

        // Input columns
        System.out.println("Enter the number of columns:");

        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        // Input matrix elements
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println(
                        "Enter element at index (" + i + "," + j + ")");

                arr[i][j] = sc.nextInt();
            }
        }

        // Print original matrix
        System.out.println("ORIGINAL MATRIX:");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + "[" + i + "," + j + "] ");
            }

            System.out.println();
        }

        /*
         * Transpose only possible
         * in-place for square matrix
         */

        if (row == col) {

            tranposeMatrix(arr);
        }

        else {

            System.out.println(
                    "In-place transpose not possible for rectangular matrix.");
        }

        sc.close();
    }
}