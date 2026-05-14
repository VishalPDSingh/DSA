package ch8_Array.Easy;

/*
 * Maximum Subarray Sum using Prefix Sum
 * 
 * Problem:
 * Find the maximum sum among all possible subarrays.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {3, 2, -6, 8, 2, 8, 4}
 * 
 * Maximum Subarray:
 * 
 * {8,2,8,4}
 * 
 * Sum:
 * 8 + 2 + 8 + 4 = 22
 * ---------------------------------------------------
 * 
 * Prefix Sum Logic:
 * 
 * Prefix Sum Formula:
 * pf[i] = pf[i-1] + arr[i]
 * 
 * ---------------------------------------------------
 * Subarray Sum Formula:
 * 
 * Sum from i to j:
 * 
 * If i == 0:
 * sum = pf[j]
 * 
 * Else:
 * sum = pf[j] - pf[i-1]
 * ---------------------------------------------------
 * 
 * Optimization:
 * 
 * Instead of recalculating subarray sum
 * using third loop,
 * prefix sum calculates each subarray sum
 * in O(1).
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(n)
 */

public class Q23_KadanesAlgoDemo2 {

    // ---------------------------------------------------
    // Create Prefix Sum Array
    // ---------------------------------------------------
    static int[] prefixSum(int arr[]) {

        int pf[] = new int[arr.length];

        // First element remains same
        pf[0] = arr[0];

        // Build prefix sum array
        for (int i = 1; i < arr.length; i++) {

            pf[i] = pf[i - 1] + arr[i];
        }

        return pf;
    }

    // ---------------------------------------------------
    // Find Maximum Subarray Sum
    // ---------------------------------------------------
    static int maxSumSubArray(int arr[]) {

        int max = Integer.MIN_VALUE;

        // Create prefix sum array
        int pf[] = prefixSum(arr);

        /*
         * i -> starting index
         * j -> ending index
         */

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                // If subarray starts from index 0
                if (i == 0) {

                    sum = pf[j];
                }

                // General case
                else {

                    sum = pf[j] - pf[i - 1];
                }

                // Update maximum sum
                if (sum > max) {

                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int a[] = { 3, 2, -6, 8, 2, 8, 4 };

        int res = maxSumSubArray(a);

        System.out.println(res);
    }
}