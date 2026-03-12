package Pattern;

import java.util.Scanner;

public class Q3_Squrare {
    public static void squareStar(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        squareStar(n);
        sc.close();
    }
}
