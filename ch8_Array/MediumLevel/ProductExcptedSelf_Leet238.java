package ch8_Array.MediumLevel;

/*
 * LeetCode 238 : Product of Array Except Self
 * 
 * Problem:
 * 
 * For every index i,
 * return product of all elements
 * except nums[i].
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * nums = {1,2,3,4}
 * 
 * Output:
 * {24,12,8,6}
 * 
 * ---------------------------------------------------
 * Explanation:
 * 
 * index 0:
 * 2×3×4 = 24
 * 
 * index 1:
 * 1×3×4 = 12
 * 
 * index 2:
 * 1×2×4 = 8
 * 
 * index 3:
 * 1×2×3 = 6
 * ---------------------------------------------------
 * 
 * Main Idea:
 * 
 * answer[i] =
 * left product × right product
 * 
 * ---------------------------------------------------
 * Prefix Product:
 * 
 * Store product of all elements
 * before current index.
 * 
 * Formula:
 * 
 * preProduct[i]
 * =
 * preProduct[i-1] × nums[i-1]
 * 
 * ---------------------------------------------------
 * Suffix Product:
 * 
 * Store product of all elements
 * after current index.
 * 
 * We calculate suffix product
 * while traversing from right side.
 * ---------------------------------------------------
 * 
 * Important:
 * 
 * preProduct[0] = 1
 * 
 * Because:
 * 
 * there are no elements
 * before index 0.
 * 
 * Multiplication identity:
 * 
 * x × 1 = x
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 * 
 * (excluding output array)
 */

public class ProductExcptedSelf_Leet238 {

    static int[] productExceptSelf(int[] nums) {

        // Store final answer
        int preProduct[] = new int[nums.length];

        /*
         * Left product of index 0
         * is always 1
         * 
         * because no elements exist
         * before index 0
         */
        preProduct[0] = 1;

        // ---------------------------------------------------
        // Step 1: Build Prefix Product
        // ---------------------------------------------------

        for (int i = 1; i < nums.length; i++) {

            /*
             * Formula:
             * 
             * current prefix product =
             * previous prefix product × previous element
             */

            preProduct[i] =
                    preProduct[i - 1] * nums[i - 1];
        }

        // ---------------------------------------------------
        // Step 2: Traverse from Right Side
        // ---------------------------------------------------

        int suffix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            /*
             * Multiply:
             * left product × right product
             */

            preProduct[i] =
                    preProduct[i] * suffix;

            /*
             * Update suffix product
             */

            suffix = suffix * nums[i];
        }

        return preProduct;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4 };

        int ans[] = productExceptSelf(nums);

        for (int res : ans) {

            System.out.println(res);
        }
    }
}