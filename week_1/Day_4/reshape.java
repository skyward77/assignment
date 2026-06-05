package week_1.Day_4;

 public class reshape {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // check validity
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                result[row][col] = mat[i][j];

                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int r = 1, c = 4;

        int[][] result = matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

    

