package ch2_Looping;

import java.util.Scanner;

public class Q8SumOfOddNumber {
    public static int sumOfOdd(int n)
    {
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            if(i%3 == 0)
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int res = sumOfOdd(n);
        System.out.println(res);
        sc.close();
    }
}
