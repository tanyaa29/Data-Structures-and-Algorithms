public class approach2NO_extraspace {
  
        public void setZeroes(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;
            int col = 0;
            for (int i = 0; i < r; i++) {
                if (matrix[i][0] == 0)
                    col = 1;
                for (int j = 1; j < c; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
            for (int i = r - 1; i > 0; i--) {
                for (int j = c - 1; j > 0; j--) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0)
                        matrix[i][j] = 0;
                }

            }
            if (matrix[0][0] == 0) {
                for (int j = 0; j < c; j++) {
                    matrix[0][j] = 0;
                }
            }
            if (col == 1)
                for (int i = 0; i < r; i++)
                    matrix[i][0] = 0;

        }
     
}
