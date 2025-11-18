package Ch2_Array;

import java.util.Scanner;

public class Sum_Of_Array {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
}
