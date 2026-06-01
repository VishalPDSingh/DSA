
package ch14_Hashing;

/*
 * Hashing (Frequency Count)
 * 
 * Idea:
 * Create a frequency array.
 * 
 * Index -> Number
 * Value -> Frequency
 * 
 * Example:
 * 
 * arr[] = {1,5,8,7,5}
 * 
 * hash[1] = 1
 * hash[5] = 2
 * hash[7] = 1
 * hash[8] = 1
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(maxElement)
 */

public class HashingDemo1 {

    static void countEleAppears(int arr[]) {

        /*
         * Maximum element = 8
         * 
         * Taking size 13
         * so indices 0..12 exist
         */
        int hash[] = new int[13];

        // Store frequencies

        for (int i = 0; i < arr.length; i++) {

            hash[arr[i]]++;
        }

        // Print frequencies

        for (int i = 0; i < hash.length; i++) {

            if (hash[i] > 0) {

                System.out.println(i + " appears " + hash[i] + " times");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 8, 7, 5};

        countEleAppears(arr);
    }
}