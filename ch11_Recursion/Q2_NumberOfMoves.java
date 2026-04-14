package ch11_Recursion;

public class Q2_NumberOfMoves {
    static void toh(char X, char Y, char Z, int n) {

        // base condition
        if (n == 1) {
            System.out.println("Move disk 1 from " + X + " to " + Y);
            return;
        }
        toh(X, Z, Y, n - 1); // step 1
        System.out.println("Move disk " + n + " from " + X + " to " + Y); // step 2
        toh(Z, Y, X, n - 1); // step 3

    }

    public static void main(String[] args) {

        int n = 4;
        int mov = (int) Math.pow(2, n) - 1;
        System.out.println("Total moves: " + mov);

        toh('X', 'Y', 'Z', n);
    }
}
