class Solution {

    public int coinChange(int[] arr, int tar) {
        int[] dp = new int[tar + 1];
        dp[0] = 0;
        for (int i = 1; i <= tar; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    int val = dp[i - arr[j]];
                    if (val != -1) min = Math.min(val, min);
                }
                dp[i] = min == Integer.MAX_VALUE ? -1 : min + 1;
            }
        }
        return dp[tar];
    }
}
