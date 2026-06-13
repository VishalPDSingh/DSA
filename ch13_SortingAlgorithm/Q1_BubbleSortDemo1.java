package ch13_SortingAlgorithm;

/*
 * Question:
 * Sort the given array in ascending order using Bubble Sort.
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
 * Bubble Sort repeatedly compares adjacent elements
 * and swaps them if they are in the wrong order.
 *
 * After every pass, the largest unsorted element
 * "bubbles up" to its correct position at the end
 * of the array.
 *
 * --------------------------------------------------
 * Dry Run:
 * --------------------------------------------------
 * arr = {3, 1, 5, 4, 2}
 *
 * Pass 1:
 * 3 > 1 -> Swap -> {1, 3, 5, 4, 2}
 * 3 < 5 -> No Swap
 * 5 > 4 -> Swap -> {1, 3, 4, 5, 2}
 * 5 > 2 -> Swap -> {1, 3, 4, 2, 5}
 *
 * Largest element (5) reaches its correct position.
 *
 * Pass 2:
 * 1 < 3 -> No Swap
 * 3 < 4 -> No Swap
 * 4 > 2 -> Swap -> {1, 3, 2, 4, 5}
 *
 * Pass 3:
 * 3 > 2 -> Swap -> {1, 2, 3, 4, 5}
 *
 * Array becomes sorted.
 *
 * --------------------------------------------------
 * Algorithm:
 * --------------------------------------------------
 * 1. Traverse the array n-1 times.
 * 2. Compare adjacent elements.
 * 3. If left element is greater than right element,
 *    swap them.
 * 4. After each pass, the largest unsorted element
 *    moves to its correct position.
 * 5. Repeat until the array is sorted.
 *
 * --------------------------------------------------
 * Time Complexity:
 * --------------------------------------------------
 * Best Case    : O(n)    (Optimized version)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * --------------------------------------------------
 * Space Complexity:
 * --------------------------------------------------
 * O(1)
 *
 * Sorting is done in-place.
 */

public class Q1_BubbleSortDemo1 {

    static void bubbleSort(int arr[]) {

        // Number of passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 5, 4, 2 };

        bubbleSort(arr);
    }
}