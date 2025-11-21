package Ch1_Patterns;

import java.util.Scanner;

public class Right_Aligend_Triangle {
    public static void rightAligendTriangle(int n) {
        int nst = 1;
        int nsp = n - 1;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=nsp; j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1; k<=nst; k++)
            {
                System.out.print("*");
            }

            nst = nst+1;
            nsp = nsp-1;
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        rightAligendTriangle(n);
        sc.close();
    }
}
