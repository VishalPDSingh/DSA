package ch8_Array.Array2D;

public class MatrixInWave {
    public static void main(String[] args) {

        int mat[][] = { { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 } };

        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = mat[0].length - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
