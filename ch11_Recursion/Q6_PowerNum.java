package ch11_Recursion;

public class Q6_PowerNum {
    static int power(int a, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a;
        int temp = power(a, n - 1);
        return temp * a;
    }

    public static void main(String[] args) {
        int res = power(3, 5);
        System.out.println(res);
    }
}
