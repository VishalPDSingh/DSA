package ch8_Array.Easy;

public class Q5_ConcatenationOfArray {
    static int[] concatenation(int arr[]) {
        int n = arr.length;
        int ans[] = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1 };
        int res[] = concatenation(arr);
        for (int ans : res)
            System.out.println(ans);
    }
}
