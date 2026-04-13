package ch8_Array.Easy;

public class Q3_TwoSum {
    static int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 }; // fallback (though problem guarantees solution)
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 11, 15 };
        int traget = 9;
        int res[] = twoSum(arr, traget);
        System.out.println(res);
    }
}
