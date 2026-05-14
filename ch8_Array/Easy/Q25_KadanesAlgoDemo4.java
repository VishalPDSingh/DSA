package ch8_Array.Easy;

/*
 * Kadane's Algorithm
 * 
 * Mathematical Core:
 * 
 * currentSum = max(arr[i], currentSum + arr[i])
 * 
 * ---------------------------------------------------
 * Meaning:
 * 
 * At every index,
 * we have two choices:
 * 
 * 1. Start new subarray from arr[i]
 * 
 * arr[i]
 * 
 * 2. Continue previous subarray
 * 
 * currentSum + arr[i]
 * 
 * ---------------------------------------------------
 * We choose whichever is larger.
 * 
 * If previous currentSum is negative,
 * then:
 * 
 * currentSum + arr[i] becomes smaller
 * 
 * so we start a new subarray.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * currentSum = -5
 * arr[i] = 8
 * 
 * Choice 1:
 * 8
 * 
 * Choice 2:
 * -5 + 8 = 3
 * 
 * max(8,3) = 8
 * 
 * So start new subarray from 8.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q25_KadanesAlgoDemo4 {

    static int kadanesAlgo(int arr[]) {

        int currentSum = arr[0];

        int max = arr[0];

        // Traverse array
        for (int i = 1; i < arr.length; i++) {

            /*
             * Mathematical Formula:
             * 
             * currentSum =
             * max(arr[i], currentSum + arr[i])
             * 
             * Decide:
             * 
             * continue previous subarray
             * OR
             * start new subarray
             */

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum answer
            max = Math.max(max, currentSum);
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, -6, 8, 2, 8, 4 };

        int res = kadanesAlgo(arr);

        System.out.println(res);
    }
}