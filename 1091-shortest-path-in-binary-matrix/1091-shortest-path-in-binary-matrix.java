class Solution {
    int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
    int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

    public int shortestPathBinaryMatrix(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        boolean[][] vis = new boolean[n][m];
        return bfs(0, 0, n, m, arr, vis);
    }

    int bfs(int i, int j, int n, int m, int[][] arr, boolean[][] vis) {
        int cnt = 0;
        Queue<int[]> mq = new ArrayDeque<>();
        if (arr[i][j] == 1 || arr[n - 1][m - 1] == 1) return -1;
        mq.add(new int[] { i, j });
        vis[i][j] = true;
        while (mq.size() > 0) {
              int size = mq.size();
            for (int k = 0; k < size; k++) {
            int[] node = mq.poll();
            if (node[0] == n - 1 && node[1] == m - 1) return cnt+1 ;
            for (int x = 0; x < 8; x++) {
                int nrow = node[0] + dx[x];
                int ncol = node[1] + dy[x];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && arr[nrow][ncol] == 0) {
                    vis[nrow][ncol] = true;
                    mq.add(new int[] { nrow, ncol });
                }
              }
            }
            cnt++;
         
        }
        return -1;
    }
}
