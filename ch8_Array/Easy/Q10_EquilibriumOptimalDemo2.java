package ch8_Array.Easy;

/*
 * Equilibrium Index using Prefix Sum (Optimal Approach)
 * 
 * An index is called an Equilibrium Index if:
 * 
 * Left Sum == Right Sum
 * 
 * ----------------------------------------------------
 * Example:
 * arr = {-2, 6, 3, 4}
 * 
 * Index = 2
 * 
 * Left Sum  = -2 + 6 = 4
 * Right Sum = 4
 * 
 * Since both are equal,
 * index 2 is an Equilibrium Index.
 * ----------------------------------------------------
 * 
 * Optimal Approach:
 * 
 * Instead of calculating left sum and right sum
 * again and again for every index,
 * we use Prefix Sum Array.
 * 
 * Prefix Sum Formula:
 * pf[i] = pf[i-1] + arr[i]
 * 
 * ----------------------------------------------------
 * Finding Sums:
 * 
 * Left Sum:
 * pf[i - 1]
 * 
 * Right Sum:
 * totalSum - pf[i]
 * 
 * where:
 * totalSum = pf[arr.length - 1]
 * ----------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(n)
 */

public class Q10_EquilibriumOptimalDemo2 {

    // -------------------------------------------------
    // Create Prefix Sum Array
    // -------------------------------------------------
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

    // -------------------------------------------------
    // Find Equilibrium Index Count
    // -------------------------------------------------
    static int equilibriumCount(int arr[]) {

        // Create prefix sum array
        int pf[] = prefixSumOptimal(arr);

        int count = 0;

        /*
         * Start from index 1
         * because index 0 has no left side
         * 
         * End at arr.length - 2
         * because last index has no right side
         */

        for (int i = 1; i < arr.length - 1; i++) {

            // Left Sum
            int leftSum = pf[i - 1];

            // Right Sum
            int rightSum = pf[arr.length - 1] - pf[i];

            // Check equilibrium condition
            if (leftSum == rightSum) {

                count++;

                System.out.println("Equilibrium index: " + i);
            }
        }
        // 0th index sum
        if (0 == pf[arr.length - 1] - pf[0]) {
            count++;
        }
        // last index sum
        if (pf[arr.length - 2] == 0) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

        int res = equilibriumCount(arr);

        System.out.println("Total Equilibrium Index Count: " + res);
    }
}