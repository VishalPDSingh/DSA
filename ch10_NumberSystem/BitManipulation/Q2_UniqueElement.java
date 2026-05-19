package ch10_NumberSystem.BitManipulation;

/*
 * Find Unique Element using XOR
 * 
 * Problem:
 * 
 * Every element appears twice
 * except one element.
 * 
 * Find that unique element.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {6,8,7,6,7,8,10}
 * 
 * Output:
 * 10
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Use XOR (^) operator.
 * 
 * ---------------------------------------------------
 * Important XOR Properties:
 * 
 * 1.
 * a ^ a = 0
 * 
 * Same numbers cancel each other.
 * 
 * ---------------------------------------------------
 * 2.
 * a ^ 0 = a
 * 
 * Any number XOR with 0
 * remains same.
 * 
 * ---------------------------------------------------
 * 3.
 * XOR is commutative:
 * 
 * a ^ b = b ^ a
 * 
 * ---------------------------------------------------
 * 4.
 * XOR is associative:
 * 
 * (a ^ b) ^ c
 * =
 * a ^ (b ^ c)
 * 
 * ---------------------------------------------------
 * Therefore:
 * 
 * duplicate numbers become 0
 * 
 * only unique element remains.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q2_UniqueElement {

    static void uniqueEle(int arr[]) {

        /*
         * Store XOR result
         */

        int ans = 0;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            /*
             * XOR current element
             */

            ans = ans ^ arr[i];
        }

        // Unique element
        System.out.println(ans);
    }

    public static void main(String[] args) {

        int arr[] = { 6, 8, 7, 6, 7, 8, 10 };

        uniqueEle(arr);
    }
}