package ch8_Array.Array;

public class Method_In_Array {
    static void methodCopy(int arr[]) {
        System.out.println(arr.length); // 4
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 20, 30, 50, 50 };
        methodCopy(arr);
    }
}
