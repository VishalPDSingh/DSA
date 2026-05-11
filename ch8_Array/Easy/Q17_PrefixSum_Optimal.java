package ch8_Array.Easy;

public class Q17_PrefixSum_Optimal {
    static int[] prefixSum(int arr[]) {
        int pf[] = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        return pf;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 6, -5, 7 };
        int ans[] = prefixSum(arr);
        for (int res : ans)
            System.out.println(res);
    }
}
