package ch8_Array.Easy;

/*
 * Prefix Sum Array
 * 
 * Problem:
 * Create a Prefix Sum Array.
 * 
 * ---------------------------------------------------
 * Prefix Sum Meaning:
 * 
 * prefix[i] stores sum of elements
 * from index 0 to i.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {10,20,30,70,65}
 * 
 * Prefix Sum:
 * 
 * pf[0] = 10
 * pf[1] = 10 + 20 = 30
 * pf[2] = 10 + 20 + 30 = 60
 * pf[3] = 130
 * pf[4] = 195
 * 
 * Final Prefix Sum Array:
 * {10,30,60,130,195}
 * ---------------------------------------------------
 * 
 * Prefix Sum Formula:
 * 
 * pf[i] = pf[i-1] + arr[i]
 * 
 * ---------------------------------------------------
 * Uses of Prefix Sum:
 * 
 * 1. Range Sum Query
 * 2. Subarray Sum
 * 3. Equilibrium Index
 * 4. Running Sum
 * 5. Competitive Programming
 * ---------------------------------------------------
 */

public class Q7_PrefixSum {

    // ---------------------------------------------------
    // Brute Force Approach
    // ---------------------------------------------------
    /*
     * For every index i,
     * calculate sum from 0 to i
     * using inner loop.
     * 
     * Time Complexity:
     * O(n²)
     * 
     * Space Complexity:
     * O(n)
     */

    static int[] prefixSum(int arr[]) {

        int pf[] = new int[arr.length];

        // Traverse every index
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            // Calculate sum from 0 to i
            for (int j = 0; j <= i; j++) {

                sum = sum + arr[j];
            }

            pf[i] = sum;
        }

        return pf;
    }

    // ---------------------------------------------------
    // Optimal Solution
    // ---------------------------------------------------
    /*
     * Mathematical Formula:
     * 
     * pf[i] = pf[i-1] + arr[i]
     * 
     * Meaning:
     * 
     * Current prefix sum =
     * previous prefix sum + current element
     * 
     * ---------------------------------------------------
     * Example:
     * 
     * pf[2]
     * = pf[1] + arr[2]
     * = 30 + 30
     * = 60
     * 
     * ---------------------------------------------------
     * Time Complexity:
     * O(n)
     * 
     * Space Complexity:
     * O(n)
     */

    static int[] prefixSumOptimal(int arr[]) {

        int pf[] = new int[arr.length];

        // First element remains same
        pf[0] = arr[0];

        // Build prefix sum array
        for (int i = 1; i < arr.length; i++) {

            pf[i] = pf[i - 1] + arr[i];
        }

        return pf;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 70, 65 };

        // -----------------------------
        // Brute Force Output
        // -----------------------------
        System.out.println("This is Brute Force");

        int ans[] = prefixSum(arr);

        for (int res : ans)

            System.out.println(res);

        // -----------------------------
        // Optimal Output
        // -----------------------------
        System.out.println("Optimal");

        int ans1[] = prefixSumOptimal(arr);

        for (int res1 : ans1)

            System.out.println(res1);
    }
}