package ch10_NumberSystem.BitManipulation;

/*
 * Every element repeats 3 times
 * except one element repeats 2 times.
 * 
 * Find that element.
 */

public class Q10_FindUniqueEle {

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
    // Find required element
    // ---------------------------------------------------

    static int uniqueEle(int arr[]) {

        int ans = 0;

        // Check every bit
        for (int i = 0; i < 32; i++) {

            int count = 0;

            // Count SET bits
            for (int j = 0; j < arr.length; j++) {

                if (checkBit(arr[j], i) == true) {

                    count++;
                }
            }

            /*
             * Unique element appears 2 times
             * 
             * therefore:
             * 
             * count % 3 == 2
             */

            if (count % 3 == 2) {

                ans = ans | (1 << i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 7, 5, 7, 6, 5, 7, 5, 6 };

        int ans = uniqueEle(arr);

        System.out.println(ans);
    }
}


/*
---------------------------------------------------
Condition
---------------------------------------------------

Every element repeats 3 times
except one element repeats 2 times.

---------------------------------------------------
Main Idea
---------------------------------------------------

Count SET bits at every position.

Possible count forms:

3*N
or
3*N + 2

---------------------------------------------------
Case 1
---------------------------------------------------

count = 3*N

Means repeated elements only contributed.

Therefore:

bit is UNSET in answer.

---------------------------------------------------
Case 2
---------------------------------------------------

count = 3*N + 2

Means extra 2 SET bits came from
the special element repeating 2 times.

Therefore:

bit is SET in answer.

---------------------------------------------------
Condition
---------------------------------------------------

if(count % 3 == 2)

then set ith bit in answer.

---------------------------------------------------
*/
