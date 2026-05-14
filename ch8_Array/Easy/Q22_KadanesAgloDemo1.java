package ch8_Array.Easy;

/*
 * Maximum Subarray Sum
 * (Brute Force Approach)
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
 * Logic:
 * 
 * Generate all subarrays:
 * 
 * i -> starting index
 * j -> ending index
 * k -> traverse subarray and calculate sum
 * 
 * Keep updating maximum sum.
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n³)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q22_KadanesAgloDemo1 {

    static void subArraySum(int arr[]) {

        // Store maximum subarray sum
        int max = Integer.MIN_VALUE;

        // Starting index
        for (int i = 0; i < arr.length; i++) {

            // Ending index
            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                // Traverse current subarray
                for (int k = i; k <= j; k++) {

                    sum = sum + arr[k];
                }

                // Update maximum sum
                if (max < sum) {

                    max = sum;
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, -6, 8, 2, 8, 4 };

        subArraySum(arr);
    }
}