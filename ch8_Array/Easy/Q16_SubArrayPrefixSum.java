package ch8_Array.Easy;

public class Q16_SubArrayPrefixSum {

    static int[] prefixSumOptiaml(int arr[]) {
        int pf[] = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        return pf;
    }

    static void subArraySum(int arr[]) {
        int pf[] = prefixSumOptiaml(arr);
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    System.out.println(pf[j]);
                } else {
                    System.out.println(pf[j] - pf[i - 1]);
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArraySum(arr);
    }
}
