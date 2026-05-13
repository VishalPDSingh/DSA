package ch8_Array.Easy;

/*
 * Print Sum of All Subarrays (Brute Force)
 * 
 * Problem:
 * Print the sum of every possible subarray.
 * 
 * ---------------------------------------------------
 * Example:
 * arr = {1,2,3}
 * 
 * Subarrays:
 * 
 * {1}       -> 1
 * {1,2}     -> 3
 * {1,2,3}   -> 6
 * 
 * {2}       -> 2
 * {2,3}     -> 5
 * 
 * {3}       -> 3
 * ---------------------------------------------------
 * 
 * Logic:
 * 
 * Three loops are used:
 * 
 * 1. i -> starting index
 * 2. j -> ending index
 * 3. k -> traverse subarray and calculate sum
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n³)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q15_SubArraySum {

    static void subArraySum(int arr[]) {

        /*
         * i -> starting index
         */

        for (int i = 0; i < arr.length; i++) {

            /*
             * j -> ending index
             */

            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                /*
                 * k traverses from i to j
                 * and calculates subarray sum
                 */

                for (int k = i; k <= j; k++) {

                    sum = sum + arr[k];
                }

                // Print current subarray sum
                System.out.println(sum);
            }

            // New line after each starting index
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        subArraySum(arr);
    }
}