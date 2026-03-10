package Simple_Mathematics;

import java.util.Scanner;

public class Q5_DispalyDigit {
    public static void displayDigit(int n)
    {
        while (n>0) {
            int res = n%10;
            n/=10;
            System.out.println(res);
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        displayDigit(n);
        sc.close();
    }
}
