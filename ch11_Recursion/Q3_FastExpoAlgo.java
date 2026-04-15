package ch11_Recursion;

public class Q3_FastExpoAlgo {

    static long fastAlgo(long x, long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        long y = fastAlgo(x, n / 2);
        if (n % 2 == 0)
            return (y * y);
        return (x * y * y);
    }

    public static void main(String[] args) {

        long res = fastAlgo(5, 3);
        System.out.println(res);

    }
}
