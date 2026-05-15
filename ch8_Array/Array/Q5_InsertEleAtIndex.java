package ch8_Array.Array;

import java.util.Scanner;

public class Q5_InsertEleAtIndex {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements Before update...");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // replece index ele
        System.out.println("Enter the old Index: ");
        int oldIndex = sc.nextInt();
        if (oldIndex >= 0 && oldIndex < arr.length) {
            System.out.println("Enter the new element ");
            int newEle = sc.nextInt();
            arr[oldIndex] = newEle;
        } else {
            System.out.println("Index Out of Bound Error");
        }

        System.out.println("Array Elements after update...");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        sc.close();
    }
}
