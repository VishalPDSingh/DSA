package ch2_Looping;

import java.util.Scanner;

public class Q7_SumofEvenNumber {
    public static int sumOfEven(int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%2 == 0)
                sum = i+sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int res = sumOfEven(n);
        System.out.println("Even sum : "+res);
        sc.close();
    }
}
