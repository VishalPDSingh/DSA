package ch2_Looping;

import java.util.Scanner;

public class Q5_Table {
    public static void main(String[] args) {
        System.out.println("Entet the digit for table: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            int table = i*n;
            System.out.println(i+" * "+n+" = "+table);
        }
        sc.close();
    }
}
