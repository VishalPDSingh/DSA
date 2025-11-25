package Ch1_Patterns;

import java.util.Scanner;

public class NumberInceasingSqe {
    public static void numberInceasingSqe(int n)
    {
        int num = 1;
       for(int i=1; i<=n; i++)
       {
         for(int j=1; j<=num; j++)
        {
            System.out.print(j);
        }
        num = num+1;
        System.out.println();
       }
    }
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        numberInceasingSqe(n);
        sc.close();
    }
}
