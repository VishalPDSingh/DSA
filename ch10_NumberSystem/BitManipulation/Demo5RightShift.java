package ch10_NumberSystem.BitManipulation;

/*
 * Right Shift Operator (>>)
 * 
 * ---------------------------------------------------
 * Syntax:
 * 
 * number >> k
 * 
 * ---------------------------------------------------
 * Meaning:
 * 
 * Shift all bits toward RIGHT by k positions.
 * 
 * ---------------------------------------------------
 * Important Rule:
 * 
 * Every right shift divides number by 2
 * 
 * Formula:
 * 
 * n >> k
 * =
 * n / 2ᵏ
 * 
 * (integer division)
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * 45 >> 1
 * 
 * = 45 / 2¹
 * 
 * = 22
 * ---------------------------------------------------
 * 
 * Binary Representation:
 * 
 * 45 = 101101
 * 
 * After right shift by 1:
 * 
 * 10110
 * 
 * = 22
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 */

public class Demo5RightShift {

    public static void main(String[] args) {

        int a = 45;

        /*
         * Right Shift by 1
         * 
         * Divide by 2
         */

        a = a >> 1;

        System.out.println(a);
    }
}