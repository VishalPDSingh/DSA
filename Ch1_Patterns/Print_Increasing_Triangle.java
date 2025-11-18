package Ch1_Patterns;

import java.util.Scanner;

public class Print_Increasing_Triangle {
    public static void star(int n)
    {
        int numStar = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=numStar; j++)
            {
                System.out.print("*");
            }
            numStar++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);
        sc.close();
    }
}
