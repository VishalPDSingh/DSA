package ch15_DivideAndConquer;

/*
Given arr[n] elements and 3 indices s,m and e and subarray [s,m] sorted,
subarray [m+1,e] is also sorted. sort subarray [s,e]. [s,e] in continous

 */
public class RevisionMerge2 {
    static int[] mergeSort(int arr[]) {
        int start = 2;
        int mid = 6;
        int end = 9;
        int temp[] = new int[end - start + 1];
        int k = 0;
        int p1 = start;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= end) {
            if (arr[p1] < arr[p2]) {
                temp[k] = arr[p1];
                k++;
                p1++;
            } else {
                temp[k] = arr[p2];
                k++;
                p2++;
            }
        }
        if (p1 <= mid) {
            while (p1 <= mid) {
                temp[k] = arr[p1];
                k++;
                p1++;
            }
        }

        if (p2 <= end) {
            while (p2 <= end) {
                temp[k] = arr[p2];
                k++;
                p2++;
            }
        }

        // copy temp[0-7] back to a[s-e]
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, -1, 2, 6, 9, 11, 3, 4, 7, 13, 0 };
        int ans[] = mergeSort(arr);
        for (int res : ans)
            System.out.println(res);
    }
}
