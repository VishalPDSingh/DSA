package ch8_Array.Easy;

/*
Given an array and multiple queries.
For each query, find the sum of elements
from index l to r.

Example:
Query = {2, 5}

arr[2] + arr[3] + arr[4] + arr[5]
*/

public class Q17_PrefixApp_Question {

    static void queriesSum(int arr[], int queries[][]) {

        // Traverse each query
        for (int i = 0; i < queries.length; i++) {

            // starting index of range
            int l = queries[i][0];

            // ending index of range
            int r = queries[i][1];

            // stores sum for current query
            int sum = 0;

            // Traverse from l to r
            for (int j = l; j <= r; j++) {

                // add array element into sum
                sum = sum + arr[j];
            }

            // print answer for current query
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 4, 1, 7, -8, 2, 0 };

        // Each query contains:
        // {starting index, ending index}
        int queries[][] = {
                { 3, 8 },
                { 2, 4 },
                { 0, 3 },
                { 5, 9 },
                { 6, 6 }
        };

        // function call
        queriesSum(arr, queries);
    }
}