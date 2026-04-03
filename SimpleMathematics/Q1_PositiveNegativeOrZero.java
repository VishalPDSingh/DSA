package SimpleMathematics;

import java.util.Scanner;

public class Q1_PositiveNegativeOrZero {
    static void posNegZero(int n)
    {
        if(n==0)
        {
            System.out.println("Number is Zero");
        }
        else if(n>0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        posNegZero(n);
        sc.close();
    }
}
