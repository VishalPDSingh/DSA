package ch8_Array.Easy;

public class Q15_ReverseArray {
    static void reverseArrayEle(int arr[]) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            // swap
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        reverseArrayEle(arr);
        for (int ans : arr)
            System.out.println(ans);
    }
}
