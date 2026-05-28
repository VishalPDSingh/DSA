package ch9_String.Easy;

/*
 * Reverse a String
 * 
 * ---------------------------------------------------
 * Problem:
 * 
 * Reverse the given string.
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * Input:
 * VISHALSINGH
 * 
 * Output:
 * HGNISLAHSIV
 * ---------------------------------------------------
 * 
 * Main Logic:
 * 
 * Traverse the string
 * from last index to first index.
 * 
 * Add every character
 * into a new string.
 * ---------------------------------------------------
 * 
 * Important:
 * 
 * String indexing starts from 0.
 * 
 * Last index:
 * 
 * st.length() - 1
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * V I S H A L
 * 0 1 2 3 4 5
 * 
 * Last index = 5
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(n)
 */

public class Q1_RerveseString {

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

    public static void main(String[] args) {

        String st = "VISHALSINGH";

        System.out.println("Original String:");

        System.out.println(st);

        /*
         * There is NO direct reverse()
         * method in String class.
         * 
         * Reverse method exists in:
         * 
         * StringBuilder
         */

        StringBuilder sb = new StringBuilder(st);

        System.out.println("Using StringBuilder reverse():");

        System.out.println(sb.reverse());

        /*
         * Using custom logic
         */

        String ans = reverse(st);

        System.out.println("Using Custom Reverse:");

        System.out.println(ans);
    }
}