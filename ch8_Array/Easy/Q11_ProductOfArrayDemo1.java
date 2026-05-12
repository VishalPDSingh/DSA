package ch8_Array.Easy;

/*
 * Product of Array Except Itself
 * 
 * Problem:
 * For every index,
 * return the product of all elements
 * except the current element.
 * 
 * ---------------------------------------------------
 * Example:
 * arr = {1, 2, 3, 4}
 * 
 * Output:
 * {24, 12, 8, 6}
 * 
 * Explanation:
 * 
 * Index 0:
 * 2 * 3 * 4 = 24
 * 
 * Index 1:
 * 1 * 3 * 4 = 12
 * 
 * Index 2:
 * 1 * 2 * 4 = 8
 * 
 * Index 3:
 * 1 * 2 * 3 = 6
 * ---------------------------------------------------
 * 
 * Optimal Approach:
 * 
 * Use:
 * 1. Prefix Product
 * 2. Suffix Product
 * 
 * Prefix Product:
 * Product of all elements before current index
 * 
 * Suffix Product:
 * Product of all elements after current index
 * 
 * Final Answer:
 * 
 * result[i] =
 * prefix product before i
 * *
 * suffix product after i
 * 
 * ---------------------------------------------------
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(n)
 */

public class Q11_ProductOfArrayDemo1 {

    static int[] productExceptItself(int arr[]) {

        // Store prefix products
        int prefProduct[] = new int[arr.length];

        /*
         * First element prefix product is 1
         * because there is no element on left side
         */
        prefProduct[0] = 1;

        // -----------------------------------------
        // Build Prefix Product Array
        // -----------------------------------------

        for (int i = 1; i < arr.length; i++) {

            prefProduct[i] = prefProduct[i - 1] * arr[i - 1];
        }

        // -----------------------------------------
        // Build Suffix Product and Final Answer
        // -----------------------------------------

        int suffix = 1;

        /*
         * Traverse from right to left
         */
        for (int i = arr.length - 1; i >= 0; i--) {

            /*
             * Multiply:
             * prefix product * suffix product
             */
            prefProduct[i] = prefProduct[i] * suffix;

            /*
             * Update suffix product
             */
            suffix = suffix * arr[i];
        }

        return prefProduct;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };

        int res[] = productExceptItself(arr);

        // Print result array
        for (int ans : res)

            System.out.println(ans);
    }
}