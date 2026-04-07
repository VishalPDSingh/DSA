package SimpleMathematics;

import java.util.Scanner;

public class Q14_DisplayDigit {
    static void dispNum(int n) {
        while (n > 0) {
            int r = n % 10;
            System.out.print(r);
            n /= 10;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dispNum(n);
        sc.close();
    }
}
