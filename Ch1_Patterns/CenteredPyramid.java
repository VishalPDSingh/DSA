package Ch1_Patterns;

import java.util.Scanner;

public class CenteredPyramid {
    public static void centeredPyramid(int n) {
        int nsp = 3;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nsp = nsp-1;
            nst = nst+2;
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        centeredPyramid(n);
        sc.close();
    }
}
