class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int dumrow[] = new int[r];
        for (int i = 0; i < r; i++)
            dumrow[i] = -1;
        int dumcol[] = new int[c];
        for (int i = 0; i < c; i++)
            dumcol[i] = -1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    dumrow[i] = 0;
                    dumcol[j] = 0;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dumrow[i] == 0 || dumcol[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}