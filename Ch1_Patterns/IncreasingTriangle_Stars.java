package Ch1_Patterns;

import java.util.Scanner;

public class IncreasingTriangle_Stars {
    public static void increasingStar(int n) {
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nst = nst + 1;
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        increasingStar(n);
        sc.close();

    }
}
