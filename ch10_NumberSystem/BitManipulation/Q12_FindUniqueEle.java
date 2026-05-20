package ch10_NumberSystem.BitManipulation;

/*
 * Every element repeats 4 times
 * except one element repeats 2 times.
 * 
 * Find that element.
 */

public class Q12_FindUniqueEle {

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
             * Special element contributes
             * remainder 2
             */

            if (count % 4 == 2) {

                ans = ans | (1 << i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 7, 5, 7, 5, 7, 5, 7, 6, 6 };

        int ans = uniqueEle(arr);

        System.out.println(ans);
    }
}

/*
---------------------------------------------------
Condition
---------------------------------------------------

Every element repeats 4 times
except one element repeats 2 times.

---------------------------------------------------
Important Observation
---------------------------------------------------

XOR will NOT work here.

Because:

a ^ a ^ a ^ a = 0

But special element appears 2 times.

Example:

x ^ x != x

It becomes 0.

Therefore XOR removes the special element also.

---------------------------------------------------
Main Logic
---------------------------------------------------

Count SET bits at every bit position.

Repeated elements contribute:

4*N SET bits.

Special element contributes:

2 extra SET bits.

---------------------------------------------------
Possible Forms
---------------------------------------------------

count = 4*N
or
count = 4*N + 2

---------------------------------------------------
Case 1
---------------------------------------------------

count % 4 == 0

Means bit is NOT SET
in special element.

---------------------------------------------------
Case 2
---------------------------------------------------

count % 4 == 2

Means bit is SET
in special element.

---------------------------------------------------
Condition
---------------------------------------------------

if(count % 4 == 2)

then set ith bit in answer.

---------------------------------------------------
Time Complexity
---------------------------------------------------

O(32 * N)
≈ O(N)

---------------------------------------------------
*/