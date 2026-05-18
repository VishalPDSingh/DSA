package ch8_Array.Array2D;

import java.util.Scanner;

public class Q9_SwapingTwoRows {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        // Input Matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element at index (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Print Before Swapping
        System.out.println("\nBefore Swapping Rows:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Input rows to swap
        System.out.println("\nEnter the two row numbers to swap:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Swapping Rows
        for (int i = 0; i < col; i++) {
            int temp = arr[m - 1][i];
            arr[m - 1][i] = arr[n - 1][i];
            arr[n - 1][i] = temp;
        }

        // Print After Swapping
        System.out.println("\nAfter Swapping Rows:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}