package ch2_Looping;

import java.util.Scanner;

public class Q12_ReverseNum {

    public static void reverseNum(int n)
    {
        while (n>0) {
            int r = n%10;
            System.out.print(r);
            n/=10;
        }
        
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverseNum(n);
        sc.close();
    }
}
