package ch10_NumberSystem.BitManipulation;

/*
 * Count Total SET Bits
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Count how many bits are ON (1)
 * in a given number.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * n = 45
 * 
 * Binary:
 * 
 * 101101
 * 
 * Total SET bits:
 * 
 * 4
 * ---------------------------------------------------
 * 
 * Main Idea:
 * 
 * Check every bit from:
 * 
 * 0 to 31
 * 
 * because int contains 32 bits.
 * 
 * ---------------------------------------------------
 * Formula:
 * 
 * (n & (1 << i))
 * 
 * ---------------------------------------------------
 * Cases:
 * 
 * Result = 0
 * → bit is UNSET
 * 
 * Result ≠ 0
 * → bit is SET
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(32)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q7_CountSetBit {

    // ---------------------------------------------------
    // Check ith bit is SET or not
    // ---------------------------------------------------

    static boolean checkBit(int n, int i) {

        /*
         * AND operation checks ith bit
         */

        if ((n & (1 << i)) == 0) {

            // Bit is unset
            return false;
        }

        else {

            // Bit is set
            return true;
        }
    }

    // ---------------------------------------------------
    // Count total SET bits
    // ---------------------------------------------------

    static int countSetBit(int n) {

        int count = 0;

        /*
         * int = 32 bits
         * 
         * Check every bit
         */

        for (int i = 0; i < 32; i++) {

            // If ith bit is SET
            if (checkBit(n, i) == true) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 45;

        int ans = countSetBit(n);

        System.out.println(ans);
    }
}