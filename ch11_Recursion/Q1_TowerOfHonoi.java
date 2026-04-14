package ch11_Recursion;

public class Q1_TowerOfHonoi {
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
        // three rodes
        // x - source, y - destination, z - temp
        toh('X', 'Y', 'Z', 4);
    }
}
