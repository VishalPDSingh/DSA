package SimpleMathematics;

import java.util.Scanner;

public class Q3_DivisibleBy5 {
    static void divideBy5(int n)
    {
        if(n%5==0)
        {
            System.out.println("Number is divide by 5: "+n);
        }
        else
        {
            System.out.println("Not Divide by 5: "+n);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divideBy5(n);
        sc.close();
    }
}
