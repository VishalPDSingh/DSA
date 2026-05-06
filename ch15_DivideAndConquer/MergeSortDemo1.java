package ch15_DivideAndConquer;

public class MergeSortDemo1 {

    // Main Merge Sort Function
    static void mergeSort(int arr[], int low, int high) {

        // Base condition: if only one element, already sorted
        if (low < high) {

            // Find middle index
            int mid = (low + high) / 2;

            // Divide: sort left half
            mergeSort(arr, low, mid);

            // Divide: sort right half
            mergeSort(arr, mid + 1, high);

            // Conquer: merge both sorted halves
            merge(arr, low, mid, high);
        }
    }

    static void merge(int arr[], int low, int mid, int high) {

        // Temporary array to store sorted elements
        int temp[] = new int[high - low + 1];

        int i = low; // Pointer for left subarray
        int j = mid + 1; // Pointer for right subarray
        int k = 0; // Pointer for temp array

        // Step 1: Compare elements from both halves
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Step 2: Copy remaining elements from left half (if any)
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Step 3: Copy remaining elements from right half (if any)
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Step 4: Copy sorted elements back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 11, 20, 30, 21, 31, 40, 41 };
        mergeSort(arr, 0, arr.length - 1);

        for (int ans : arr)
            System.out.println(ans);
    }
}
