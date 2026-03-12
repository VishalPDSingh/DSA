package ch2_Looping;

import java.util.Scanner;

public class Q11_CountDigit {
    public static int countDigit(int n)
    {
        int count = 0;
        if(n==0)
            return 1;
        while (n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int res = countDigit(n);
        System.out.println(res);
        sc.close();

    }
}
