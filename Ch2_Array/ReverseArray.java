package Ch2_Array;

public class ReverseArray {
    public static void reverseArray(int num[])
    {
        int sp = 0; // start point 
        int ep = num.length-1; // end point

        for(int i=sp; i<=ep; i++)
        {
            // swaping
            int temp = num[sp];
            num[sp] = num[ep];
            num[ep] = temp;
            sp++;
            ep--;
        }
    }
    public static void main(String[] args) {
        // array is given
        int arr[] = {10,20,30,40,50,60,70,80};
        reverseArray(arr);

        // printing the array
        for(int x:arr)
        {
            System.out.print(x+" , ");
        }

    }
}
