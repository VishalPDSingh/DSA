package ch1_Control_Statements;

import java.util.Scanner;

public class Q13_Student {
    public static void main(String[] args) {
        
        System.out.println("Enter the value of marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks>90)
        {
            System.out.println("Excellent: ");
        }
        else if(marks>80 && marks<=90)
        {
            System.out.println("Good");
        }
        else if (marks>70 && marks<=80) 
        {
            System.out.println("fiar");    
        }
        else if(marks>60 && marks<=70)
        {
            System.out.println("Fine");
        }
        else
        {
            System.out.println("Need improve");
        }
        sc.close();
    }
}
