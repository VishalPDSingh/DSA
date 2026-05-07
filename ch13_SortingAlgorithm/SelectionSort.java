package ch13_SortingAlgorithm;

public class SelectionSort {

    static void slectionSort(int arr[]) {
        int n = arr.length;
        // step1 : Iteration on the arr[] and take min ele, min index
        for (int i = 0; i < n - 1; i++) {
            int minEle = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (minEle > arr[j]) {
                    minEle = arr[j];
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 8, 4, -1, 7, 10, 5, 6 };
        slectionSort(arr);
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }
}
