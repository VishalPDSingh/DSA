package ch15_DivideAndConquer.Easy;

public class MergeSortedArray_88 {
    static void merge(int a[], int m, int b[], int n)
    {
        m = 1;
        n = 0;
        // new array
        int temp[] = new int[m+n];
        // starting point of temp array
        int k=0;

        int i =0; // starting point of a[] array
        int j=0; // starting point of b[] array

        while (i<m && j<n) 
        {
            if(a[i] <= b[j])
            {
                temp[k] = a[i];
                i++;
                k++;
            }
            else
            {
                temp[k] = b[j];
                k++;
                j++;
            }
        }

        if(j<n)
        {
            while (j<n) {
                temp[k] = b[j];
                k++;
                j++;
            }
        }
        // copy temp[] to a[]
       for(int index=0; index<temp.length; index++)
       {
        a[index] = temp[index];
       }
    }
    public static void main(String[] args) {
        
        int a[] = {1};
        int b[] = {};
        merge(a, 0, b, 0);
    }
}
