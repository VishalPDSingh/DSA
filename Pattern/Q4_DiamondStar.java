package Pattern;

import java.util.Scanner;

public class Q4_DiamondStar {

    public static void dimanodStar(int n) {

        int nsp = n / 2; // number of space
        int nst = 1; // number of star

        for (int i = 1; i <= n; i++) // Number of rows
        {
            for (int j = 1; j <= nsp; j++)// for space
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) // for star
            {
                System.out.print("*");
            }
            // for next line

            if (i <= n / 2) {
                nst += 2;
                nsp -= 1;
            } else {
                nst -= 2;
                nsp += 1;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dimanodStar(n);
        sc.close();
    }
}
