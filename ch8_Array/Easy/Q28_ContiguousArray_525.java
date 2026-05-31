package ch8_Array.Easy;

public class Q28_ContiguousArray_525 {
    static int findMaxLength(int[] nums) {

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int zero = 0;
            int one = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]==0)
                    zero++;
                else
                    one++;
                if(one==zero)
                {
                    int l = j-i+1;
                    if(l>max)
                        max = l;
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1 };
        System.out.println(findMaxLength(arr));
    }
}
