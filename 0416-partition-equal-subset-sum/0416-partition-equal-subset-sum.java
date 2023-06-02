class Solution {

    public boolean canPartition(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) total += nums[i];
        int sum = total / 2;
        if (sum + sum != total) return false;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0 && j == 0) dp[i][j] = true; else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (nums[i - 1] <= j) {
                        int rem = j - nums[i - 1];
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][rem];
                    } else dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
