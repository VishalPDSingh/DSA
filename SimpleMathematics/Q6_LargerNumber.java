package SimpleMathematics;

import java.util.Scanner;

public class Q6_LargerNumber {
    static void largerNum(int a, int b) {
        if (a > b) {
            System.out.println("a is larger number: " + a);
        } else {
            System.out.println("b is larger number: " + b);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        largerNum(a, b);
        sc.close();
    }
}
