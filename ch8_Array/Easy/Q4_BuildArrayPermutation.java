package ch8_Array.Easy;

public class Q4_BuildArrayPermutation {
    static int[] buildArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 2, 1, 5, 3, 4 };
        int res[] = buildArray(arr);
        for (int ans : res)
            System.out.println(ans);

    }
}
