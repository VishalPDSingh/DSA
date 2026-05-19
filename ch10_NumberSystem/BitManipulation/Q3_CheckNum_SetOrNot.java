package ch10_NumberSystem.BitManipulation;

/*
 * Check if ith Bit is Set or Not
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Check whether ith bit of number N
 * is 1 (SET) or 0 (UNSET).
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * N = 45
 * 
 * Binary:
 * 
 * 101101
 * 
 * Indexing from right side:
 * 
 * bit:   1 0 1 1 0 1
 * index: 5 4 3 2 1 0
 * 
 * ---------------------------------------------------
 * Check:
 * 
 * i = 4
 * 
 * Bit at index 4 = 0
 * 
 * So answer = false
 * ---------------------------------------------------
 * 
 * Main Idea:
 * 
 * Create a number where only ith bit is ON.
 * 
 * Formula:
 * 
 * (1 << i)
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * i = 4
 * 
 * 1 << 4
 * 
 * Binary:
 * 
 * 000001 << 4
 * 
 * =
 * 010000
 * 
 * ---------------------------------------------------
 * Now perform AND:
 * 
 * N & (1 << i)
 * 
 * ---------------------------------------------------
 * Cases:
 * 
 * If result = 0
 * → ith bit is UNSET
 * 
 * If result ≠ 0
 * → ith bit is SET
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q3_CheckNum_SetOrNot {

    // ---------------------------------------------------
    // Idea 1
    // Using Binary Conversion
    // ---------------------------------------------------
    /*
     * Convert number into binary
     * and check ith position.
     * 
     * Not efficient.
     */

    static boolean checkBits1(int n, int i) {

        String binary = Integer.toBinaryString(n);

        // Reverse indexing from right side
        int index = binary.length() - 1 - i;

        // If index goes outside
        if (index < 0) {

            return false;
        }

        return binary.charAt(index) == '1';
    }

    // ---------------------------------------------------
    // Idea 2
    // Using Bit Manipulation
    // ---------------------------------------------------

    static boolean checkBits2(int n, int i) {

        /*
         * Create mask:
         * 
         * 1 << i
         */

        /*
         * IMPORTANT:
         * 
         * Bracket is compulsory.
         * 
         * Wrong:
         * n & (1 << i) == 0
         * 
         * Correct:
         * (n & (1 << i)) == 0
         */

        if ((n & (1 << i)) == 0) {

            return false; // bit is unset
        }

        else {

            return true; // bit is set
        }
    }

    public static void main(String[] args) {

        int n = 45;

        int i = 2;

        boolean ans1 = checkBits1(n, i);

        System.out.println(ans1);

        boolean ans2 = checkBits2(n, i);

        System.out.println(ans2);
    }
}