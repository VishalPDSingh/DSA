package SimpleMathematics;

import java.util.Scanner;

public class Q13_FactorialNum {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
        sc.close();
    }
}
