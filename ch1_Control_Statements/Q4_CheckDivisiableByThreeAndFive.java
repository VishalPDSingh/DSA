package ch1_Control_Statements;

import java.util.Scanner;

public class Q4_CheckDivisiableByThreeAndFive {

    public static void divisableByThreeandFive(int n)
    {
        if(n%3 == 0 && n%5==0)
        {
            System.out.println("Number is divisiable by three and five: "+n);
        }
        else
        {
            System.out.println("Number is not divisiable by three and five: "+n);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of digit: ");
        int n = sc.nextInt();
        divisableByThreeandFive(n);
        sc.close();
    }
}
