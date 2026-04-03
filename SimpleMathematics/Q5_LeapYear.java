package SimpleMathematics;

import java.util.Scanner;

public class Q5_LeapYear {
    static void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap Year: ");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }

    }

    static void leap2(int year) {
        if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {
            System.out.println("Leap Year ");
        } else {
            System.out.println("Not Lear Year");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        leapYear(n);
        leap2(n);
        sc.close();
    }
}
