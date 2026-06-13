package ch17_Searching.Easy;

/*
 * Question:
 * Given an array and a target value k,
 * find the Floor of k using Linear Search.
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
 * Traverse the entire array and keep track of the
 * largest element that is less than or equal to k.
 *
 * Whenever an element satisfies:
 *      arr[i] <= k
 * it becomes a candidate for the floor.
 *
 * If that candidate is larger than the current answer,
 * update the answer.
 *
 * After scanning the complete array, the stored answer
 * will be the floor of k.
 *
 * --------------------------------------------------
 * Step-by-Step Algorithm:
 * --------------------------------------------------
 * 1. Initialize ans with Integer.MIN_VALUE.
 * 2. Traverse each element of the array.
 * 3. If arr[i] <= k and arr[i] > ans:
 *      - Update ans = arr[i].
 * 4. Continue until the end of the array.
 * 5. Return ans.
 *
 * --------------------------------------------------
 * Time Complexity:
 * --------------------------------------------------
 * O(n)
 * Every element is visited once.
 *
 * --------------------------------------------------
 * Space Complexity:
 * --------------------------------------------------
 * O(1)
 * Only one extra variable (ans) is used.
 */

public class Q1_FloorNumLinearSearch {

    static int floorNum(int arr[], int k) {

        // Stores the best floor found so far
        int ans = Integer.MIN_VALUE;

        // Traverse the entire array
        for (int i = 0; i < arr.length; i++) {

            // Check if current element can be a floor
            if (arr[i] <= k && arr[i] > ans) {

                // Update floor value
                ans = arr[i];
            }
        }

        // Return final floor value
        return ans;
    }

    public static void main(String[] args) {

        // Input array
        int arr[] = { -4, 3, 4, 7, 10, 11, 12, 15, 19 };

        // Target value
        int k = 0;

        // Find floor of k
        int res = floorNum(arr, k);

        // Print result
        System.out.println("Floor of " + k + " = " + res);
    }
}