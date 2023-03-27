class Solution {

    public int minPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                //we are in last cell
                if (i == n - 1 && j == m - 1) {
                    dp[i][j] = arr[i][j];
                }
                // we are in the last column
                else if (j == m - 1) {
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                }
                // we are last row;
                else if (i == n - 1) {
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                }
                // else where
                else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
