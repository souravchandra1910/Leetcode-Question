class Solution {

    public int minOperations(int n) {
        int[] dp = new int[21];
        dp[0] = 1;
        for (int i = 1; i < 21; i++) {
            dp[i] = 1 << i;
        }
        int min = Integer.MAX_VALUE;
        boolean ne = false;
        int cnt = 0;
        while (n > 0) {
            cnt++;
            for (int i = 0; i < 21; i++) {
                int diff = Math.abs(dp[i] - n);
                if (min > diff) {
                    min = diff;
                }
            }
            n = min;
        }

        return cnt;
    }
}
