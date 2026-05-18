package ch8_Array.Easy;

/*
 * Rotate Matrix by 90 Degree Clockwise
 * 
 * ---------------------------------------------------
 * Problem:
 * Rotate a square matrix by 90° clockwise
 * without using extra space.
 * 
 * ---------------------------------------------------
 * Main Logic:
 * 
 * Step 1:
 * Transpose Matrix
 * 
 * Step 2:
 * Reverse every row
 * 
 * ---------------------------------------------------
 * Why it works?
 * 
 * Original Matrix:
 * 
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * ---------------------------------------------------
 * After Transpose:
 * 
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 
 * ---------------------------------------------------
 * After Reversing Every Row:
 * 
 * 7 4 1
 * 8 5 2
 * 9 6 3
 * 
 * This is 90° clockwise rotation.
 * ---------------------------------------------------
 * 
 * Important:
 * 
 * Rotation in-place is possible only
 * for square matrix (n × n).
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q27_RotationOfMatrix {

    // ---------------------------------------------------
    // Rotate Matrix
    // ---------------------------------------------------
    static void rotation(int arr[][]) {

        // ---------------------------------------------------
        // Step 1: Transpose Matrix
        // ---------------------------------------------------

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {

                /*
                 * Swap:
                 * arr[i][j] ↔ arr[j][i]
                 */

                int temp = arr[i][j];

                arr[i][j] = arr[j][i];

                arr[j][i] = temp;
            }
        }

        // ---------------------------------------------------
        // Step 2: Reverse every row
        // ---------------------------------------------------

        for (int i = 0; i < arr.length; i++) {

            reverse(arr[i]);
        }
    }

    // ---------------------------------------------------
    // Reverse Array
    // ---------------------------------------------------
    static void reverse(int arr[]) {

        int i = 0;

        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];

            arr[i] = arr[j];

            arr[j] = temp;

            i++;
            j--;
        }
    }

    // ---------------------------------------------------
    // Print Matrix
    // ---------------------------------------------------
    static void printMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");

        printMatrix(arr);

        rotation(arr);

        System.out.println("90 Degree Clockwise Rotation:");

        printMatrix(arr);
    }
}