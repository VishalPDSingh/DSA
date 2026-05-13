package ch8_Array.Easy;

public class Q14_SubArrayDemo1 {
    static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5,3,-1,8 };
        subArray(arr);
    }
}
