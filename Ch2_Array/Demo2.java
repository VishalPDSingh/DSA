package Ch2_Array;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        // syntax
        // type[] name = new type[size];
        int arr[] = new int[10];
        System.out.println(arr[2]);

        // user input 
        Scanner sc=new Scanner(System.in);
        // Enter the number of elements
        int n = sc.nextInt();
        // create array
        int arr1[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        for(int x:arr1)
        System.out.println(x);
        sc.close();
    }
}
