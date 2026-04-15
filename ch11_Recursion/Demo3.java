package ch11_Recursion;

// print natural number

public class Demo3 {
    static int printNum(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        System.out.println(n);
        int y = printNum(n - 1);
        return y;
    }

    public static void main(String[] args) {

        int res = printNum(10);
        System.out.println(res);
    }
}
