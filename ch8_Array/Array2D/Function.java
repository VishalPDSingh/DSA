package ch8_Array.Array2D;

public class Function {
    static void fun(int[][] num) {
        num[0][0] = 200;
    }

    public static void main(String[] args) {

        int[][] arr = { { 10, 20 }, { 30, 40 } };
        System.out.println(arr[0][0]);
        fun(arr);
        System.out.println(arr[0][0]);
    }
}
