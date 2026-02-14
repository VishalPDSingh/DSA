package ch1_Control_Statements;

import java.util.Scanner;

public class Q7_LargestOfThree {
    public static void largestOfThree(int n1, int n2, int n3)
    {
        if(n1 > n2  && n1>n3)
        {
            System.out.println("n1 is the largest number: "+n1);
        }
        else if(n2 > n3)
        {
            System.out.println("n2 is the largest number: "+n2);
        }
        else
        {
            System.out.println("n3 is the largest number: "+n3);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = sc.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = sc.nextInt();
        System.out.println("Enter the value of n3");
        int n3 = sc.nextInt();

        largestOfThree(n1, n2, n3);
        sc.close();
    }
}
