package ch2_Looping;

import java.util.Scanner;

public class Q13_Palindrom {
    public static void palindronNum(int n)
    {
        int m = n;
        int r = 0;
        while (n>0) {
            r = n%10;
            n/=10;
        }
        if(r == m)
        {
            System.out.println("Number is palindrom: ");
        }
        else{
            System.out.println("Number is not palindrom: ");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        palindronNum(n);
        sc.close();
    }
}
