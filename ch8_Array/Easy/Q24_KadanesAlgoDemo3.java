package ch8_Array.Easy;

/*
 * Kadane's Algorithm
 * 
 * Problem:
 * Find the Maximum Sum Subarray.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {3, 2, -6, 8, 2, 8, 4}
 * 
 * Maximum Subarray:
 * {8,2,8,4}
 * 
 * Maximum Sum:
 * 22
 * ---------------------------------------------------
 * 
 * Main Idea:
 * 
 * If currentSum becomes negative,
 * it cannot help future subarrays.
 * 
 * So:
 * discard negative currentSum
 * and start new subarray.
 * 
 * ---------------------------------------------------
 * Cases:
 * 
 * Case 1:
 * All Positive Numbers
 * 
 * Example:
 * {2,3,4}
 * 
 * Best subarray:
 * whole array
 * 
 * Sum = 9
 * ---------------------------------------------------
 * 
 * Case 2:
 * Negative + Positive
 * 
 * Example:
 * {-2,-3,5,6}
 * 
 * Ignore negative prefix
 * 
 * Best subarray:
 * {5,6}
 * 
 * Sum = 11
 * ---------------------------------------------------
 * 
 * Case 3:
 * Positive + Negative
 * 
 * Example:
 * {5,-2,4}
 * 
 * Check:
 * 
 * 5 + (-2) = 3
 * 
 * Since result is still positive,
 * continue subarray.
 * 
 * Final:
 * 3 + 4 = 7
 * ---------------------------------------------------
 * 
 * Core Logic:
 * 
 * If currentSum >= 0:
 * continue subarray
 * 
 * Else:
 * start new subarray
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q24_KadanesAlgoDemo3 {

    static int kadanesAlgo(int arr[]) {

        int currentSum = 0;

        // Store maximum subarray sum
        int max = Integer.MIN_VALUE;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            /*
             * If current sum is positive,
             * continue subarray
             */
            if (currentSum >= 0) {

                currentSum = currentSum + arr[i];
            }

            /*
             * If current sum becomes negative,
             * start new subarray
             */
            else {

                currentSum = arr[i];
            }

            // Update maximum sum
            max = Math.max(max, currentSum);
        }

        return max;
    }

    public static void main(String[] args) {

        int a[] = { 3, 2, -6, 8, 2, 8, 4 };

        int res = kadanesAlgo(a);

        System.out.println(res);
    }
}