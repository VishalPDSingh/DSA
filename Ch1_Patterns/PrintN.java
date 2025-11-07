package Ch1_Patterns;

import java.util.Scanner;

public class PrintN {
    public static void star(int n)
    {
        for(int i =1; i<=n; i++)
        {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);
        sc.close();
    }
}
