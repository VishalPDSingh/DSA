package Simple_Mathematics;

import java.util.Scanner;

public class Q7_ArmstrongNumber {
    public static void armstrong(int n)
    {
        int m = n;
        int sum = 0;
        while (n>0) {
            int r = n%10;
            sum = sum+r*r*r;
            n/=10;
        }
        if(sum == m)
        {
            System.out.println("Number is  Armstrong: ");
        }else
        {
            System.out.println("Not a armstrong number: ");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        armstrong(n);
        sc.close();
        
    }
}
