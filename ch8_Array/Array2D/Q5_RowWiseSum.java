package ch8_Array.Array2D;

import java.util.Scanner;

public class Q5_RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of col: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at the index: " + "(" + i + "," + j + ")");
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + a[i][j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
