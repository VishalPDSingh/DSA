package ch17_Searching.Easy;

/*
 * Question:
 * Given a sorted array and a target value k,
 * find the Floor of k using Binary Search.
 *
 * Floor:
 * The largest element in the array that is
 * less than or equal to the target value k.
 *
 * Example:
 * arr = {-4, 3, 4, 7, 10, 11, 12, 15, 19}
 * k = 13
 *
 * Output: 12
 *
 * Explanation:
 * Among all elements smaller than or equal to 13,
 * the largest element is 12, so the floor is 12.
 *
 * --------------------------------------------------
 * Intuition:
 * --------------------------------------------------
 * Since the array is sorted, Binary Search can be used.
 *
 * Whenever arr[mid] is less than k:
 * - arr[mid] can be a possible floor.
 * - Store it as the current answer.
 * - Move right to search for a larger value that is
 *   still less than or equal to k.
 *
 * Whenever arr[mid] is greater than k:
 * - It cannot be the floor.
 * - Move left to find smaller values.
 *
 * If arr[mid] equals k:
 * - k itself is the floor.
 *
 * --------------------------------------------------
 * Step-by-Step Algorithm:
 * --------------------------------------------------
 * 1. Initialize low = 0 and high = n - 1.
 * 2. Create a variable ans to store the floor.
 * 3. While low <= high:
 *      a. Find mid.
 *      b. If arr[mid] == k, return k.
 *      c. If arr[mid] < k:
 *           - Store arr[mid] as a possible floor.
 *           - Move to the right half.
 *      d. If arr[mid] > k:
 *           - Move to the left half.
 * 4. Return ans.
 *
 * --------------------------------------------------
 * Time Complexity:
 * --------------------------------------------------
 * O(log n)
 * Binary Search halves the search space in every step.
 *
 * --------------------------------------------------
 * Space Complexity:
 * --------------------------------------------------
 * O(1)
 * Only a few extra variables are used.
 */

public class Q2_BinarySearchFloor {

    static int floorNum(int arr[], int k) {
        // Start of search range
        int low = 0;

        // End of search range
        int high = arr.length - 1;

        // Stores the best floor found so far
        int ans = Integer.MIN_VALUE;

        // Continue searching while search space exists
        while (low <= high) {
            // Find middle index
            int mid = (low + high) / 2;

            // Exact match found, k itself is the floor
            if (arr[mid] == k) {
                return k;
            }

            // Current element can be a floor
            else if (arr[mid] < k) {
                // Update answer
                ans = arr[mid];

                // Search for a larger possible floor on right side
                low = mid + 1;
            }

            // Current element is greater than target
            else {
                // Search on left side
                high = mid - 1;
            }
        }

        // Return final floor value
        return ans;
    }

    public static void main(String[] args) {
        // Sorted array
        int arr[] = { -4, 3, 4, 7, 10, 11, 12, 15, 19 };

        // Target value
        int k = 13;

        // Find floor of k
        int res = floorNum(arr, k);

        // Print result
        System.out.println("Floor of " + k + " = " + res);
    }
}