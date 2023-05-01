class Solution {

    public class Pair {
        int row, col, time;
        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> mq = new LinkedList();
        int n = grid.length;
        int m = grid[0].length;
        int freshOrange = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshOrange++;
                }
                if (grid[i][j] == 2) {
                    mq.add(new Pair(i, j, 0));
                }
            }
        }
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, -1, 0, 1 };
        int ans = 0;
        while (mq.size() > 0) {
            Pair p = mq.poll();
            int r = p.row;
            int c = p.col;
            int time = p.time;
            ans = Math.max(ans, time);
            for (int i = 0; i < 4; i++) {
                int x = r + dx[i];
                int y = c + dy[i];
                if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1) {
                    grid[x][y] = 2;
                    freshOrange--;
                    mq.add(new Pair(x, y, time + 1));
                }
            }
        }
        if (freshOrange == 0) return ans;
        return -1;
    }
}
