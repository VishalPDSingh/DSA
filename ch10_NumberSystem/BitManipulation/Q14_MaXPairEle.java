package ch10_NumberSystem.BitManipulation;



/*
 * Maximum AND Pair
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Find maximum value of:
 * 
 * arr[i] & arr[j]
 * 
 * where:
 * i != j
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * arr[] = {21,18,24,17,16}
 * ---------------------------------------------------
 * 
 * Binary:
 * 
 * 21 = 10101
 * 18 = 10010
 * 24 = 11000
 * 17 = 10001
 * 16 = 10000
 * ---------------------------------------------------
 * 
 * Idea 1:
 * 
 * Check AND of every pair.
 * 
 * TC:
 * O(n^2)
 * ---------------------------------------------------
 * 
 * Idea 2:
 * 
 * Start checking from leftmost bit.
 * 
 * Keep only numbers
 * whose current bit is SET.
 * 
 * If at least 2 numbers remain,
 * that bit can contribute
 * in maximum AND answer.
 * ---------------------------------------------------
 */

public class Q14_MaXPairEle {

    // ---------------------------------------------------
    // Check ith bit is SET or not
    // ---------------------------------------------------

    static boolean checkBit(int n, int i) {

        if ((n & (1 << i)) == 0) {

            return false;
        }

        else {

            return true;
        }
    }

    // ---------------------------------------------------
    // Idea 1 : Brute Force
    // ---------------------------------------------------

    static int maxEle1(int arr[]) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int ans = arr[i] & arr[j];

                max = Math.max(max, ans);
            }
        }

        return max;
    }

    // ---------------------------------------------------
    // Idea 2 : Bit Manipulation
    // ---------------------------------------------------
    static int maxAND(int arr[]) {

        int n = arr.length;

        for (int i = 31; i >= 0; i--) {

            int c = 0;

            for (int j = 0; j < n; j++) {
                if (checkBit(arr[j], i)) {
                    c++;
                }
            }

            if (c >= 2) {

                for (int j = 0; j < n; j++) {

                    if (!checkBit(arr[j], i)) {
                        arr[j] = 0;
                    }
                }
            }
        }

        int idn1 = -1;
        int idn2 = -1;

        for (int k = 0; k < n; k++) {

            if (arr[k] > 0 && idn1 == -1) {
                idn1 = k;
            } else if (arr[k] > 0) {
                idn2 = k;
                break;
            }
        }

        return arr[idn1] & arr[idn2];
    }

    public static void main(String[] args) {

        int arr[] = { 21, 18, 24, 17, 16 };

        int ans1 = maxEle1(arr);

        System.out.println("Brute Force Answer: " + ans1);

        int ans2 = maxAND(arr);
        System.out.println(ans2);

    }
}

/*
 * Maximum AND Pair
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Given an array,
 * find maximum value of:
 * 
 * arr[i] & arr[j]
 * 
 * where:
 * i != j
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * arr[] = {21,18,24,17,16}
 * ---------------------------------------------------
 * 
 * Binary Representation:
 * 
 * 21 = 10101
 * 18 = 10010
 * 24 = 11000
 * 17 = 10001
 * 16 = 10000
 * ---------------------------------------------------
 * 
 * Idea 1:
 * 
 * Check AND of every pair.
 * 
 * Find maximum value.
 * 
 * TC:
 * O(n^2)
 * 
 * SC:
 * O(1)
 * ---------------------------------------------------
 * 
 * Idea 2 (Bit Manipulation Observation):
 * 
 * Bigger leftmost SET bit
 * means bigger number.
 * 
 * Therefore:
 * 
 * To maximize AND,
 * we try to preserve higher bits.
 * ---------------------------------------------------
 * 
 * Important Observation:
 * 
 * AND operation gives 1 only when:
 * 
 * 1 & 1 = 1
 * 
 * Otherwise:
 * 
 * 0
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * 26 = 11010
 * 23 = 10111
 * 
 * AND:
 * 
 * 10010 = 18
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Step 1:
 * 
 * Start checking from leftmost bit
 * (31st bit to 0th bit).
 * ---------------------------------------------------
 * 
 * Step 2:
 * 
 * Count how many numbers contain
 * current bit as SET.
 * ---------------------------------------------------
 * 
 * Step 3:
 * 
 * If at least 2 numbers contain
 * that bit,
 * 
 * then this bit can contribute
 * in maximum AND answer.
 * ---------------------------------------------------
 * 
 * Step 4:
 * 
 * Ignore numbers where current bit is 0.
 * 
 * Keep only numbers where current bit is 1.
 * ---------------------------------------------------
 * 
 * Why?
 * 
 * Because:
 * 
 * AND requires both bits = 1.
 * 
 * Numbers with 0 cannot help
 * create maximum AND.
 * ---------------------------------------------------
 * 
 * Continue for remaining bits.
 * ---------------------------------------------------
 * 
 * Final remaining bits form
 * maximum AND pair answer.
 * ---------------------------------------------------
 */