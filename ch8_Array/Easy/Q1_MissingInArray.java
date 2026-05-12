package ch8_Array.Easy;

public class Q1_MissingInArray {
    static int missingEle(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int perentSum = 0;
        for (int i = 0; i < n - 1; i++) {
            perentSum = perentSum + arr[i];
        }
        int ans = expectedSum - perentSum;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 4, 5 };
        int res = missingEle(arr, n);
        System.out.println(res);
    }
}
