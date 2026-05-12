package ch8_Array.Easy;

public class Q7_PrefixSum {
    static int[] prefixSum(int arr[]) {
        int pf[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + arr[j];
            }
            pf[i] = sum;
        }
        return pf;
    }

    static int[] prefixSumOptiaml(int arr[]) {
        int pf[] = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        return pf;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 70, 65 };
        System.out.println("Ths is brut force");
        int ans[] = prefixSum(arr);
        for (int res : ans)
            System.out.println(res);
        System.out.println("Optimal");
        int ans1[] = prefixSumOptiaml(arr);
        for (int res1 : ans1)
            System.out.println(res1);

    }
}
