package ch8_Array.Array2D;

public class ColWise {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 } };

        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
