package ch9_String.chp_String;

/*
========================================================
IMMUTABLE STRING CONCEPT
========================================================

String in Java is IMMUTABLE.

Meaning:
- Once a String object is created,
  its content CANNOT be changed.

Example:
String s = "Hello";

s.concat(" World");

Original string remains same:
"Hello"

========================================================
WAYS TO CREATE STRING
========================================================

1. Using String Literal
------------------------
String s = "Hello";

- Stored inside String Constant Pool (SCP)
- Memory efficient
- Reuses existing objects

2. Using new Keyword
---------------------
String s = new String("Hello");

- Creates object in Heap Memory
- Separate object created every time

3. Using Character Array
-------------------------
char arr[] = {'a','b','c'};

String s = new String(arr);

- Converts char array into String

========================================================
STRING CONSTANT POOL (SCP)
========================================================

- Special memory area inside Heap
- Stores String literals
- Avoids duplicate objects

========================================================
INTERVIEW POINTS
========================================================

== Operator
------------
- Checks REFERENCE / MEMORY LOCATION

.equals()
-----------
- Checks ACTUAL CONTENT

String literals share same SCP object:
-------------------------------------
String s1 = "ABC";
String s2 = "ABC";

s1 == s2 ---> true

new keyword creates separate objects:
-------------------------------------
String s1 = new String("ABC");
String s2 = new String("ABC");

s1 == s2 ---> false

========================================================
*/

public class ImmutableStringDemo2 {

    public static void main(String[] args) {

        // ====================================================
        // USING STRING LITERALS
        // ====================================================

        // Object created inside String Constant Pool (SCP)
        String name1 = "HelloWorld";

        // Reuses same SCP object
        String name2 = "HelloWorld";

        // == checks memory reference
        // Both point to same SCP object
        System.out.println(name1 == name2); // true


        // ====================================================
        // USING CHARACTER ARRAY
        // ====================================================

        char ch[] = {'a','b','c','d'};

        // Converts char array into String object
        String s1 = new String(ch);

        System.out.println(s1); // abcd


        // ====================================================
        // USING STRING LITERAL
        // ====================================================

        String s2 = "Hello";

        System.out.println(s2);


        // ====================================================
        // USING new KEYWORD
        // ====================================================

        // Creates NEW object in Heap Memory
        String s3 = new String("Hello World");

        System.out.println(s3);


        // ====================================================
        // IMMUTABLE STRING EXAMPLE
        // ====================================================

        String str = "Java";

        // Creates new object, does NOT modify original string
        str.concat(" Programming");

        // Original string remains unchanged
        System.out.println(str); // Java
    }
}