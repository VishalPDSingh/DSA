package ch10_NumberSystem.BitManipulation;

import java.util.Scanner;

public class Q1_EvenOdd {
    public static void checkEvenOdd(int n) {
        if ((n & 1) == 0) {
            System.out.println("Number is Even: " + n);
        } else {
            System.out.println("Number is Odd: " + n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        checkEvenOdd(n);
        sc.close();
    }
}
