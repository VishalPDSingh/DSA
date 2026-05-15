package ch8_Array.Array;

import java.util.Scanner;

public class Q4_UpdateLastOcc {
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

        // old to new
        System.out.println("Enter the old Element: ");
        int oldEle = sc.nextInt();
        System.out.println("Enter the new Element: ");
        int newEle = sc.nextInt();
        // int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == oldEle) {
                arr[i] = newEle;
                break;
            }
        }
        System.out.println("Array Elements after update...");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        sc.close();
    }
}
