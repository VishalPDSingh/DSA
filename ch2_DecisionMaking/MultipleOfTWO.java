package ch2_DecisionMaking;

import java.util.Scanner;

public class MultipleOfTWO {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        if(n%2 == 0)
        {
            System.out.println("Number is multiple of two");
        }
        else
        {
            System.out.println("Number is not multiple of two");
        }

        sc.close();
    }
}
