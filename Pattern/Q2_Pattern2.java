package Pattern;

import java.util.Scanner;

public class Q2_Pattern2 {
    public static void pattern2(int n)
    {
       int nst = 1; // Number of Star in 1st row
       for(int i=1; i<=n; i++) // Number of rows
       {
        for(int j=1; j<=nst; j++) // Star printing
        {
            System.out.print("*");
        }
        System.out.println(); // Next Line
        // prep for next row
        nst = nst+1;
       }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pattern2(n);
        sc.close();
    }
}
