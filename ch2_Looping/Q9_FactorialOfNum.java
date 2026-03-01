package ch2_Looping;

import java.util.Scanner;

public class Q9_FactorialOfNum {
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = i*fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println("Factorial is : "+res);
        sc.close();
    }
}
