package ch8_Array.Array2D;

import java.util.Scanner;

public class Q8_IdentityMatrix {
    static boolean identityMatrix(int arr[][])
    {
        for(int i=0; i<arr.length; i++ )
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(i!=j && arr[i][j]!=0)
                    return false;
                if(i==j && arr[i][j]!=1)
                    return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the value of col: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter at the index " + "( " + i + "," + j + ")");
                arr[i][j] = sc.nextInt();
            }
        }
         System.out.println("Original MATRIX ELEMENTS ARE:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[j][i] + "[" + i + "," + j + "] ");
            }
            System.out.println();
        }
        boolean res = identityMatrix(arr);
        System.out.println(res);
        sc.close();
    }
}
