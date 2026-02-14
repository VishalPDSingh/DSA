package ch1_Control_Statements;

import java.util.Scanner;

public class Q6_LargerNumber {
    public static void largerNumber(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("n1 is larger number: " + n1);
        } else {
            System.out.println("n2 is larger number: " + n2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the value of 2nd number: ");
        int n2 = sc.nextInt();

        largerNumber(n1, n2);
        sc.close();
    }
}
