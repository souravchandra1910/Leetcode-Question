class Solution {

    public int maxMoves(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int j = m - 2; j >= 0; j--) {
            for (int i = n - 1; i >= 0; i--) {
                if (i == 0) {
                    int max=-1;
                    if (arr[i + 1][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i + 1][j + 1], max);
                    }
                    if (arr[i][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i][j + 1], max);
                    }
                    dp[i][j]=max==-1?0:max + 1;
                } else if (i == n - 1) {
                    int max = -1;
                    if (arr[i - 1][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i - 1][j + 1], max);
                    }
                    if (arr[i][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i][j + 1], max);
                    }
                    dp[i][j]=max==-1?0:max + 1;
                } else {
                    int max = -1;
                    if (arr[i - 1][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i - 1][j + 1], max);
                    }
                    if (arr[i + 1][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i + 1][j + 1], max);
                    }
                    if (arr[i][j + 1] > arr[i][j]) {
                        max = Math.max(dp[i][j + 1], max);
                    }
                    dp[i][j]=max==-1?0:max + 1;
                }
            }
        }
        // for (int[] a : dp) System.out.println(Arrays.toString(a));
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}
