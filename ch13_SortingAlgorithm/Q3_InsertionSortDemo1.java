package ch13_SortingAlgorithm;

import java.util.Arrays;

public class Q3_InsertionSortDemo1 {
    
    public static void main(String[] args) {

        int arr[] = { 2, 6, 10, 14, 20, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
        for (int res : arr)
            System.out.println(res);
        System.out.println("************************************************************");


    }
}
