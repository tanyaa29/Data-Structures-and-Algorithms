class GfG {
    public static ArrayList<String> printPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        String bf = "";

        backtrack(m, n, list, 0, 0, bf);
        return list;
    }

    public static void backtrack(int[][] m, int n, ArrayList<String> list, int i, int j, String bf) {
        if (i < 0 || i >= n || j < 0 || j >= n || m[i][j] == 0) {
            // bf.remove()
            // We have taken wrong step, go back;
            return;
        }
        if (i == n - 1 && j == n - 1) {
            list.add(bf + "");
            // bf.deleteCharAt(bf.length()-1);
            return;
        }

        // Now we have four options;
        m[i][j] = 0; // making it visited;

        backtrack(m, n, list, i + 1, j, bf + "D");
        backtrack(m, n, list, i, j - 1, bf + "L");
        backtrack(m, n, list, i, j + 1, bf + "R");
        backtrack(m, n, list, i - 1, j, bf + "U");

        m[i][j] = 1;
    }
}