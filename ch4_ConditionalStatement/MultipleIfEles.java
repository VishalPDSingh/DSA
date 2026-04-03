package ch4_ConditionalStatement;

import java.util.Scanner;

public class MultipleIfEles {
    public static void main(String[] args) {

        System.out.println("Enter the number n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 100) {
            System.out.println("Right guess");
        } else if (n == 200) {
            System.out.println("Right guess");
        } else if (n == 400) {
            System.out.println("Right guess");
        } else {
            System.out.println("You lose");
        }
        sc.close();
    }
}
