package ch1_IntroductionOfProgramming;

import java.util.Scanner;

public class MixedSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c");
        int c = sc.nextInt();

        int sum1 = a+b;
        System.out.println("sum is: "+sum1);

        int sum2 = a+c;
        System.out.println("sum is :"+sum2);

        int sum3 = b+c;
        System.out.println("sum is :"+sum3);
        sc.close();
    }
}
