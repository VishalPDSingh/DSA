package ch8_Array.Easy;

/*
 * Prefix Sum Application
 * 
 * Problem:
 * We are given:
 * 1. An array
 * 2. Multiple queries
 * 
 * Each query contains:
 *      l -> starting index
 *      r -> ending index
 * 
 * We need to find:
 * Sum of elements from index l to r
 * 
 * -------------------------------------------------------
 * Example:
 * arr = {2, 5, 1, 3, 4}
 * Query = {1, 3}
 * 
 * Sum = 5 + 1 + 3 = 9
 * -------------------------------------------------------
 * 
 * There are two approaches:
 * 
 * 1. Brute Force
 *    - Traverse every query range manually
 *    - Time Complexity = O(q * n)
 * 
 * 2. Prefix Sum (Optimal)
 *    - Precompute prefix sum array
 *    - Answer each query in O(1)
 *    - Total Time Complexity = O(n + q)
 */

public class Q8_PrefixSum_Application {

    // ---------------------------------------------------------
    // Brute Force Approach
    // ---------------------------------------------------------
    static void querySum(int arr[], int q[][]) {

        // Traverse all queries
        for (int i = 0; i < q.length; i++) {

            int l = q[i][0]; // starting index
            int r = q[i][1]; // ending index

            int sum = 0;

            // Traverse from l to r and calculate sum
            for (int j = l; j <= r; j++) {

                sum = sum + arr[j];
            }

            // Print answer of current query
            System.out.println(sum);
        }
    }

    // ---------------------------------------------------------
    // Create Prefix Sum Array
    // ---------------------------------------------------------
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

    // ---------------------------------------------------------
    // Optimal Query Sum using Prefix Sum
    // ---------------------------------------------------------
    static void querySumOptimal(int arr[], int q[][]) {

        // Create prefix sum array
        int pf[] = prefixSumOptimal(arr);

        // Traverse all queries
        for (int i = 0; i < q.length; i++) {

            int l = q[i][0];
            int r = q[i][1];

            /*
             * Formula:
             * Sum(l -> r) = pf[r] - pf[l - 1]
             * 
             * Example:
             * pf = {2,7,8,11,15}
             * Query = {1,3}
             * 
             * Answer:
             * pf[3] - pf[0]
             * 11 - 2 = 9
             */

            // If l is greater than 0
            if (l > 0) {

                System.out.println(pf[r] - pf[l - 1]);
            }

            // If query starts from index 0
            else {

                System.out.println(pf[r]);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 4, 1, 7, -8, 2, 0 };

        int q[][] = {
                { 3, 8 },
                { 2, 4 },
                { 0, 3 },
                { 5, 9 },
                { 6, 6 }
        };

        // Brute Force Output
        querySum(arr, q);

        System.out.println("---------------------------------");

        // Optimal Output
        querySumOptimal(arr, q);
    }
}