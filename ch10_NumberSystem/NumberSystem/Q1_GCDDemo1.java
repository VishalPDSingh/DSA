package ch10_NumberSystem.NumberSystem;

/*
 * Question:
 * Given two positive integers a and b,
 * find their Greatest Common Divisor (GCD).
 *
 * GCD (Greatest Common Divisor):
 * The largest number that divides both numbers
 * without leaving a remainder.
 *
 * Example:
 * a = 24
 * b = 34
 *
 * Factors of 24 = {1, 2, 3, 4, 6, 8, 12, 24}
 * Factors of 34 = {1, 2, 17, 34}
 *
 * Common Factors = {1, 2}
 *
 * Output:
 * 2
 *
 * --------------------------------------------------
 * Approach:
 * Euclidean Algorithm (Recursion)
 * --------------------------------------------------
 *
 * Key Observation:
 *
 * gcd(a, b) = gcd(b % a, a)
 *
 * We repeatedly replace:
 *      (a, b)
 * with
 *      (b % a, a)
 *
 * until a becomes 0.
 *
 * When a becomes 0,
 * the answer is b.
 *
 * --------------------------------------------------
 * Dry Run:
 * --------------------------------------------------
 *
 * gcd(24, 34)
 *
 * gcd(34 % 24, 24)
 * gcd(10, 24)
 *
 * gcd(24 % 10, 10)
 * gcd(4, 10)
 *
 * gcd(10 % 4, 4)
 * gcd(2, 4)
 *
 * gcd(4 % 2, 2)
 * gcd(0, 2)
 *
 * Since a == 0,
 * return 2.
 *
 * Output = 2
 *
 * --------------------------------------------------
 * Algorithm:
 * --------------------------------------------------
 *
 * 1. If a becomes 0, return b.
 * 2. Calculate gcd(b % a, a).
 * 3. Repeat recursively.
 * 4. Return the final answer.
 *
 * --------------------------------------------------
 * Time Complexity:
 * --------------------------------------------------
 * O(log(min(a, b)))
 *
 * Euclidean Algorithm reduces the problem size
 * very quickly using the modulo operation.
 *
 * --------------------------------------------------
 * Space Complexity:
 * --------------------------------------------------
 * O(log(min(a, b)))
 *
 * Due to recursive call stack.
 *
 * --------------------------------------------------
 * Note:
 * --------------------------------------------------
 *
 * Iterative Version:
 * TC = O(log(min(a, b)))
 * SC = O(1)
 *
 * Recursive Version:
 * TC = O(log(min(a, b)))
 * SC = O(log(min(a, b)))
 */

public class Q1_GCDDemo1 {

    static int gcd(int a, int b)
    {
        // Base case:
        // When first number becomes 0,
        // second number is the GCD.
        if(a == 0)
            return b;

        // Recursive call using Euclidean Algorithm
        int temp = gcd(b % a, a);

        return temp;
    }

    public static void main(String[] args) {

        int a = 24;
        int b = 34;

        // Find GCD
        int res = gcd(a, b);

        // Print result
        System.out.println(res);
    }
}