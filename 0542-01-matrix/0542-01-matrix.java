class Solution {
    // the direction array which will help us travel in all 4 directions
    int[] dx = { -1, 0, 0, 1 };
    int[] dy = { 0, -1, 1, 0 };

    class Pair {
        int row, col, dis;

        Pair(int row, int col, int dis) {
            this.row = row;
            this.col = col;
            this.dis = dis;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] ans = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> mq = new ArrayDeque<>();
        // initial we will push all elements having value (zero '0') and say they are at a distabce of 0(zero) from nearst 0(zero)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    vis[i][j] = true;
                    ans[i][j] = 0;// zeros are at a distance of zero 
                    mq.add(new Pair(i, j, 0));
                }
            }
        }

        while (mq.size() > 0) {
            Pair p = mq.poll();
            int row = p.row;
            int col = p.col;
            int dis = p.dis;
            ans[row][col] = dis;
            for (int i = 0; i < 4; i++) {
                int nrow = row + dx[i];
                int ncol = col + dy[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && mat[nrow][ncol] == 1) {
                    vis[nrow][ncol] = true;
                    mq.add(new Pair(nrow, ncol, dis + 1));
                }
            }
        }
        return ans;
    }
}
