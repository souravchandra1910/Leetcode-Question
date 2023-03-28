class Solution {

    public int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        if (arr[n - 1][m - 1] == 1) return 0;
        int[][] dp = new int[n][m]; // 0,0 se n-1,m-1 jane ke paths
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                //we are the last cell
                if (i == n - 1 && j == m - 1) {
                    dp[i][j] = 1;
                }
                // if we are at the last column
                else if (j == m - 1 && arr[i][j] != 1) {
                    dp[i][j] = dp[i + 1][j];
                }
                //  if we are at the last row
                else if (i == n - 1 && arr[i][j] != 1) {
                    dp[i][j] = dp[i][j + 1];
                }
                // else where

                else {
                    if (arr[i][j] != 1) dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
                }
            }
        }
        // for(int i=0;i<n;i++)System.out.println(Arrays.toString(dp[i]));
        return dp[0][0];
    }
}
