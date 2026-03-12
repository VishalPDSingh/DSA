package Pattern;

import java.util.Scanner;

public class Q2_FourStar {
    public static void main(String[] args) {
        
        System.out.println("Enter the value of number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.print("*");
        }
        sc.close();
    }
}
