package ch14_Hashing;

import java.util.Scanner;

public class HashingDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array using while loop
        int i = 0;
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }

        // Pre-compute frequency array
        int hash[] = new int[13];

        i = 0;
        while (i < n) {
            hash[arr[i]]++;
            i++;
        }

        int q = sc.nextInt();

        // Answer queries
        while (q > 0) {

            int number = sc.nextInt();

            System.out.println(hash[number]);

            q--;
        }

        sc.close();
    }
}
