package Simple_Mathematics;

import java.util.Scanner;

public class Q1_NumberofDigit {
    public static int numberOfDigit(int n )
    {
        int count = 0;
        while (n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the value of digit n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = numberOfDigit(n);
        System.out.println(6/10);
        System.out.println(res);
        sc.close();

    }
}
