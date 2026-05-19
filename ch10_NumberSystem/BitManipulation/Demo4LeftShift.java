package ch10_NumberSystem.BitManipulation;

/*
 * Left Shift Operator (<<)
 * 
 * ---------------------------------------------------
 * Syntax:
 * 
 * number << k
 * 
 * ---------------------------------------------------
 * Meaning:
 * 
 * Shift all bits toward LEFT by k positions.
 * 
 * ---------------------------------------------------
 * Important Rule:
 * 
 * Every left shift multiplies number by 2
 * 
 * Formula:
 * 
 * n << k
 * =
 * n × 2ᵏ
 * ---------------------------------------------------
 * 
 * Example:
 * 
 * 45 << 1
 * 
 * = 45 × 2¹
 * 
 * = 90
 * ---------------------------------------------------
 * 
 * Binary Representation:
 * 
 * 45 = 101101
 * 
 * After left shift by 1:
 * 
 * 1011010
 * 
 * = 90
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 * 
 * to Calculate 2^n use left shif operator
 */

public class Demo4LeftShift {

    public static void main(String[] args) {

        int a = 45;

        /*
         * Left Shift by 1
         * 
         * Multiply by 2
         */

        a = a << 1;

        System.out.println(a);
    }
}