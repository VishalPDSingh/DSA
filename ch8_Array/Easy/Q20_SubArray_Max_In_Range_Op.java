package ch8_Array.Easy;

/*
 * Count Subarrays whose Maximum Element
 * lies in range [left, right]
 * 
 * Optimized Brute Force Approach
 * 
 * ---------------------------------------------------
 * Problem:
 * Count all subarrays such that:
 * 
 * left <= maxElement <= right
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {2,1,4,3}
 * left = 2
 * right = 3
 * 
 * Valid subarrays:
 * 
 * {2}
 * {2,1}
 * {3}
 * 
 * Count = 3
 * ---------------------------------------------------
 * 
 * Optimization:
 * 
 * Instead of recalculating maximum
 * for every subarray,
 * maintain running maximum.
 * 
 * ---------------------------------------------------
 * Logic:
 * 
 * For every starting index i:
 * 
 * 1. Start max = -infinity
 * 2. Expand subarray using j
 * 3. Update max continuously
 * 
 * max = Math.max(max, arr[j])
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(1)
 * 
 * Previous brute force:
 * O(n³)
 */

public class Q20_SubArray_Max_In_Range_Op {

    static void maxEle_SubArray(int arr[], int left, int right) {

        int count = 0;

        // Starting index
        for (int i = 0; i < arr.length; i++) {

            /*
             * Store maximum element
             * of current subarray
             */
            int max = Integer.MIN_VALUE;

            // Ending index
            for (int j = i; j < arr.length; j++) {

                /*
                 * Update maximum
                 * while expanding subarray
                 */
                max = Math.max(max, arr[j]);

                /*
                 * Check if max lies
                 * within range
                 */
                if (left <= max && max <= right) {

                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 4, 3 };

        int left = 2;
        int right = 3;

        maxEle_SubArray(arr, left, right);
    }
}