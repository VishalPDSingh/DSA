package ch13_SortingAlgorithm;

/*
 * Question:
 * Given an array of size n where the first n-1 elements
 * are already sorted in ascending order, sort the entire array.
 *
 * Example:
 * Input:
 * arr = {2, 6, 10, 14, 20, 4}
 *
 * Output:
 * arr = {2, 4, 6, 10, 14, 20}
 *
 * --------------------------------------------------
 * Observation:
 * --------------------------------------------------
 * The first n-1 elements are already sorted.
 *
 * Only the last element may be at the wrong position.
 *
 * Therefore, instead of sorting the entire array,
 * we can insert the last element into its correct
 * position in the sorted part.
 *
 * --------------------------------------------------
 * Idea:
 * --------------------------------------------------
 * Start from the second-last element and move
 * backwards.
 *
 * If arr[i] > arr[i+1]:
 *      Swap them.
 *
 * Continue until:
 *      arr[i] <= arr[i+1]
 *
 * At this point, the last element has reached
 * its correct position.
 *
 * --------------------------------------------------
 * Dry Run:
 * --------------------------------------------------
 * arr = {2, 6, 10, 14, 20, 4}
 *
 * Compare 20 and 4
 * Swap
 *
 * {2, 6, 10, 14, 4, 20}
 *
 * Compare 14 and 4
 * Swap
 *
 * {2, 6, 10, 4, 14, 20}
 *
 * Compare 10 and 4
 * Swap
 *
 * {2, 6, 4, 10, 14, 20}
 *
 * Compare 6 and 4
 * Swap
 *
 * {2, 4, 6, 10, 14, 20}
 *
 * Compare 2 and 4
 * No swap needed.
 *
 * Stop.
 *
 * --------------------------------------------------
 * Algorithm:
 * --------------------------------------------------
 * 1. Start from index n-2.
 * 2. Compare arr[i] with arr[i+1].
 * 3. If arr[i] > arr[i+1], swap them.
 * 4. Move one position left.
 * 5. Repeat until the correct position is found.
 * 6. Print the array.
 *
 * --------------------------------------------------
 * Time Complexity:
 * --------------------------------------------------
 * Best Case:
 * O(1)
 *
 * When the last element is already greater than
 * or equal to the previous element.
 *
 * Example:
 * {2, 6, 10, 14, 20, 25}
 *
 * Worst Case:
 * O(n)
 *
 * When the last element is the smallest element.
 *
 * Example:
 * {2, 6, 10, 14, 20, 1}
 *
 * --------------------------------------------------
 * Space Complexity:
 * --------------------------------------------------
 * O(1)
 *
 * No extra array is used.
 */

public class Q4_FisrtSortedEle {

    static void insertEle(int arr[])
    {
        int n = arr.length;

        // Move the last element to its correct position
        for(int i = n - 2; i >= 0; i--)
        {
            // Swap if elements are in wrong order
            if(arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            else
            {
                // Correct position found
                break;
            }
        }

        // Print sorted array
        for(int res : arr)
        {
            System.out.println(res);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 6, 10, 14, 20, 4};

        insertEle(arr);
    }
}