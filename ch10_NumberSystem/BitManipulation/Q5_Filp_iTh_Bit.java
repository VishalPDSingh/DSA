package ch10_NumberSystem.BitManipulation;

/*
 * Flip (Toggle) the ith Bit
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Change ith bit:
 * 
 * 0 → 1
 * 1 → 0
 * 
 * This is called:
 * 
 * Flip / Toggle Bit
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * N = 45
 * 
 * Binary:
 * 
 * 101101
 * 
 * i = 4
 * 
 * 4th bit = 0
 * 
 * After flip:
 * 
 * 111101
 * 
 * Decimal:
 * 61
 * ---------------------------------------------------
 * 
 * Another Example:
 * 
 * If bit already = 1
 * 
 * then:
 * 
 * 1 → 0
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Create mask where only ith bit is ON.
 * 
 * Formula:
 * 
 * (1 << i)
 * 
 * ---------------------------------------------------
 * Then perform XOR:
 * 
 * n ^ (1 << i)
 * 
 * ---------------------------------------------------
 * Why XOR works?
 * 
 * XOR Truth Table:
 * 
 * 0 ^ 0 = 0
 * 0 ^ 1 = 1
 * 1 ^ 0 = 1
 * 1 ^ 1 = 0
 * 
 * ---------------------------------------------------
 * Important:
 * 
 * XOR with 1 flips the bit.
 * 
 * Therefore:
 * 
 * 0 becomes 1
 * 1 becomes 0
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q5_Filp_iTh_Bit {

    static int filpBit(int n, int i) {

        /*
         * Create mask:
         * 
         * 1 << i
         * 
         * Then XOR with n
         */

        int ans = n ^ (1 << i);

        return ans;
    }

    public static void main(String[] args) {

        int n = 45;

        int i = 4;

        int ans = filpBit(n, i);

        System.out.println(ans);
    }
}