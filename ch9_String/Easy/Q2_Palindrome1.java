package ch9_String.Easy;

/*
 * Palindrome String
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Check whether a string
 * is palindrome or not.
 * ---------------------------------------------------
 * 
 * Palindrome:
 * 
 * A string is called palindrome
 * if it reads same
 * from left to right
 * and right to left.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * "MADAM"
 * 
 * Reverse:
 * "MADAM"
 * 
 * Both are same
 * 
 * Therefore:
 * palindrome
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * "VISHAL"
 * 
 * Reverse:
 * "LAHSIV"
 * 
 * Both are different
 * 
 * Therefore:
 * not palindrome
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Step 1:
 * Reverse the string.
 * 
 * Step 2:
 * Compare original string
 * with reversed string.
 * 
 * Step 3:
 * If both are equal
 * → palindrome
 * else
 * → not palindrome
 * ---------------------------------------------------
 * 
 * Important:
 * 
 * In Java,
 * String comparison should use:
 * 
 * equals()
 * 
 * NOT:
 * ==
 * 
 * because:
 * 
 * equals()
 * compares actual content.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(n)
 */

public class Q2_Palindrome1 {

    // ---------------------------------------------------
    // Reverse String
    // ---------------------------------------------------

    static String reverse(String st) {

        String s = "";

        /*
         * Start from last character
         */

        for (int i = st.length() - 1; i >= 0; i--) {

            /*
             * charAt(i)
             * gives character at index i
             */

            s = s + st.charAt(i);
        }

        return s;
    }

    // ---------------------------------------------------
    // Check Palindrome
    // ---------------------------------------------------

    static boolean isPalindrome(String s) {

        /*
         * Compare original string
         * with reversed string
         */

        if (s.equals(reverse(s))) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "VISHAL";

        System.out.println(isPalindrome(s));

        String s2 = "1111";

        System.out.println(isPalindrome(s2));
    }
}