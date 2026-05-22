package ch9_String.chp_String;

/*
========================================================
PROOF THAT STRING IS IMMUTABLE
========================================================

Immutable:
-----------
Once String object is created,
its content CANNOT be changed.

Any modification operation:
----------------------------
- creates NEW String object
- original object remains unchanged

========================================================
MUTABLE VS IMMUTABLE
========================================================

char[]  ---> Mutable
String  ---> Immutable

========================================================
IMPORTANT INTERVIEW POINT
========================================================

String methods like:
---------------------
concat()
toUpperCase()
replace()

DO NOT modify original String.

They create NEW object.

========================================================
*/

public class ProofOfImmutable {

    public static void main(String[] args) {

        // ====================================================
        // CHARACTER ARRAY IS MUTABLE
        // ====================================================

        char[] ch = {'J','A','V','V'};

        // Accessing character
        System.out.println(ch[2]); // V


        // Modifying character array
        // Direct modification possible
        ch[2] = 'B';

        // Updated value
        System.out.println(ch[2]); // B


        // Entire array updated
        System.out.println(ch); // JABV


        /*
        IMPORTANT:
        ----------
        char array is MUTABLE
        because data can be changed directly
        */


        // ====================================================
        // STRING IS IMMUTABLE
        // ====================================================

        String s1 = "JAVA";

        // Accessing character
        System.out.println(s1.charAt(2)); // V


        /*
        Cannot do:
        -----------
        s1.charAt(2) = 'B';  // INVALID

        Because String is immutable
        */


        // ====================================================
        // concat() EXAMPLE
        // ====================================================

        String s2 = "Tap";

        // Original String
        System.out.println(s2); // Tap


        // concat() creates NEW object
        // Original string remains unchanged
        s2.concat("Class");


        // Still prints original String
        System.out.println(s2); // Tap


        /*
        WHAT HAPPENED INTERNALLY?
        --------------------------

        s2 ---> "Tap"

        s2.concat("Class")
                |
                v

        NEW object created:
        "TapClass"

        But reference NOT stored anywhere.

        So:
        ----
        "TapClass" becomes eligible for Garbage Collection.

        Original:
        ----------
        s2 ---> "Tap"

        remains unchanged.

        ====================================================
        CORRECT WAY
        ====================================================

        s2 = s2.concat("Class");

        Now:
        s2 ---> "TapClass"

        */


        // ====================================================
        // CORRECT MODIFICATION
        // ====================================================

        s2 = s2.concat("Class");

        System.out.println(s2); // TapClass
    }
}