package ch9_String.chp_String;

/*
========================================================
compareTo() METHOD IN JAVA
========================================================

compareTo() is used to compare TWO STRINGS
LEXICOGRAPHICALLY (Dictionary Order).

Method Syntax:
---------------
str1.compareTo(str2)

========================================================
RETURN VALUES
========================================================

1. Returns 0
--------------
If BOTH strings are equal

Example:
"JAVA".compareTo("JAVA") ---> 0

========================================================

2. Returns POSITIVE value
--------------------------
If first string is GREATER than second string

Example:
"SAURAV".compareTo("SACHIN") ---> positive

========================================================

3. Returns NEGATIVE value
--------------------------
If first string is SMALLER than second string

Example:
"SACHIN".compareTo("SAURAV") ---> negative

========================================================
HOW compareTo() WORKS INTERNALLY
========================================================

- Compares character by character
- Uses Unicode / ASCII values
- Stops at FIRST mismatch

Formula:
---------
First Different Character Value Difference

Example:
---------
"SAURAV"
"SACHIN"

Comparison:
S = S  ---> same
A = A  ---> same

U vs C  ---> mismatch

'U' = 85
'C' = 67

85 - 67 = 18

Output:
18

========================================================
IMPORTANT INTERVIEW POINT
========================================================

compareTo() compares:
----------------------
1. Unicode values
2. Dictionary order
3. Character by character

========================================================
compareTo() vs equals()
========================================================

equals()
----------
Checks CONTENT equality only
Return type ---> boolean

compareTo()
-------------
Checks lexical ordering
Return type ---> int

========================================================
*/

public class CompareMethod2 {

    public static void main(String[] args) {

        // ====================================================
        // DIFFERENT STRINGS
        // ====================================================

        String s1 = "SAURAV";
        String s2 = "SACHIN";


        // Comparison:
        // S = S
        // A = A
        // U vs C ---> mismatch
        //
        // Unicode:
        // U = 85
        // C = 67
        //
        // 85 - 67 = 18
        //
        // Positive value -> s1 > s2
        System.out.println(s1.compareTo(s2)); // 18


        // Reverse comparison
        // 67 - 85 = -18
        //
        // Negative value -> s2 < s1
        System.out.println(s2.compareTo(s1)); // -18



        // ====================================================
        // SAME STRINGS
        // ====================================================

        String st1 = "JAVA";
        String st2 = "JAVA";


        // Both strings are equal
        // Output -> 0
        System.out.println(st1.compareTo(st2)); // 0

        System.out.println(st2.compareTo(st1)); // 0



        // ====================================================
        // PREFIX STRING CASE
        // ====================================================

        String str1 = "JAVA";
        String str2 = "JAVAC";


        /*
        Comparison:
        J = J
        A = A
        V = V
        A = A

        First string ends here

        Length difference considered

        "JAVA" is smaller than "JAVAC"
        */

        System.out.println(str1.compareTo(str2)); // negative

        System.out.println(str2.compareTo(str1)); // positive
    }
}