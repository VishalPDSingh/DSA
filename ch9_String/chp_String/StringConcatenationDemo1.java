package ch9_String.chp_String;

/*
========================================================
STRING CONCATENATION IN JAVA
========================================================

Concatenation means JOINING two strings.

Example:
"JAVA" + "HTML"
----------------
Output:
"JAVAHTML"

========================================================
WAYS OF CONCATENATION
========================================================

1. Using + Operator
--------------------
String s = s1 + s2;

2. Using concat() Method
-------------------------
String s = s1.concat(s2);

========================================================
IMPORTANT INTERVIEW CONCEPT
========================================================

CASE 1:
--------
String s = "JAVA" + "HTML";

- Both are String literals
- Compiler optimizes at COMPILE TIME
- Result stored in String Constant Pool (SCP)

This is called:
COMPILE TIME CONCATENATION

========================================================

CASE 2:
--------
String s = s1 + s2;

- Variables involved
- Concatenation happens at RUNTIME
- Object created in Heap Memory

This is called:
RUNTIME CONCATENATION

========================================================

CASE 3:
--------
concat() method ALWAYS creates NEW object

Even if values are same,
references are different.

========================================================
== VS .equals()
========================================================

==         ---> checks memory reference
.equals()  ---> checks content

========================================================
STRING POOL RULE
========================================================

Same String literals share same SCP object.

Example:
String s1 = "ABC";
String s2 = "ABC";

s1 == s2 ---> true

========================================================
*/

public class StringConcatenationDemo1 {

    public static void main(String[] args) {

        // ====================================================
        // STRING CONCATENATION USING + OPERATOR
        // ====================================================

        String s1 = "JAVA";
        String s2 = "HTML";


        // Compile-time concatenation
        // Stored in String Constant Pool (SCP)
        String s3 = "JAVA" + "HTML";

        // Reuses same SCP object
        String s4 = "JAVA" + "HTML";


        // Runtime concatenation
        // Variables involved -> object created in Heap
        String s5 = s1 + s2;

        // Another separate Heap object
        String s6 = s1 + s2;


        // One variable involved -> runtime concatenation
        // Created in Heap Memory
        String s7 = "Vishal" + s2;


        // ====================================================
        // REFERENCE COMPARISON
        // ====================================================

        // s3 -> SCP object
        // s6 -> Heap object
        // Different references
        if (s3 == s6) {
            System.out.println("String References are equal");
        } else {
            System.out.println("Not equal"); // OUTPUT
        }


        // s4 -> SCP object
        // s5 -> Heap object
        // Different references
        if (s4 == s5) {
            System.out.println("String References are equal");
        } else {
            System.out.println("Not equal"); // OUTPUT
        }


        // ====================================================
        // CONCAT USING concat() METHOD
        // ====================================================

        String st1 = "JAVA";
        String st2 = "PYTHON";


        // concat() creates NEW object
        // Stored in Heap Memory
        String st3 = st1.concat(st2);

        // Another NEW Heap object
        String st4 = st1.concat(st2);


        System.out.println(st3); // JAVAPYTHON


        // Different Heap objects
        // Reference comparison -> false
        if (st3 == st4) {
            System.out.println("String References are equal");
        } else {
            System.out.println("Not equal"); // OUTPUT
        }


        // ====================================================
        // CONCAT USING STRING LITERALS
        // ====================================================

        // Even though literals are used,
        // concat() method still creates NEW objects
        String st5 = "JAVA".concat("PYTHON");

        String st6 = "JAVA".concat("PYTHON");


        // Different objects in Heap
        if (st5 == st6) {
            System.out.println("String References are equal");
        } else {
            System.out.println("Not equal"); // OUTPUT
        }


        // ====================================================
        // CONTENT COMPARISON USING equals()
        // ====================================================

        // Content is same -> true
        System.out.println(st5.equals(st6)); // true
    }
}