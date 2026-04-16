package ch11_Recursion;

public class Q5_NaturalNumber {
    static void printNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printNum(n - 1);
        System.out.println(n);
        return;
    }

    public static void main(String[] args) {
        printNum(10);
    }
}
