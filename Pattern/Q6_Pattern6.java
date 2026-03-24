package Pattern;

import java.util.Scanner;

public class Q6_Pattern6 {
    public static void patter6(int n)
    {
        int nsp = n-1;
        int nst = 1;

        for(int i=1; i<=n; i++)
        {
           // space
           for(int j=1; j<=nsp; j++)
           {
            System.out.print(" ");
           }
           for(int k=1; k<=nst; k++)
           {
            System.out.print("*");
           }
           System.out.println();
           nsp = nsp-1;
           nst = nst+1;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        patter6(n);
        sc.close();
    }
}
