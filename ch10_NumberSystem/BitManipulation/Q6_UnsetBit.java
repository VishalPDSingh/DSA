package ch10_NumberSystem.BitManipulation;

/*
 * Unset (Clear) the ith Bit
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Turn OFF the ith bit.
 * 
 * ---------------------------------------------------
 * Cases:
 * 
 * If ith bit already = 0
 * → No change
 * 
 * If ith bit = 1
 * → Make it 0
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
 * i = 3
 * 
 * 3rd bit = 1
 * 
 * After unsetting:
 * 
 * 100101
 * 
 * Decimal:
 * 37
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Step 1:
 * Create mask where ith bit is ON.
 * 
 * Formula:
 * 
 * (1 << i)
 * 
 * ---------------------------------------------------
 * Step 2:
 * Take NOT of mask.
 * 
 * ~(1 << i)
 * 
 * ith bit becomes 0
 * remaining bits become 1
 * 
 * ---------------------------------------------------
 * Step 3:
 * Perform AND operation.
 * 
 * n & (~(1 << i))
 * 
 * ---------------------------------------------------
 * Why AND works?
 * 
 * AND Truth Table:
 * 
 * 1 & 1 = 1
 * 1 & 0 = 0
 * 0 & 1 = 0
 * 0 & 0 = 0
 * 
 * ---------------------------------------------------
 * Important:
 * 
 * AND with 0 makes bit 0.
 * 
 * Therefore ith bit becomes UNSET.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q6_UnsetBit {

    static int unSetBit1(int n, int i) {

        /*
         * Formula:
         * 
         * n & (~(1 << i))
         */

        int ans = n & (~(1 << i));

        return ans;
    }

    static boolean checkBit(int n, int i) {

        /*
         * If result is non-zero
         * then bit is SET
         */

        return (n & (1 << i)) != 0;
    }

    // ---------------------------------------------------
    // Method 2:
    // Using XOR after checking bit
    // ---------------------------------------------------

    static int unSetBit2(int n, int i) {

        // If ith bit is SET
        if (checkBit(n, i) == true) {

            /*
             * XOR flips the bit
             * 
             * 1 ^ 1 = 0
             */

            int ans = n ^ (1 << i);

            return ans;
        }

        else {

            // Already unset
            return n;
        }
    }

    public static void main(String[] args) {

        int n = 45;

        int i = 3;

        int ans = unSetBit1(n, i);

        System.out.println(ans);

        int asn2 = unSetBit2(ans, i);
        System.out.println(asn2);
    }
}