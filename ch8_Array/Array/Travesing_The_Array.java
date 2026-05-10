package ch8_Array.Array;

public class Travesing_The_Array {
    public static void main(String[] args) {

        int arr[];
        int n = 5;
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 5;
        }
        System.out.println(arr); // when Ever we try to print the ref, toString method automatically called
        // print this hash code

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
