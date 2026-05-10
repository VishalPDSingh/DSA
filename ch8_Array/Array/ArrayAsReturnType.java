package ch8_Array.Array;

public class ArrayAsReturnType {
    static int[] addValue(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] + 5;
        }
        return temp;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 10 };
        int ans[] = addValue(arr);
        for (int res : ans)
            System.out.println(res);
    }
}
