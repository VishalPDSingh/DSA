package SimpleMathematics;

import java.util.Scanner;

public class Q15_Armstrong {

    static void isAramStrong(int n) {
        int m = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = r * r * r + sum;
            n /= 10;
        }
        if (sum == m) {
            System.out.println("Number is AramStrong");
        } else {
            System.out.println("Number is not AramStrong");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isAramStrong(n);
        sc.close();
    }
}
