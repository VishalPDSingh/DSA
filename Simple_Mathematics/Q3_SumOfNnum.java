package Simple_Mathematics;

import java.util.Scanner;

public class Q3_SumOfNnum {
     static int sumOfN(int n)
    {
        int sum = 0;
        // using loop
        for(int i=1; i<=n; i++)
        {
            sum = sum+i;
        }
        return sum;
    }

    // using formula
    static int sumOfN1(int n)
    {
        int sum = (n*(n+1))/2;
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = sumOfN(n);
        System.out.println(res);
        int res1 = sumOfN1(n);
        System.out.println(res1);
        sc.close();
    }
}
