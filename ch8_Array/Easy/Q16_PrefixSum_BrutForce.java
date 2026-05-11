package ch8_Array.Easy;

public class Q16_PrefixSum_BrutForce {
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

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 70, 65 };
        int ans[] = prefixSum(arr);
        for (int res : ans)
            System.out.println(res);
    }
}
