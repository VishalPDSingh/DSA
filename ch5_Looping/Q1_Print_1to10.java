package ch5_Looping;

import java.util.Scanner;

public class Q1_Print_1to10 {
    public static void printNumber(int n)
    {
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
        sc.close();
    }
}
