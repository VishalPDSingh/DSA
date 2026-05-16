package ch8_Array.Array2D;

import java.util.Scanner;

public class Q4_SumOfAllEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Ente the size the of col: ");
        int col = sc.nextInt();
        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at the index: " + "(" + i + "," + j + ")");
                a[i][j] = sc.nextInt();
            }
        }

        // sum of the elements
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + a[i][j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
