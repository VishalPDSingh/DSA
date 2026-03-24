package Pattern;

import java.util.Scanner;

public class Q9_Pattern9 {
    public static void pattern9(int n) {
        int nst = n * 2 - 1;
        int nsp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println("");
            nsp = nsp + 1;
            nst = nst - 2;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pattern9(n);
        sc.close();
    }
}
