package ch10_NumberSystem.BitManipulation;

/*
 * Find Unique Element using XOR
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Every element repeats twice
 * except one element.
 * 
 * Find the unique element.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {4,2,4,9,2,8,9}
 * 
 * Output:
 * 8
 * ---------------------------------------------------
 * 
 * Idea 1:
 * 
 * Use HashMap
 * and count frequency of every element.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(n)
 * ---------------------------------------------------
 * 
 * Idea 2:
 * 
 * Use XOR Operation
 * 
 * XOR Properties:
 * 
 * A ^ 0 = A
 * 
 * A ^ A = 0
 * 
 * A ^ B = B ^ A
 * 
 * ---------------------------------------------------
 * Main Logic:
 * 
 * Same elements cancel each other.
 * 
 * Only unique element remains.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * 4 ^ 2 ^ 4 ^ 9 ^ 2 ^ 8 ^ 9
 * 
 * =
 * (4 ^ 4)
 * ^
 * (2 ^ 2)
 * ^
 * (9 ^ 9)
 * ^
 * 8
 * 
 * =
 * 0 ^ 0 ^ 0 ^ 8
 * 
 * =
 * 8
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q8_FindUniqueEle {

    static int uniueEle(int arr[]) {

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

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 4, 9, 2, 8, 9 };

        int ans = uniueEle(arr);

        System.out.println(ans);
    }
}