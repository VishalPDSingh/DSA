package ch8_Array.Easy;

/*
 * Equilibrium Index
 * 
 * An index is called an Equilibrium Index if:
 * 
 * Sum of elements on left side
 * ==
 * Sum of elements on right side
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
 * Brute Force Approach:
 * 
 * For every index:
 * 1. Calculate left sum
 * 2. Calculate right sum
 * 3. Compare both sums
 * 
 * Time Complexity:
 * O(n²)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q9_EquilibriumIndexDemo1 {

    static int equilibriumCount(int arr[]) {

        int count = 0;

        // Traverse every index
        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // -----------------------------------
            // Calculate Left Sum
            // -----------------------------------
            // Sum from index 0 to i-1

            for (int j = 0; j < i; j++) {

                leftSum = leftSum + arr[j];
            }

            // -----------------------------------
            // Calculate Right Sum
            // -----------------------------------
            // Sum from index i+1 to last index

            for (int k = i + 1; k < arr.length; k++) {

                rightSum = rightSum + arr[k];
            }

            // -----------------------------------
            // Check Equilibrium Condition
            // -----------------------------------

            if (leftSum == rightSum) {

                count++;

                System.out.println("Equilibrium index: " + i);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 1,7,3,4,6,5,6,4 };

        int res = equilibriumCount(arr);

        System.out.println("Total Equilibrium Index Count: " + res);
    }
}