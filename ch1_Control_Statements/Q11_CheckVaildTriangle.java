package ch1_Control_Statements;

import java.util.Scanner;

public class Q11_CheckVaildTriangle {
    public static void checkTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid input");
        }

        else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("it is triangle ");
        } else {
            System.out.println("Not a triangle");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the three side length of triangle ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkTriangle(a, b, c);
        sc.close();
    }
}
