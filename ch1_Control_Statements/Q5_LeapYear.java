package ch1_Control_Statements;

import java.util.Scanner;

public class Q5_LeapYear {

    public static void leapYears(int n)
    {
        if((n%4 == 0 && n%100 != 0 ) || (n%400 ==0))
        {
            System.out.println("Leap Years: "+n);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Year");
        int year = sc.nextInt();
        leapYears(year);
        sc.close();
    }
}
