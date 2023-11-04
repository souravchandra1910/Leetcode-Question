class Solution {

    public int minFallingPathSum(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }
        // System.out.println(Arrays.toString(dp[n - 1]));

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    int v1 = dp[i + 1][j];
                    int v2 = 0;
                    if (j + 1 < m) {
                        v2 = dp[i + 1][j + 1];
                    }
                    dp[i][j] = arr[i][j] + Math.min(v1, v2);
                } else if (j == m - 1) {
                    int v1 = dp[i + 1][j];
                    int v2 = 0;
                    if (j - 1 >= 0) {
                        v2 = dp[i + 1][j - 1];
                    }
                    dp[i][j] = arr[i][j] + Math.min(v1, v2);
                } else {
                    int v1 = dp[i + 1][j];
                    int v2 = 0;
                    int v3 = 0;
                    if (j - 1 >= 0) {
                        v2 = dp[i + 1][j - 1];
                    }
                    if (j + 1 < m) {
                        v3 = dp[i + 1][j + 1];
                    }
                    dp[i][j] = arr[i][j] + Math.min(v3, Math.min(v1, v2));
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            min = Math.min(min, dp[0][i]);
        }
        return min;
    }
}
