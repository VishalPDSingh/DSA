package SimpleMathematics;

import java.util.Scanner;

public class Q12_SumOfNaturalNum {
    static int sumOfNatural(int n) {
        if (n == 0)
            return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = sumOfNatural(n);
        System.out.println(res);
        sc.close();
    }
}
