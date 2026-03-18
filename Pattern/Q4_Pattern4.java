package Pattern;

import java.util.Scanner;

public class Q4_Pattern4 {
    public static void pattern4(int n)
    {
        int value = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=value; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
            value=value+1;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        pattern4(n);
        sc.close();
    }
}
