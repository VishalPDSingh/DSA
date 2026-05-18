package ch8_Array.Easy;

/*
 * Find Missing Number in Array
 * 
 * Problem:
 * An array contains numbers from 1 to n.
 * One number is missing.
 * Find the missing number.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * n = 5
 * arr = {1,2,4,5}
 * 
 * Numbers should be:
 * {1,2,3,4,5}
 * 
 * Missing Number:
 * 3
 * ---------------------------------------------------
 * 
 * Logic:
 * 
 * Step 1:
 * Find expected sum from 1 to n
 * 
 * Formula:
 * 
 * sum = n(n+1)/2
 * 
 * ---------------------------------------------------
 * Step 2:
 * Find actual sum of array elements.
 * 
 * ---------------------------------------------------
 * Step 3:
 * Missing Number:
 * 
 * expectedSum - presentSum
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q1_MissingInArray {

    static int missingEle(int arr[], int n) {

        /*
         * Mathematical Formula:
         * 
         * Sum of first n natural numbers:
         * 
         * n(n+1)/2
         */

        int expectedSum = n * (n + 1) / 2;

        // Store sum of array elements
        int presentSum = 0;

        // Calculate present sum
        for (int i = 0; i < n - 1; i++) {

            presentSum = presentSum + arr[i];
        }

        // Missing number
        int ans = expectedSum - presentSum;

        return ans;
    }

    public static void main(String[] args) {

        int n = 5;

        int arr[] = { 1, 2, 4, 5 };

        int res = missingEle(arr, n);

        System.out.println(res);
    }
}