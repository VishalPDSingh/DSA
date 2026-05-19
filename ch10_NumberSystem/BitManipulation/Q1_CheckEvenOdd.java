package ch10_NumberSystem.BitManipulation;

import java.util.Scanner;

/*
 * Check Even or Odd using Bit Manipulation
 * 
 * ---------------------------------------------------
 * Main Logic:
 * 
 * Use Bitwise AND (&) operator.
 * 
 * ---------------------------------------------------
 * Important Observation:
 * 
 * Binary Representation:
 * 
 * Even Number:
 * last bit = 0
 * 
 * Odd Number:
 * last bit = 1
 * 
 * ---------------------------------------------------
 * Examples:
 * 
 * 4  -> 100
 * 7  -> 111
 * 
 * ---------------------------------------------------
 * Formula:
 * 
 * n & 1
 * 
 * ---------------------------------------------------
 * Meaning:
 * 
 * 1 in binary:
 * 
 * 0001
 * 
 * When we do:
 * 
 * n & 1
 * 
 * it checks only the last bit.
 * 
 * ---------------------------------------------------
 * Cases:
 * 
 * If result = 0
 * → Even Number
 * 
 * If result = 1
 * → Odd Number
 * ---------------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 * 
 * Space Complexity:
 * O(1)
 */

public class Q1_CheckEvenOdd {

    static void evenOdd(int n) {

        /*
         * Formula:
         * 
         * n & 1
         * 
         * Checks last bit.
         */

        if ((n & 1) == 0) {

            System.out.println("Even");
        }

        else {

            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");

        int n = sc.nextInt();

        evenOdd(n);

        sc.close();
    }
}