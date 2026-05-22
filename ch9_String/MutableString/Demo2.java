package ch9_String.MutableString;

import java.util.StringTokenizer;

/*
========================================================
STRINGTOKENIZER CLASS IN JAVA
========================================================

StringTokenizer is used to:
----------------------------
Split / break / cut String into small parts called TOKENS.

Example:
---------
"JAVA PYTHON SQL AI"

Tokens:
--------
JAVA
PYTHON
SQL
AI

========================================================
PACKAGE
========================================================

import java.util.StringTokenizer;

========================================================
CONSTRUCTOR
========================================================

StringTokenizer st =
new StringTokenizer(String , Delimiter);

Example:
---------
StringTokenizer st =
new StringTokenizer("JAVA PYTHON SQL AI"," ");

========================================================
DELIMITER
========================================================

Delimiter means separator character.

Examples:
-----------
" "  ---> space
","  ---> comma
"-"  ---> hyphen

========================================================
IMPORTANT METHODS
========================================================

1. hasMoreTokens()
-------------------
Checks whether token exists or not.

Return Type:
-------------
boolean

true  ---> token available
false ---> no token available

========================================================

2. nextToken()
---------------
Returns next token.

Return Type:
-------------
String

========================================================
WORKING FLOW
========================================================

Step 1:
--------
Check token available or not
using:
hasMoreTokens()

Step 2:
--------
If true:
Retrieve token using:
nextToken()

Step 3:
--------
Move to next token automatically

========================================================
FLOWCHART LOGIC
========================================================

hasMoreTokens()
        |
      true
        |
nextToken()
        |
Print token
        |
Again check hasMoreTokens()

========================================================
INTERVIEW POINT
========================================================

StringTokenizer:
----------------
- Legacy class
- Faster than split()
- Does NOT support regex

Modern alternative:
--------------------
split() method

========================================================
*/

public class Demo2 {

    public static void main(String[] args) {

        // ====================================================
        // STRINGTOKENIZER OBJECT CREATION
        // ====================================================

        // Splitting string using SPACE delimiter
        StringTokenizer st =
                new StringTokenizer("JAVA PYTHON SQL AI", " ");


        // Printing object reference
        System.out.println(st);


        /*
        ====================================================
        TOKEN EXTRACTION
        ====================================================
        */

        // Check token available or not
        while (st.hasMoreTokens()) {

            // Get next token
            String token = st.nextToken();

            // Print token
            System.out.println(token);
        }


        /*
        OUTPUT:
        --------
        JAVA
        PYTHON
        SQL
        AI
        */


        /*
        ====================================================
        INTERNAL WORKING
        ====================================================

        Original String:
        -----------------
        "JAVA PYTHON SQL AI"

                 Space is delimiter
                          ↓

        Tokens created:
        -----------------
        JAVA
        PYTHON
        SQL
        AI

        ====================================================
        */
    }
}