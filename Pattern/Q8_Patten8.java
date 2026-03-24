package Pattern;

import java.util.Scanner;

public class Q8_Patten8 {
    public static void pattern8(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println("");
            // for next line
            nsp = nsp - 1;
            nst = nst + 2;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pattern8(n);
        sc.close();
    }
}
