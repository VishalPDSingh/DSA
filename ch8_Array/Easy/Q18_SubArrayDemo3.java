package ch8_Array.Easy;

/*
 * Sum of All Subarrays
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
 * Optimal Logic:
 * 
 * Instead of generating all subarrays,
 * calculate contribution of each element.
 * 
 * ---------------------------------------------------
 * Formula:
 * 
 * Occurrence of arr[i]:
 * 
 * (i + 1) * (n - i)
 * 
 * where:
 * 
 * (i + 1)
 * -> number of choices for starting index
 * 
 * (n - i)
 * -> number of choices for ending index
 * 
 * ---------------------------------------------------
 * Contribution:
 * 
 * arr[i] * occurrence
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q18_SubArrayDemo3 {

    static int totalSum(int arr[]) {

        int ans = 0;

        int n = arr.length;

        // Traverse every element
        for (int i = 0; i < n; i++) {

            /*
             * Number of subarrays
             * in which arr[i] appears
             */
            int occ = (i + 1) * (n - i);

            /*
             * Add contribution
             */
            ans = ans + (occ * arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, -1, 8 };

        int ans = totalSum(arr);

        System.out.println(ans);
    }
}