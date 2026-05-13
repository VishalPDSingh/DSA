package ch8_Array.Easy;

public class Q15_SubArraySum {
    static void subArraySum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];

                }
                System.out.println(sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArraySum(arr);
    }
}
