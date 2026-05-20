package ch9_String.chp_String;

/*
========================================================
IMPORTANT INTERVIEW CONCEPTS
========================================================

1. == Operator
----------------
- Checks MEMORY LOCATION / REFERENCE
- Used for reference comparison
- Returns true only if both references point to SAME object

2. .equals() in Object Class
-----------------------------
- Defined inside Object class
- Default behavior compares references (same as ==)

Internally:
obj1.equals(obj2)  --->  obj1 == obj2

3. .equals() in String Class
-----------------------------
- String class OVERRIDES equals() method
- Compares ACTUAL CONTENT / CHARACTERS
- Returns true if characters are same

4. String Pool Concept
-----------------------
- String literals are stored in String Constant Pool (SCP)
- Duplicate literals share same memory

Example:
String s1 = "ABC";
String s2 = "ABC";

Only ONE object is created in SCP

5. new Keyword Concept
-----------------------
- new String("ABC") creates NEW object in Heap Memory
- Every time new is used, separate object is created

========================================================
INTERVIEW POINT
========================================================

==         ---> Reference Comparison
.equals()  ---> Content Comparison

For String:
Always prefer .equals() for value comparison

========================================================
*/

public class StringMethod1 {

    public static void main(String[] args) {

        // Creates object in Heap Memory
        String s1 = new String("Vishal");

        // Creates another separate object in Heap Memory
        String s2 = new String("Vishal");

        // == compares references (memory locations)
        // Different objects -> false
        System.out.println(s1 == s2); // false

        // String class overrides equals()
        // Compares actual content -> true
        System.out.println(s1.equals(s2)); // true


        // String literals are stored in String Constant Pool (SCP)
        String s3 = "JIS";

        // Reuses same object from SCP
        String s4 = "JIS";

        // Both references point to same SCP object
        System.out.println(s3 == s4); // true

        // Content is also same
        System.out.println(s3.equals(s4)); // true
    }
}