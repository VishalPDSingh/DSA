package Pattern;

import java.util.Scanner;

public class Q5_Pattern5 {
    public static void pattern5(int n)
    {
        // My Method to solve pattern:-
        // Step1: Look the pattern
        // Ask yourself:
        // Is it increasing? → YES
        // Is it decreasing? → YES
        // Increasing + Decreasing = Peak Pattern
        // count the number of star in 1st row
        int nst = 1;
        int mid = (n+1)/2;
        // Step2: How many row need to print this is called the n value
        for(int i=1; i<=n; i++)
        {
            // Step3: print the number of star in 1st row
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*");
            }
            // step4: change the line
            System.out.println("");
            // step5: see what to do next row 
            
            if(i< mid)
            {
                nst = nst+1;
            }
            else
            {
                nst = nst-1;
            }
        }
        
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        pattern5(n);
        sc.close();
    }
}
