package ch2_Looping;

import java.util.Scanner;

public class Q6_Sum_of_N_natural_Number {

    public static int sumOfNatural(int n)
    {
        int sum = 0;
        for(int i = 1; i<=n; i++)
        {
            sum = sum+i;
        }
        return sum;
    }
    // Using mathematics formula:-
    public static int sumOfNatural1(int x)
    {
        int sum = x*(x+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rs =  sumOfNatural(n);
        System.out.println(rs);
        sc.close();
    }
}
