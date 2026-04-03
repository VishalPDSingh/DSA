package ch3_Opreators;

import java.util.Scanner;

public class ArithmeticOperator {

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = addition(a, b);
        System.out.println(add);

        int sub = subtraction(a, b);
        System.out.println(sub);

        int mul = multiplication(a, b);
        System.out.println(mul);

        int div = division(a, b);
        System.out.println(div);

        int mod = modulus(a, b);
        System.out.println(mod);


        System.out.println("-----------------------------------");
        int n1 = 10;
        int n2 = 20;
        int res = n1+n2;
        System.out.println(res);


        // modulo operator %
        
        sc.close();
    }
}
