package ch15_DivideAndConquer;

public class RevisionOfMerge1 {
    static int[] mergeSort(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int c[] = new int[n + m];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i < n) {
            while (i < n) {
                c[k] = a[i];
                k++;
                i++;
            }
        } else if (j < m) {
            while (j < m) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = { 7, 10, 11, 14 };
        int b[] = { 3, 8, 9 };

        int ans[] = mergeSort(a, b);
        for (int res : ans)
            System.out.println(res);
    }
}
