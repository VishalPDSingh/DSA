package ch9_String.Easy;

/*
 * Palindrome Check using Two Pointers
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
 * A string is palindrome
 * if it reads same
 * from left to right
 * and right to left.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * "level"
 * 
 * Reverse:
 * "level"
 * 
 * Both are same
 * 
 * Therefore:
 * palindrome
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Use Two Pointer Technique.
 * ---------------------------------------------------
 * 
 * Pointer i:
 * starts from beginning.
 * 
 * Pointer j:
 * starts from ending.
 * ---------------------------------------------------
 * 
 * Compare:
 * 
 * s.charAt(i)
 * and
 * s.charAt(j)
 * ---------------------------------------------------
 * 
 * If both are equal:
 * move inward
 * 
 * i++
 * j--
 * ---------------------------------------------------
 * 
 * If any character mismatches:
 * 
 * string is NOT palindrome.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * "level"
 * 
 * l == l
 * 
 * e == e
 * 
 * v == v
 * 
 * All matched
 * 
 * Therefore:
 * palindrome
 * ---------------------------------------------------
 * 
 * Why while(i <= j)?
 * 
 * Because:
 * 
 * We continue checking
 * until both pointers cross.
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 * 
 * Better than reverse-string approach
 * because no extra string is created.
 */

public class Q3_Palindrome2 {

    static boolean isPalindrome(String s) {

        // Left pointer
        int i = 0;

        // Right pointer
        int j = s.length() - 1;

        /*
         * Continue until pointers cross
         */

        while (i <= j) {

            /*
             * Compare characters
             */

            if (s.charAt(i) != s.charAt(j)) {

                return false;
            }

            // Move left pointer forward
            i++;

            // Move right pointer backward
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "level";

        System.out.println(isPalindrome(s));

        String s2 = "aba";
        System.out.println(isPalindrome(s2));
    }
}