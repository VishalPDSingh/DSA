package SimpleMathematics;

import java.util.Scanner;

public class Q11_MultiplicationTable {
    static void table(int n)
    {
        for(int i=1; i<=10; i++)
        {
            int mul = n*i;
            System.out.println(n+" x "+i+" =  "+mul);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the number for counting table:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        table(n);

    }
}
