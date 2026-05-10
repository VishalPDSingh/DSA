package ch8_Array.Easy;

public class Q14_MaximumAndMinimumEle {

    static int[] maxAndmin(int arr[]) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return new int[] { maxValue, minValue };
    }

    public static void main(String[] args) {

        int arr[] = { 20, 56, 78, 95, 36, 47, 56, 20, 12 };

        int result[] = maxAndmin(arr);

        System.out.println("Max Value : " + result[0]);
        System.out.println("Min Value : " + result[1]);
    }
}