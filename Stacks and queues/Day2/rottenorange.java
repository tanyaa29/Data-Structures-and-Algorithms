public class Solution {

    public int orangesRotting(int[][] grid) {
        if (grid.length == 0)
            return 0;
        int min = 0, f = 0;

        Queue<Node> que = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    que.add(new Node(i, j, 0));
                }
                if (grid[i][j] == 1)
                    f++;

            }
        }
        if (f == 0)
            return 0;

        while (!que.isEmpty()) {
            Node cur = que.remove();
            min = cur.min;

            if (cur.x > 0 && grid[cur.x - 1][cur.y] == 1) {
                grid[cur.x - 1][cur.y] = 2;
                que.add(new Node(cur.x - 1, cur.y, cur.min + 1));
            }
            if (cur.x < grid.length - 1 && grid[cur.x + 1][cur.y] == 1) {
                grid[cur.x + 1][cur.y] = 2;
                que.add(new Node(cur.x + 1, cur.y, cur.min + 1));
            }

            if (cur.y > 0 && grid[cur.x][cur.y - 1] == 1) {
                grid[cur.x][cur.y - 1] = 2;
                que.add(new Node(cur.x, cur.y - 1, cur.min + 1));
            }
            if (cur.y < grid[0].length - 1 && grid[cur.x][cur.y + 1] == 1) {
                grid[cur.x][cur.y + 1] = 2;
                que.add(new Node(cur.x, cur.y + 1, cur.min + 1));
            }

        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    return -1;
            }
        }
        return min;
    }
}

public class Node {
    int x, y;
    int min;

    public Node(int x, int y, int min) {
        this.x = x;
        this.y = y;
        this.min = min;
    }
}class rottenorange {
    
}
