package ch10_NumberSystem.BitManipulation;

/*
 * Every element repeats 4 times
 * except one element appears 1 time.
 * 
 * Find the unique element.
 */

public class Q11_FindUniqueEle {

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
             * Repeated elements contribute
             * multiples of 4
             * 
             * Remaining contribution belongs
             * to unique element
             */

            if (count % 4 == 1) {

                ans = ans | (1 << i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 7, 5, 7, 5, 7, 5, 7, 9 };

        int ans = uniqueEle(arr);

        System.out.println(ans);
    }
}

/*
---------------------------------------------------
Condition
---------------------------------------------------

Every element repeats 4 times
except one element occurs 1 time.

---------------------------------------------------
Main Logic
---------------------------------------------------

Count SET bits at every index.

Repeated elements contribute:

4*N SET bits.

Unique element contributes:

1 extra SET bit.

---------------------------------------------------
Possible Forms
---------------------------------------------------

count = 4*N
or
count = 4*N + 1

---------------------------------------------------
Case 1
---------------------------------------------------

count % 4 == 0

Bit is NOT SET in unique element.

---------------------------------------------------
Case 2
---------------------------------------------------

count % 4 == 1

Bit is SET in unique element.

---------------------------------------------------
Condition
---------------------------------------------------

if(count % 4 == 1)

then set ith bit in answer.

---------------------------------------------------
Time Complexity
---------------------------------------------------

O(32 * N)
≈ O(N)

---------------------------------------------------
*/


/*
If every element repeats EVEN number of times
like 2, 4, 6 ...

then XOR can remove duplicates.

Example:

a ^ a = 0

Therefore repeated elements cancel out.

Only unique element remains.

Time Complexity:
O(N)

Space Complexity:
O(1)
*/