package ch1_Control_Statements;

import java.util.Scanner;

public class Q3_CheckDivsiblityOfFive {

    public static void divisibility(int n)
    {
        if(n%5 == 0)
        {
            System.out.println("Number is divisibility of five: "+n);
        }
        else
        {
            System.out.println("Number is not divisiable of five : "+n);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        divisibility(n);
        sc.close();
    }
}
