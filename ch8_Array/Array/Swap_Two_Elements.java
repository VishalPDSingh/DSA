package ch8_Array.Array;

public class Swap_Two_Elements {
    static void swap(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("arr[0] = " + arr[0] + " arr[1] = " + arr[1]);
    }

    public static void main(String[] args) {

        int arr[] = { 20, 10 };
        System.out.println("arr[0] = " + arr[0] + " arr[1] = " + arr[1]);
        swap(arr);
    }
}
