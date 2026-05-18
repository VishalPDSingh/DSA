package ch8_Array.Easy;

/*
 * Rotate Matrix by 90 Degree Anti-Clockwise
 * 
 * ---------------------------------------------------
 * Problem:
 * Rotate a square matrix by 90° anti-clockwise
 * without using extra space.
 * 
 * ---------------------------------------------------
 * Main Logic:
 * 
 * Step 1:
 * Transpose Matrix
 * 
 * Step 2:
 * Reverse every column
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
 * After Reversing Every Column:
 * 
 * 3 6 9
 * 2 5 8
 * 1 4 7
 * 
 * This is 90° anti-clockwise rotation.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q27_RotationOfMatrix_AntiClockwise {

    // ---------------------------------------------------
    // Rotate Matrix Anti-Clockwise
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
        // Step 2: Reverse Every Column
        // ---------------------------------------------------

        for (int col = 0; col < arr.length; col++) {

            int top = 0;

            int bottom = arr.length - 1;

            while (top < bottom) {

                int temp = arr[top][col];

                arr[top][col] = arr[bottom][col];

                arr[bottom][col] = temp;

                top++;
                bottom--;
            }
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

        System.out.println("90 Degree Anti-Clockwise Rotation:");

        printMatrix(arr);
    }
}