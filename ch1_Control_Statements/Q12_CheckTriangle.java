package ch1_Control_Statements;

import java.util.Scanner;

public class Q12_CheckTriangle {
    public static void checkTypesTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invaild Inputs: ");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Vaild  Triangle");
            if (a == b && b == c && c == a)
                System.out.println("Equilateral Triangle");
            else if (a == b || a == c || b == c)
                System.out.println(" Isosceles Triangle ");
            else
                System.out.println("Scalene Triangle");
        } else {
            System.out.println("Not Triangle");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the side of triangle: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkTypesTriangle(a, b, c);
        sc.close();
    }
}
