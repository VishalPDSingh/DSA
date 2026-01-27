package ch1_IntroductionOfProgramming;

import java.util.Scanner;

public class CurrencyConveter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value in doller");
        int d = sc.nextInt();

        float ruppes = d*84.31f;

        System.out.println("Money is : "+ruppes);
        sc.close();
    }
}
