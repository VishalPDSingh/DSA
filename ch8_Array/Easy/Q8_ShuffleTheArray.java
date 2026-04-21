package ch8_Array.Easy;

public class Q8_ShuffleTheArray {
    static int[] shuffleArray(int nums[], int n) {
        int arr[] = new int[n * 2];

        for (int i = 0; i < n; i++) {
            arr[i * 2] = nums[i];
            arr[i * 2 + 1] = nums[i + n];
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        int ans[] = shuffleArray(arr, n);
        for (int num : ans)
            System.out.println(num);
    }
}
