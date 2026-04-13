package ch8_Array.Easy;

public class Q1_MissingInArray {
    static int missingNumber(int arr[], int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            actualSum = arr[i] + actualSum;
        }
        int missingNum = expectedSum - actualSum;
        return missingNum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = 5;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}
