class Solution {

    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (grid[i][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i][j + 1]);
                    if (grid[i + 1][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i + 1][j + 1]);
                } else if (i == n - 1) {
                    if (grid[i - 1][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j + 1]);
                    if (grid[i][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i][j + 1]);
                } else {
                    if (grid[i - 1][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j + 1]);
                    if (grid[i][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i][j + 1]);
                    if (grid[i + 1][j + 1] > grid[i][j]) dp[i][j] = Math.max(dp[i][j], 1 + dp[i + 1][j + 1]);
                }
            }
        }
         for (int[] a : dp) System.out.println(Arrays.toString(a));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i][0]);
        }
        return ans;
    }
}
