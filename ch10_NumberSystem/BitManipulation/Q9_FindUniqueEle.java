package ch10_NumberSystem.BitManipulation;

/*
 * Find Unique Element
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Every element repeats 3 times
 * except one element.
 * 
 * Find that unique element.
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {7,6,7,5,6,7,6}
 * 
 * Output:
 * 5
 * ---------------------------------------------------
 * 
 * Idea 1:
 * 
 * Use HashMap
 * 
 * Count frequency of every element.
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
 * Count SET bits at every position.
 * 
 * ---------------------------------------------------
 * Main Logic:
 * 
 * Since repeated elements appear 3 times,
 * their SET bits also appear multiples of 3.
 * 
 * Therefore:
 * 
 * count % 3
 * 
 * removes repeated elements contribution.
 * 
 * Remaining bits belong to unique element.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * arr = {7,6,7,5,6,7,6}
 * 
 * Binary:
 * 
 * 7 = 111
 * 6 = 110
 * 5 = 101
 * 
 * ---------------------------------------------------
 * Count bits at every position:
 * 
 * i = 0:
 * 7 contributes 3
 * 5 contributes 1
 * 
 * total = 4
 * 
 * 4 % 3 = 1
 * 
 * therefore bit 0 is SET in answer.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(32 * n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q9_FindUniqueEle {

    // ---------------------------------------------------
    // Check ith bit is SET or not
    // ---------------------------------------------------

    // Check ith bit is SET or not
    static boolean checkBit(int n, int i) {

        if ((n & (1 << i)) == 0) {

            return false;
        }

        else {

            return true;
        }
    }

    // ---------------------------------------------------
    // Find unique element
    // ---------------------------------------------------

    static int uniqueEle(int arr[]) {

        int ans = 0;

        /*
         * Check every bit
         */

        for (int i = 0; i < 32; i++) {

            int count = 0;

            /*
             * Count SET bits at ith position
             */

            for (int j = 0; j < arr.length; j++) {

                if (checkBit(arr[j], i) == true) {

                    count++;
                }
            }

            /*
             * If count % 3 != 0
             * then unique element has SET bit
             */

            if (count % 3 == 1) {

                ans = ans + (1 << i);
            } else {
                // do nothing
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 7, 5, 4, 7, 11, 11, 9, 11, 7, 5, 4, 4 };

        int ans = uniqueEle(arr);

        System.out.println(ans);
    }
}

/*
 * ---------------------------------------------------
 * Array:
 * ---------------------------------------------------
 * 
 * arr[] = {5,7,5,4,7,11,11,9,11,7,5,4,4}
 * 
 * ---------------------------------------------------
 * Binary Representation
 * ---------------------------------------------------
 * 
 * 5 = 0101
 * 7 = 0111
 * 5 = 0101
 * 4 = 0100
 * 7 = 0111
 * 11 = 1011
 * 11 = 1011
 * 9 = 1001
 * 11 = 1011
 * 7 = 0111
 * 5 = 0101
 * 4 = 0100
 * 4 = 0100
 * 
 * ---------------------------------------------------
 * Observation
 * ---------------------------------------------------
 * 
 * Every element repeats 3 times except one element.
 * 
 * 5 -> 3 times
 * 7 -> 3 times
 * 11 -> 3 times
 * 4 -> 3 times
 * 
 * 9 -> 1 time
 * 
 * Therefore answer should be 9.
 * 
 * ---------------------------------------------------
 * Logic
 * ---------------------------------------------------
 * 
 * Count SET bits at every position.
 * 
 * If count % 3 != 0
 * then that bit belongs to unique element.
 * 
 * ---------------------------------------------------
 * Dry Run
 * ---------------------------------------------------
 * 
 * Bit Position 0 (1's place)
 * 
 * 5 -> 1
 * 7 -> 1
 * 5 -> 1
 * 4 -> 0
 * 7 -> 1
 * 11 -> 1
 * 11 -> 1
 * 9 -> 1
 * 11 -> 1
 * 7 -> 1
 * 5 -> 1
 * 4 -> 0
 * 4 -> 0
 * 
 * Total SET bits = 10
 * 
 * 10 % 3 = 1
 * 
 * Therefore bit 0 is SET in answer.
 * 
 * Answer till now:
 * 0001
 * 
 * ---------------------------------------------------
 * 
 * Bit Position 1 (2's place)
 * 
 * 5 -> 0
 * 7 -> 1
 * 5 -> 0
 * 4 -> 0
 * 7 -> 1
 * 11 -> 1
 * 11 -> 1
 * 9 -> 0
 * 11 -> 1
 * 7 -> 1
 * 5 -> 0
 * 4 -> 0
 * 4 -> 0
 * 
 * Total SET bits = 6
 * 
 * 6 % 3 = 0
 * 
 * Therefore bit 1 is NOT SET.
 * 
 * Answer till now:
 * 0001
 * 
 * ---------------------------------------------------
 * 
 * Bit Position 2 (4's place)
 * 
 * 5 -> 1
 * 7 -> 1
 * 5 -> 1
 * 4 -> 1
 * 7 -> 1
 * 11 -> 0
 * 11 -> 0
 * 9 -> 0
 * 11 -> 0
 * 7 -> 1
 * 5 -> 1
 * 4 -> 1
 * 4 -> 1
 * 
 * Total SET bits = 9
 * 
 * 9 % 3 = 0
 * 
 * Therefore bit 2 is NOT SET.
 * 
 * Answer till now:
 * 0001
 * 
 * ---------------------------------------------------
 * 
 * Bit Position 3 (8's place)
 * 
 * 5 -> 0
 * 7 -> 0
 * 5 -> 0
 * 4 -> 0
 * 7 -> 0
 * 11 -> 1
 * 11 -> 1
 * 9 -> 1
 * 11 -> 1
 * 7 -> 0
 * 5 -> 0
 * 4 -> 0
 * 4 -> 0
 * 
 * Total SET bits = 4
 * 
 * 4 % 3 = 1
 * 
 * Therefore bit 3 is SET.
 * 
 * Answer till now:
 * 1001
 * 
 * ---------------------------------------------------
 * 
 * Final Binary Answer
 * 
 * 1001 = 9
 * 
 * ---------------------------------------------------
 * Unique Element = 9
 * ---------------------------------------------------
 */