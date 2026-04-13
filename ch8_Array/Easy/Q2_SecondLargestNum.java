package ch8_Array.Easy;

public class Q2_SecondLargestNum {
    static int secondLargestNum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        if (secMax == Integer.MIN_VALUE)
            return -1;

        return secMax;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 10, 10 };
        int res = secondLargestNum(arr);
        System.out.println(res);
    }
}
