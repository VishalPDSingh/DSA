package Pattern;

import java.util.Scanner;

public class Q5_Pattern {

    public static void patternNum5(int n) {

        int nsp = 1;
        int nst = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            // spaces
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            // logic for next row
            if (i <= n / 2) {
                nst = nst - 1;
                nsp = nsp + 2;
            } else {
                nst = nst + 1;
                nsp = nsp - 2;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = sc.nextInt();
        patternNum5(n);

        sc.close();
    }
}