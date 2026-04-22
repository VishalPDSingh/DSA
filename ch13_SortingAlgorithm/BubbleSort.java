package ch13_SortingAlgorithm;

public class BubbleSort {
    static void bubbleSort(int arr[], int n) {
        for (int pass = 0; pass <= n - 1; pass++) {
            System.out.println(arr[pass]);
            for (int j = 1; j <= n - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int ans : arr)
            System.out.println(ans);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 5, 4, 2 };
        int n = arr.length;
        bubbleSort(arr, n);
    }
}
