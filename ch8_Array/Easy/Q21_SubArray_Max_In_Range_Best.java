package ch8_Array.Easy;

/*
 * Count Subarrays whose Maximum Element
 * lies in range [left, right]
 * 
 * Best Optimal Approach
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
 * Optimal Logic:
 * 
 * We process array in one pass.
 * 
 * Three cases:
 * 
 * ---------------------------------------------------
 * Case 1:
 * arr[ep] > right
 * 
 * Invalid element.
 * Any subarray containing this element
 * can never be valid.
 * 
 * So:
 * - reset previous valid count
 * - move starting boundary
 * 
 * ---------------------------------------------------
 * Case 2:
 * left <= arr[ep] <= right
 * 
 * Current element itself is valid.
 * 
 * Number of valid subarrays ending at ep:
 * 
 * ep - lgei + 1
 * 
 * where:
 * lgei = last greater-than-right element index + 1
 * 
 * ---------------------------------------------------
 * Case 3:
 * arr[ep] < left
 * 
 * Current element alone cannot create
 * a valid subarray.
 * 
 * But it can extend previous valid subarrays.
 * 
 * So:
 * add previous valid count.
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q21_SubArray_Max_In_Range_Best {

    static void maxEle_SubArray(int arr[], int left, int right) {

        int count = 0;

        /*
         * lgei:
         * last greater element index + 1
         * 
         * Stores starting boundary
         */
        int lgei = 0;

        /*
         * Stores previous valid subarray count
         */
        int preVaildCount = 0;

        /*
         * ep -> ending point
         */
        for (int ep = 0; ep < arr.length; ep++) {

            // -----------------------------------------
            // Case 1:
            // arr[ep] > right
            // -----------------------------------------

            if (arr[ep] > right) {

                /*
                 * Reset previous valid count
                 */
                preVaildCount = 0;

                /*
                 * Move invalid boundary
                 */
                lgei = ep + 1;
            }

            // -----------------------------------------
            // Case 2:
            // left <= arr[ep] <= right
            // -----------------------------------------

            else if (arr[ep] >= left && arr[ep] <= right) {

                /*
                 * Count valid subarrays
                 */
                count = count + (ep - lgei + 1);

                /*
                 * Store valid count
                 * for future extension
                 */
                preVaildCount = ep - lgei + 1;
            }

            // -----------------------------------------
            // Case 3:
            // arr[ep] < left
            // -----------------------------------------

            else {

                /*
                 * Extend previous valid subarrays
                 */
                count = count + preVaildCount;
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