package ch11_Recursion;

public class Q4_FibonocciNumber {
    static int fibNumber(int n) {
        if (n == 0 || n == 1)
            return n;
        int temp1 = fibNumber(n - 1);
        int temp2 = fibNumber(n - 2);
        int fib = temp1 + temp2;
        return fib;

    }

    public static void main(String[] args) {

        int res = fibNumber(3);
        System.out.println(res);
    }
}
