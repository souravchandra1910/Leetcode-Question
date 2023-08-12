class Solution {

    public int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                //if i am at the last cell
                if (i == n - 1 && j == m - 1) {
                    if (arr[i][j] == 0) dp[i][j] = 1;
                }
                //if i am at the last column
                else if (j == m - 1) {
                    if (arr[i][j] == 0) dp[i][j] = dp[i + 1][j];
                } else if (i == n - 1) {
                    if (arr[i][j] == 0) dp[i][j] = dp[i][j + 1];
                } else {
                    if (arr[i][j] == 0) dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}
