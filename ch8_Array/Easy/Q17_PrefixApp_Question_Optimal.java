package ch8_Array.Easy;

public class Q17_PrefixApp_Question_Optimal {
    static void prefixSum(int arr[], int queries[][]) {

        int pf[] = prefixSumOptimal(arr);
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            if (l > 0) {
                System.out.println(pf[r] - pf[l - 1]);
            } else {
                System.out.println(pf[r]);
            }

        }
    }

    static int[] prefixSumOptimal(int arr[]) {
        int pf[] = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        return pf;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 4, 1, 7, -8, 2, 0 };
        int queries[][] = {
                { 3, 8 },
                { 2, 4 },
                { 0, 3 },
                { 5, 9 },
                { 6, 6 }
        };
        prefixSum(arr, queries);
    }
}
