package Simple_Mathematics;

import java.util.Scanner;

public class Q2_Multiplication {
    public static void multiplication(int n)
    {
        for(int i = 1; i<=10; i++)
        {
            int res = n*i;
            System.out.println(n+" * " +i+ " = " +res);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the digit for multilication: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        multiplication(n);
        sc.close();
    }
}
