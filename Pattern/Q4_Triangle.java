package Pattern;

import java.util.Scanner;

public class Q4_Triangle {
    public static void triangleStar(int n) {
        int nst = 1; // number of star in 1st row
        for (int i = 1; i <= n; i++) // number of rows
        {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            // prep for next rowF
            nst = nst + 1; // nst++
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        triangleStar(n);
        sc.close();
    }
}
