package ch13_SortingAlgorithm;

/*
 * Question:
 * Sort the given array in ascending order using Selection Sort.
 *
 * Example:
 * Input:
 * arr = {3, 1, 5, 4, 2}
 *
 * Output:
 * {1, 2, 3, 4, 5}
 *
 * --------------------------------------------------
 * Idea:
 * --------------------------------------------------
 * In every pass, find the minimum element from the
 * unsorted part of the array and place it at its
 * correct position.
 *
 * After each pass, one element gets fixed at the
 * beginning of the array.
 *
 * --------------------------------------------------
 * Dry Run:
 * --------------------------------------------------
 * arr = {3, 1, 5, 4, 2}
 *
 * Pass 1:
 * Minimum element = 1
 * Swap with arr[0]
 *
 * {1, 3, 5, 4, 2}
 *
 * Pass 2:
 * Minimum element = 2
 * Swap with arr[1]
 *
 * {1, 2, 5, 4, 3}
 *
 * Pass 3:
 * Minimum element = 3
 * Swap with arr[2]
 *
 * {1, 2, 3, 4, 5}
 *
 * Pass 4:
 * Minimum element = 4
 * Already at correct position
 *
 * {1, 2, 3, 4, 5}
 *
 * --------------------------------------------------
 * Algorithm:
 * --------------------------------------------------
 * 1. Start from the first index.
 * 2. Assume current element is the minimum.
 * 3. Search the remaining array for a smaller element.
 * 4. If a smaller element is found,
 *    update minIndex.
 * 5. Swap the minimum element with the current index.
 * 6. Repeat for all positions.
 *
 * --------------------------------------------------
 * Number of Passes:
 * --------------------------------------------------
 * For an array of size n,
 * Selection Sort requires n - 1 passes.
 *
 * After every pass, one element reaches its
 * correct position.
 *
 * --------------------------------------------------
 * Time Complexity:
 * --------------------------------------------------
 * Best Case    : O(n²)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Because for every element, we search the
 * remaining array to find the minimum element.
 *
 * --------------------------------------------------
 * Space Complexity:
 * --------------------------------------------------
 * O(1)
 *
 * Sorting is done in-place.
 */

public class Q2_SelectionSortDemo1 {

    static void selectionSort(int arr[]) {
        // Pass loop
        for (int i = 0; i < arr.length; i++) {
            // Assume current element is minimum
            int minEle = arr[i];

            // Store index of minimum element
            int minIndex = i;

            // Search for smaller element
            for (int j = i + 1; j < arr.length; j++) {
                if (minEle > arr[j]) {
                    minEle = arr[j];
                    minIndex = j;
                }
            }

            // Place minimum element at correct position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print sorted array
        for (int ans : arr) {
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 4, 2 };

        selectionSort(arr);
    }
}