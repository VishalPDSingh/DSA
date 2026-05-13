
package ch8_Array.Easy;

/*
 * Left Rotate Array using Reversal Algorithm
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q12_RotateArrayLeft {

    // -----------------------------------------
    // Reverse Array from p1 to p2
    // -----------------------------------------
    static void reverse(int arr[], int p1, int p2) {

        while (p1 < p2) {

            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }

    // -----------------------------------------
    // Left Rotation
    // -----------------------------------------
    static int[] leftRotation(int arr[], int k) {

        int n = arr.length;

        // Handle large k
        k = k % n;

        // Step 1:
        // Reverse whole array
        reverse(arr, 0, n - 1);
        // Step 2:
        // reverse first n-k elements
        reverse(arr, 0, n - k - 1);

        // Step 3:
        // reverse last k elements
        reverse(arr, n - k, n - 1);

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        int k = 3;

        int ans[] = leftRotation(arr, k);

        for (int res : ans)

            System.out.println(res);
    }
}