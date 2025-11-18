package Sorting_Algo;

public class Bubble_Sort {

    // Bubble sort Algorithm
    public static void bubble(int arr[])
    {
        int n = arr.length;
        // Pass or Iteration
        for(int pass = 0; pass<=n-1; pass++)
        {
            for(int i=0; i<n-1; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,9,20,25,68,53};
        bubble(arr);
        for(int x : arr)
            System.out.print(x + " ");
    }
}
