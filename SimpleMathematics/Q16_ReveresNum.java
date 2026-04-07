package SimpleMathematics;

import java.util.Scanner;

public class Q16_ReveresNum {
    static void reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        reverse(n);
        sc.close();

    }
}
