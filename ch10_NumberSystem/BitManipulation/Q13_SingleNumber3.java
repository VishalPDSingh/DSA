package ch10_NumberSystem.BitManipulation;

/*
 * Single Number 3
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Every element repeats twice
 * except TWO elements.
 * 
 * Find both unique elements.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr[] =
 * {9,8,9,12,8,12,21,10,6,11,10,6}
 * 
 * Output:
 * 21
 * 11
 * ---------------------------------------------------
 * 
 * Idea 1:
 * 
 * Use HashMap
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
 * Use XOR
 * 
 * ---------------------------------------------------
 * Step 1:
 * 
 * XOR all elements.
 * 
 * Repeated elements become 0.
 * 
 * Remaining:
 * 
 * x ^ y
 * 
 * where:
 * x and y are unique elements.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * 21 ^ 11 = 30
 * 
 * Binary:
 * 
 * 21 = 10101
 * 11 = 01011
 * 
 * XOR:
 * 
 * 11110
 * ---------------------------------------------------
 * 
 * Step 2:
 * 
 * Find any SET bit index in XOR result.
 * 
 * Why?
 * 
 * Because:
 * 
 * x ^ y has SET bit only when
 * bits are different.
 * 
 * Therefore:
 * 
 * one number has 0
 * other has 1 at that index.
 * ---------------------------------------------------
 * 
 * Step 3:
 * 
 * Divide elements into 2 groups:
 * 
 * Group 1:
 * bit is 0
 * 
 * Group 2:
 * bit is 1
 * 
 * ---------------------------------------------------
 * Important:
 * 
 * Same repeated elements always go
 * into SAME group.
 * 
 * Therefore:
 * 
 * they cancel each other using XOR.
 * ---------------------------------------------------
 * 
 * Finally:
 * 
 * both unique elements remain.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q13_SingleNumber3 {

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
    // Find two unique numbers
    // ---------------------------------------------------

    static void singleNumber3(int arr[]) {

        // ---------------------------------------------------
        // Step 1:
        // XOR all elements
        // ---------------------------------------------------

        int v = 0;

        for (int i = 0; i < arr.length; i++) {

            v = v ^ arr[i];
        }

        /*
         * v = x ^ y
         * 
         * Example:
         * 21 ^ 11 = 30
         */

        // ---------------------------------------------------
        // Step 2:
        // Find any SET bit index
        // ---------------------------------------------------

        int ind = 0;

        for (int i = 0; i < 32; i++) {

            if (checkBit(v, i) == true) {

                ind = i;

                break;
            }
        }

        /*
         * We can take ANY set bit index.
         * 
         * Why?
         * 
         * Because x and y differ there.
         */

        // ---------------------------------------------------
        // Step 3:
        // Divide into 2 groups
        // ---------------------------------------------------

        int set1 = 0;

        int set2 = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            // Bit is 1
            if (checkBit(num, ind) == true) {

                set2 = set2 ^ num;
            }

            // Bit is 0
            else {

                set1 = set1 ^ num;
            }
        }

        System.out.println(set1);

        System.out.println(set2);
    }

    public static void main(String[] args) {

        int arr[] = { 9, 8, 9, 12, 8, 12, 21, 10, 6, 11, 10, 6 };

        singleNumber3(arr);
    }
}
/*
 * How to Solve the Problem?
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Every element repeats twice
 * except two unique elements.
 * 
 * Find both unique elements.
 * ---------------------------------------------------
 * 
 * Step 1:
 * 
 * Take XOR of all elements.
 * 
 * Repeated elements cancel each other.
 * 
 * Remaining value becomes:
 * 
 * x ^ y
 * 
 * where:
 * x and y are unique elements.
 * ---------------------------------------------------
 * 
 * Step 2:
 * 
 * Find any SET bit in x ^ y.
 * 
 * Why?
 * 
 * Because SET bit means:
 * 
 * x and y are different at that bit position.
 * 
 * One number contains:
 * 0
 * 
 * Other contains:
 * 1
 * ---------------------------------------------------
 * 
 * Step 3:
 * 
 * Divide elements into 2 sets.
 * 
 * Set 1:
 * Elements whose selected bit is 0.
 * 
 * Set 2:
 * Elements whose selected bit is 1.
 * ---------------------------------------------------
 * 
 * Important Observation:
 * 
 * Repeated elements always go
 * into the SAME set.
 * 
 * Therefore:
 * 
 * they cancel each other using XOR.
 * ---------------------------------------------------
 * 
 * Finally:
 * 
 * Set 1 gives first unique element.
 * 
 * Set 2 gives second unique element.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * x = 21
 * y = 11
 * 
 * x ^ y = 30
 * 
 * Binary:
 * 
 * 11110
 * 
 * Take any SET bit.
 * 
 * Suppose bit index = 1
 * 
 * Then:
 * 
 * numbers having bit 1 = 0
 * go into Set 1
 * 
 * numbers having bit 1 = 1
 * go into Set 2
 * 
 * After XOR inside both sets,
 * duplicate elements cancel.
 * 
 * Remaining values are:
 * 
 * 21 and 11
 * ---------------------------------------------------
 */