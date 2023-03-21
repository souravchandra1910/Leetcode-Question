class Solution {

    public int minPathSum(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                // if we are at the last cell
                if (i == n - 1 && j == m - 1) {
                    dp[i][j] = arr[i][j];
                }
                //if we are at the last row
                else if (i == n - 1) {
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                }
                //if we are at the last col
                else if (j == m - 1) {
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                }
                // else where
                else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][0];
    }
}
