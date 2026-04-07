package SimpleMathematics;

import java.util.Scanner;

public class Q16_Palindrome {
    static void isPalindrome(int n) {
        int m = n;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if (rev == m) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
}
