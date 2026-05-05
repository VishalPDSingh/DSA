package ch8_Array.Array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length of array: ");
        int n = sc.nextInt();

        // array creatrion
        int arr[] = new int[n];
        // taking input in the array
        for (int index = 0; index < n; index++) {
            System.out.println("Enter the value of index " + index);
            arr[index] = sc.nextInt();
        }

        // printing the value of array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
