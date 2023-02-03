class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        if (sum % 2 == 1) return false;

        int k = sum / 2;
        int n = nums.length;
        // int [][]dp=new int[n][k+1];
        // for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        // return f(n-1,nums,k,dp);
        return tab(n, k, nums);
    }

    private boolean f(int idx, int[] arr, int k, int[][] dp) {
        if (k == 0) return true;

        if (idx == 0) return arr[0] == k;

        if (dp[idx][k] != -1) return dp[idx][k] == 0 ? false : true;

        boolean notPick = f(idx - 1, arr, k, dp);

        boolean pick = false;
        if (arr[idx] <= k) {
            pick = f(idx - 1, arr, k - arr[idx], dp);
        }
        boolean val = pick || notPick;
        dp[idx][k] = (val == true ? 1 : 0);
        return val;
    }

    private boolean tab(int n, int k, int[] arr) {
        boolean[][] dp = new boolean[n][k + 1];
        for (int i = 0; i < n; i++) dp[i][0] = true;
        if (arr[0] == k) dp[0][k] = true;

        for (int idx = 1; idx < n; idx++) {
            for (int tar = 1; tar <= k; tar++) {
                boolean notPick = dp[idx - 1][tar];

                boolean pick = false;
                if (arr[idx] <= tar) {
                    pick = dp[idx - 1][tar - arr[idx]];
                }
                boolean val = pick || notPick;
                dp[idx][tar] = val;
            }
        }
        return dp[n - 1][k];
    }
}
