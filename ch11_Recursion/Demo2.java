package ch11_Recursion;

public class Demo2 {
    static int sum(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int y = sum(n - 1) + n;
        return y;
    }

    public static void main(String[] args) {

        int res = sum(20);
        System.out.println(res);
    }
}
