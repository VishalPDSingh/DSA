package ch8_Array.Easy;

public class Q3_TwoSum {
    static int[] twoSum(int arr[], int traget)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j] == traget)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

        int arr[] = { 3,3 };
        int traget = 6;
        int res[] = twoSum(arr, traget);
        for(int ans:res)
            System.out.println(ans);
    }
}
