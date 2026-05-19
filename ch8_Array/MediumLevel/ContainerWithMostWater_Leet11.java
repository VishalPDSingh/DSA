package ch8_Array.MediumLevel;

/*
 * LeetCode 11 : Container With Most Water
 * 
 * Problem:
 * 
 * Given an array height[],
 * each element represents height of vertical lines.
 * 
 * Find two lines that together form a container
 * which stores maximum water.
 * 
 * ---------------------------------------------------
 * Water Formula:
 * 
 * Area = Height × Width
 * 
 * Height:
 * minimum of both heights
 * 
 * Width:
 * distance between both lines
 * 
 * ---------------------------------------------------
 * Mathematical Formula:
 * 
 * area =
 * min(height[i], height[j]) × (j - i)
 * 
 * ---------------------------------------------------
 * Example:
 * 
 * arr = {1,8,6,2,5,4,8,3,7}
 * 
 * Best container:
 * 
 * height = min(8,7) = 7
 * width = 8 - 1 = 7
 * 
 * area = 7 × 7 = 49
 * ---------------------------------------------------
 */

public class ContainerWithMostWater_Leet11 {

    // ---------------------------------------------------
    // Brute Force Approach
    // ---------------------------------------------------
    /*
     * Check every possible pair.
     * 
     * Time Complexity:
     * O(n²)
     * 
     * Space Complexity:
     * O(1)
     */

    static int maxArea1(int[] height) {

        int maxWater = 0;

        // First line
        for (int i = 0; i < height.length; i++) {

            // Second line
            for (int j = i + 1; j < height.length; j++) {

                // Width
                int wt = j - i;

                // Height
                int ht = Math.min(height[i], height[j]);

                // Area
                int area = ht * wt;

                // Update maximum water
                if (maxWater < area) {

                    maxWater = area;
                }
            }
        }

        return maxWater;
    }

    // ---------------------------------------------------
    // Optimal Two Pointer Approach
    // ---------------------------------------------------
    /*
     * Main Idea:
     * 
     * Water depends on:
     * 
     * 1. Minimum Height
     * 2. Width
     * 
     * ---------------------------------------------------
     * Strategy:
     * 
     * Start with maximum width.
     * 
     * Move smaller height pointer
     * because:
     * 
     * smaller height limits water.
     * 
     * ---------------------------------------------------
     * Time Complexity:
     * O(n)
     * 
     * Space Complexity:
     * O(1)
     */

    static int maxArea2(int[] height) {

        // Left Pointer
        int lp = 0;

        // Right Pointer
        int rp = height.length - 1;

        int maxWater = 0;

        while (lp < rp) {

            // Width
            int w = rp - lp;

            // Minimum Height
            int ht = Math.min(height[lp], height[rp]);

            // Current Water
            int currWater = w * ht;

            // Update maximum water
            maxWater = Math.max(currWater, maxWater);

            /*
             * Move smaller height pointer
             */

            if (height[lp] < height[rp]) {

                lp++;
            }

            else {

                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int res = maxArea1(arr);

        System.out.println("Brute Force Answer: " + res);

        int ans = maxArea2(arr);

        System.out.println("Optimal Answer: " + ans);
    }
}