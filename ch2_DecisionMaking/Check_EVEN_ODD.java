package ch2_DecisionMaking;

import java.util.Scanner;

public class Check_EVEN_ODD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();

        if(n%2 ==0)
        {
            System.out.println("N is even");
        }
        else
        {
            System.out.println("N is odd");
        }

        sc.close();
    }
}
