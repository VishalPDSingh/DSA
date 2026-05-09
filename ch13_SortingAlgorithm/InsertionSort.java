package ch13_SortingAlgorithm;

public class InsertionSort {
    static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j]>arr[j+1])
                {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        for(int ans : arr)
            System.out.println(ans);
    }
    public static void main(String[] args) {
        
        int a[] = {10,3,6,8,2,5};
        insertionSort(a);
    }
}
