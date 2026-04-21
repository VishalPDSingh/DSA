package ch8_Array.Easy;

public class Q6_RunnningSum {
    static int[] runningSum(int arr[]) {
        int nums[] = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int ans[] = runningSum(arr);

        for (int num : ans)
            System.out.println(num);
    }
}