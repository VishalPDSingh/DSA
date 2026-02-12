package ch1_Control_Statements;

import java.util.Scanner;

public class Q1_CheckPositiveNegative_Zero {

    public static void positiveNegativZero(int n)
    {
        if(n>0)
        {
            System.out.println("Number is positive: "+n);
        }
        else if(n<0)
        {
            System.out.println("Number is negative: "+n);
        }
        else if(n==0)
        {
            System.out.println("Number is zero: "+n);
        }
        else
        {
            System.out.println("Enter the digit: ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        positiveNegativZero(n);
        sc.close();
    }
}
