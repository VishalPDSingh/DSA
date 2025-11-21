package Ch1_Patterns;

import java.util.Scanner;

public class PrintSquare_Star {
    public static void printFourStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        printFourStar(n);
        sc.close();
    }
}
