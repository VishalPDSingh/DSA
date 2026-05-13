package ch8_Array.Easy;

/*
 * Sum of All Subarrays using Prefix Sum
 * 
 * Problem:
 * Find the total sum of all possible subarrays.
 * 
 * ---------------------------------------------------
 * Example:
 * arr = {5, 3, -1, 8}
 * 
 * All Subarrays:
 * 
 * {5}            = 5
 * {5,3}          = 8
 * {5,3,-1}       = 7
 * {5,3,-1,8}     = 15
 * {3}            = 3
 * {3,-1}         = 2
 * {3,-1,8}       = 10
 * {-1}           = -1
 * {-1,8}         = 7
 * {8}            = 8
 * 
 * Total Sum = 64
 * ---------------------------------------------------
 * 
 * Prefix Sum Logic:
 * 
 * Prefix Sum Formula:
 * pf[i] = pf[i-1] + arr[i]
 * 
 * Using prefix sum,
 * subarray sum from i to j:
 * 
 * If i == 0:
 * sum = pf[j]
 * 
 * Else:
 * sum = pf[j] - pf[i-1]
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(n)
 */

public class Q17_SubArrayDemo2 {

    // ---------------------------------------------------
    // Create Prefix Sum Array
    // ---------------------------------------------------
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

    // ---------------------------------------------------
    // Find Sum of All Subarrays
    // ---------------------------------------------------
    static void subArraySum(int arr[]) {

        // Create prefix sum array
        int pf[] = prefixSumOptimal(arr);

        int ans = 0;

        /*
         * i -> starting index
         * j -> ending index
         */

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                // If subarray starts from index 0
                if (i == 0) {

                    ans = ans + pf[j];
                }

                // General case
                else {

                    ans = ans + (pf[j] - pf[i - 1]);
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, -1, 8 };

        subArraySum(arr);
    }
}