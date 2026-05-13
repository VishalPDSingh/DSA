package ch8_Array.Easy;

/*
 * Right Rotation of Array using Reversal Algorithm
 * 
 * Example:
 * arr = {1,2,3,4,5}
 * k = 3
 * 
 * Output:
 * {3,4,5,1,2}
 * 
 * ---------------------------------------------------
 * Steps:
 * 
 * 1. Reverse whole array
 * 
 * {1,2,3,4,5}
 * ->
 * {5,4,3,2,1}
 * 
 * 2. Reverse first k elements
 * 
 * {5,4,3}
 * ->
 * {3,4,5}
 * 
 * Array becomes:
 * {3,4,5,2,1}
 * 
 * 3. Reverse remaining elements
 * 
 * {2,1}
 * ->
 * {1,2}
 * 
 * Final Answer:
 * {3,4,5,1,2}
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q13_RotationArrayRight {

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
    // Right Rotation
    // -----------------------------------------
    static int[] rightRotation(int arr[], int k) {

        int n = arr.length;

        // Handle large k values
        k = k % n;

        // Step 1:
        // Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2:
        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3:
        // Reverse remaining elements
        reverse(arr, k, n - 1);

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        int k = 3;

        int ans[] = rightRotation(arr, k);

        // Print rotated array
        for (int res : ans)

            System.out.println(res);
    }
}