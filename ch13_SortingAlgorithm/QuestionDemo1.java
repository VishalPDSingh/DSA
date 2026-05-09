package ch13_SortingAlgorithm;

public class QuestionDemo1 {

    static void quickSrotApp(int arr[]) {

        int p1 = 1;
        int p2 = arr.length - 1;

        while (p1 <= p2) {

            if (arr[p1] <= arr[0]) {
                p1++;
            }
            else if (arr[p2] > arr[0]) {
                p2--;
            }
            else {
                // swap(p1,p2)
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;

                // move pointers after swap
                p1++;
                p2--;
            }
        }

        // swap pivot with p2
        int temp = arr[p2];
        arr[p2] = arr[0];
        arr[0] = temp;

        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 3, 8, 15, 6, 12, 2, 18, 7, 15, 14};

        quickSrotApp(arr);
    }
}