package SimpleMathematics;

import java.util.Scanner;

public class Q7_LargerNumber2 {
    static void largerNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is larger number: " + a);
        } else if (b > c) {
            System.out.println("b is larger number: " + b);
        } else {
            System.out.println("c is a larger number: " + c);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of a,b and c");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        largerNum(a, b, c);
        sc.close();
    }
}
