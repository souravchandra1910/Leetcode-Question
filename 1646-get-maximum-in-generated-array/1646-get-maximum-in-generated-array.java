class Solution {

    public int getMaximumGenerated(int n) {
        int[] dp = new int[n + 1];
        int max=0;
        dp[0] = 0;
        if (n >= 1) {
            dp[1] = 1;
            max=Math.max(dp[1],max);
        }
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2];
            } else {
                dp[i] = dp[i / 2] + dp[i / 2 + 1];
            }
            max=Math.max(dp[i],max);
        }
       
        return max;
    }
}