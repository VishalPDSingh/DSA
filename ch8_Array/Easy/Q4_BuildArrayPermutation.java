package ch8_Array.Easy;

public class Q4_BuildArrayPermutation {
    static int[] buildArray(int nums[]) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {

        int nums[] = { 0, 2, 1, 5, 3, 4 };
        int res[] = buildArray(nums);
        for (int ans : res)
            System.out.println(ans);
    }
}
