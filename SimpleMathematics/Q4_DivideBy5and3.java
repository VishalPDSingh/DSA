package SimpleMathematics;

import java.util.Scanner;

public class Q4_DivideBy5and3 {
    static void divide(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Number is divide by 3 and 5");
        } else {
            System.out.println("Not divided: ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divide(n);
        sc.close();

    }
}
