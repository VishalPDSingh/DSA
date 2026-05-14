package ch8_Array.Easy;

/*
 * Count Subarrays whose Maximum Element
 * lies in the range [left, right]
 *
 * Problem:
 * Count all subarrays where:
 *
 * left <= max(subarray) <= right
 *
 * -----------------------------------------
 * Example:
 *
 * arr   = {2,1,4,3}
 * left  = 2
 * right = 3
 *
 * Valid subarrays:
 *
 * {2}
 * {2,1}
 * {3}
 *
 * Answer = 3
 *
 * -----------------------------------------
 *
 * Brute Force Approach:
 *
 * 1. Generate all subarrays
 * 2. Find maximum of each subarray
 * 3. Check if max lies in range
 * 4. Increase count
 *
 * -----------------------------------------
 *
 * Time Complexity:
 * O(n³)
 *
 * Space Complexity:
 * O(1)
 */

public class Q19_SubArray_Max_In_Range {

    static void maxEle_SubArray(int arr[], int left, int right) {

        int count = 0;

        // i = starting index
        for (int i = 0; i < arr.length; i++) {

            // j = ending index
            for (int j = i; j < arr.length; j++) {

                // max of current subarray
                int max = Integer.MIN_VALUE;

                // k traverses current subarray
                for (int k = i; k <= j; k++) {

                    if (max < arr[k]) {
                        max = arr[k];
                    }
                }

                // Check if max lies in range
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