class Solution {
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, -1, 0, 1 };

    public int closedIsland(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int cnt = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i * j == 0 || i == n - 1 || j == m - 1) {
                    if (arr[i][j] == 0) {
                        dfs(i, j, n, m, arr, vis);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 && vis[i][j] == false) {
                    cnt++;
                    dfs(i, j, n, m, arr, vis);
                }
            }
        }
        return cnt;
    }

    void dfs(int i, int j, int n, int m, int[][] arr, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j] == true || arr[i][j] == 1) return;

        vis[i][j] = true;

        for (int x = 0; x < 4; x++) {
            dfs(i + dx[x], j + dy[x], n, m, arr, vis);
        }
    }
}
