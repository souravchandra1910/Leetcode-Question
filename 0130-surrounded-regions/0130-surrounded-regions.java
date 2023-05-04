class Solution {
    int[] dx = { -1, 0, 0, 1 };
    int[] dy = { 0, -1, 1, 0 };

    public void solve(char[][] arr) {
        int n = arr.length, m = arr[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 'O') {
                dfs(0, j, arr, vis, n, m);
            }
            if (arr[n - 1][j] == 'O') {
                dfs(n - 1, j, arr, vis, n, m);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 'O') {
                dfs(i, 0, arr, vis, n, m);
            }
            if (arr[i][m - 1] == 'O') {
                dfs(i, m - 1, arr, vis, n, m);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'O' && vis[i][j] == false) {
                    arr[i][j] = 'X';
                }
            }
        }
    }

    void dfs(int i, int j, char[][] arr, boolean[][] vis, int n, int m) {
        vis[i][j] = true;
        for (int x = 0; x < 4; x++) {
            int nrow = i + dx[x];
            int ncol = j + dy[x];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && arr[nrow][ncol] == 'O') {
                dfs(nrow, ncol, arr, vis, n, m);
            }
        }
    }
}
