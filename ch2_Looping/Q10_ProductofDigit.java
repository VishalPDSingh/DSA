package ch2_Looping;

import java.util.Scanner;

public class Q10_ProductofDigit {
    public static int productOfDiigit(int n)
    {
        int mul = 1;
        while (n<0) {
            n%=10;
            mul = mul*10;
            n/=10;
        }
        return mul;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of digit: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int res = productOfDiigit(n);
        System.out.println(res);
        sc.close();
    }
}
