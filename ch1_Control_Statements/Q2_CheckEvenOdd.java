package ch1_Control_Statements;

import java.util.Scanner;

public class Q2_CheckEvenOdd {

    public static void evenOdd(int n)
    {
        if(n%2 == 0)
        {
            System.out.println("Number is Even: "+n);
        }
        else{
            System.out.println("Number is odd: "+n);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();

        evenOdd(n);
        sc.close();
    }
}
