package ch8_Array.Easy;

/*
 * Print All Subarrays
 * 
 * Problem:
 * Print all possible subarrays of an array.
 * 
 * ---------------------------------------------------
 * Example:
 * arr = {5, 3, -1}
 * 
 * Subarrays:
 * 
 * {5}
 * {5,3}
 * {5,3,-1}
 * 
 * {3}
 * {3,-1}
 * 
 * {-1}
 * ---------------------------------------------------
 * 
 * Logic:
 * 
 * Three loops are used:
 * 
 * 1. i -> starting index
 * 2. j -> ending index
 * 3. k -> prints elements from i to j
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n³)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q14_SubArrayDemo1 {

    static void subArray(int arr[]) {

        /*
         * i -> starting index
         */

        for (int i = 0; i < arr.length; i++) {

            /*
             * j -> ending index
             */

            for (int j = i; j < arr.length; j++) {

                /*
                 * k prints elements
                 * from index i to j
                 */

                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                }

                // Move to next subarray
                System.out.println();
            }

            // New line after each starting index
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, -1, 8 };

        subArray(arr);
    }
}