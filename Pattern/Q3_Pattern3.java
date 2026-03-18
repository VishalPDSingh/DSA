package Pattern;

import java.util.Scanner;

public class Q3_Pattern3 {
    public static void pattern3(int n)
    {
        int nst = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            nst = nst-1;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        pattern3(n);
        sc.close();
    }
}
