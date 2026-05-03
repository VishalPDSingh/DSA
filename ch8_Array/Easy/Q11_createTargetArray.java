package ch8_Array.Easy;

public class Q11_createTargetArray {
    static int[] createTargetArray(int nums[], int index[]) {
        // Create the traget array
        int[] target = new int[nums.length];
        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            int pos = index[i];

            // shift the element right
            for (int j = size; j > pos; j--) {
                target[j] = target[j - 1];
            }

            target[pos] = nums[i];
            size++;
        }

        return target;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 3, 4 };
        int index[] = { 0, 1, 2, 2, 1 };
        int res[] = createTargetArray(nums, index);
        for (int ans : res)
            System.out.println(ans);
    }
}
