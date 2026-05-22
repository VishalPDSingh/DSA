package ch9_String.MutableString;

/*
========================================================
MUTABLE STRINGS IN JAVA
========================================================

Mutable:
---------
Object data CAN be modified after creation.

Java provides two mutable string classes:

1. StringBuffer
2. StringBuilder

========================================================
WHY MUTABLE STRINGS?
========================================================

String objects are IMMUTABLE.

Every modification creates NEW object.

Problem:
---------
Too many objects created
-> memory wastage
-> slower performance

Solution:
----------
Use mutable strings:
- StringBuffer
- StringBuilder

========================================================
STRINGBUFFER VS STRINGBUILDER
========================================================

StringBuffer
--------------
- Mutable
- Thread Safe
- Synchronized
- Slower

StringBuilder
---------------
- Mutable
- NOT Thread Safe
- Faster
- Introduced in JDK 1.5

========================================================
DEFAULT CAPACITY
========================================================

Default capacity = 16

Formula:
----------
New Capacity = (Old Capacity * 2) + 2

========================================================
IMPORTANT METHODS
========================================================

append()      ---> add data at end
capacity()    ---> total storage size
length()      ---> actual character count
trimToSize()  ---> removes extra unused space

========================================================
INTERVIEW POINT
========================================================

String
--------
Immutable

StringBuffer / StringBuilder
-----------------------------
Mutable

========================================================
*/

public class Demo1 {

    public static void main(String[] args) {

        // ====================================================
        // STRINGBUFFER
        // ====================================================

        // Empty mutable string object created
        StringBuffer s1 = new StringBuffer();


        // Default capacity = 16
        System.out.println(s1.capacity()); // 16


        // Adding string at end
        s1.append("JAVA");

        System.out.println(s1); // JAVA


        // Actual character count
        System.out.println(s1.length()); // 4


        // Mutable -> original object modified
        s1.append(" HTML");

        System.out.println(s1); // JAVA HTML


        /*
        IMPORTANT:
        ----------
        append() modifies SAME object

        No new object created.
        */


        // Capacity increases automatically if needed
        s1.append(" VISHAL SINGH");


        /*
        Capacity formula:
        -----------------
        New Capacity = (Old Capacity * 2) + 2

        Example:
        --------
        16 -> 34
        */

        System.out.println(s1.capacity());

        // Total characters present
        System.out.println(s1.length());


        // Removes extra unused memory
        s1.trimToSize();

        // Capacity becomes equal to length
        System.out.println(s1.capacity());



        // ====================================================
        // STRINGBUILDER
        // ====================================================

        StringBuilder s2 = new StringBuilder();


        // Default capacity = 16
        System.out.println(s2.capacity()); // 16


        // Adding string
        s2.append("JAVA");

        System.out.println(s2); // JAVA


        // Length of string
        System.out.println(s2.length()); // 4


        // Mutable modification
        s2.append(" HTML");

        System.out.println(s2); // JAVA HTML


        // Capacity increases automatically
        s2.append(" VISHAL SINGH");

        System.out.println(s2.capacity());

        System.out.println(s2.length());


        // Removes extra unused space
        s2.trimToSize();

        System.out.println(s2.capacity());


        /*
        ====================================================
        DIFFERENCE BETWEEN STRINGBUFFER & STRINGBUILDER
        ====================================================

        StringBuffer:
        --------------
        - Thread Safe
        - Synchronized
        - Slower

        StringBuilder:
        ----------------
        - NOT Thread Safe
        - Faster
        - Better performance

        ====================================================
        WHEN TO USE?
        ====================================================

        Multi-threaded Environment
        ---------------------------
        Use StringBuffer

        Single-threaded Environment
        ----------------------------
        Use StringBuilder

        ====================================================
        */
    }
}