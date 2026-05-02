package ch8_Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class Q10_kidsWithCandies {

    static List<Boolean> kidsWithCandies(int arr[], int extraCandies) {
        List<Boolean> li = new ArrayList<>();

        int maxCandies = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCandies) {
                maxCandies = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + extraCandies >= maxCandies) {
                li.add(true);
            } else {
                li.add(false);
            }
        }
        return li;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 3 };
        int extrCandies = 3;
        List<Boolean> li = new ArrayList<>();
        li = kidsWithCandies(arr, extrCandies);
        System.out.println(li);
    }
}
