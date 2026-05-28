package ch9_String.Easy;

/*
 * Count Vowels in String
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Count total vowels present
 * in a string.
 * ---------------------------------------------------
 * 
 * Vowels:
 * 
 * a, e, i, o, u
 * 
 * Both:
 * lowercase and uppercase
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * "CODING"
 * 
 * Vowels:
 * O, I
 * 
 * Count:
 * 2
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Traverse every character
 * of the string.
 * 
 * Check whether character
 * is vowel or not.
 * 
 * If vowel found:
 * increase count.
 * ---------------------------------------------------
 * 
 * Important Mistake in Previous Code:
 * 
 * You placed semicolon (;)
 * after if condition.
 * 
 * Example:
 * 
 * if(condition);
 * 
 * Because of this:
 * 
 * count++ executes every time.
 * ---------------------------------------------------
 * 
 * Correct:
 * 
 * if(condition)
 * {
 *     count++;
 * }
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q4_CountingVowel {

    static int countVowel(String s) {

        int count = 0;

        /*
         * Traverse string
         */

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            /*
             * Check vowel
             */

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "CODING";

        System.out.println(countVowel(s));
    }
}