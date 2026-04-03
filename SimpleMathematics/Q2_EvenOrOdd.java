package SimpleMathematics;

import java.util.Scanner;

public class Q2_EvenOrOdd {
    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Number is even: " + n);
        } else {
            System.out.println("Number is odd: " + n);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
        sc.close();
    }
}
