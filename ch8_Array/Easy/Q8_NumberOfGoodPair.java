package ch8_Array.Easy;

public class Q8_NumberOfGoodPair {
    static int goodPair(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 3 };
        int res = goodPair(nums);
        System.out.println(res);
    }
}
