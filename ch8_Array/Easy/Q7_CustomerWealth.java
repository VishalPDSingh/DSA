package ch8_Array.Easy;

public class Q7_CustomerWealth {
    static int richPerson(int arr[][]) {
        int maxWealth = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
            if (maxWealth < sum)
                maxWealth = sum;
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int ans = richPerson(arr);
        System.out.println(ans);
    }
}
