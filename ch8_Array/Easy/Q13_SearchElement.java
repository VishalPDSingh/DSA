package ch8_Array.Easy;

public class Q13_SearchElement {
    static int searchEle(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 20, 56, 78, 95, 36, 47, 56, 20, 12 };
        int n = 25;
        int ans = searchEle(arr, n);
        System.out.println(ans);
    }
}
