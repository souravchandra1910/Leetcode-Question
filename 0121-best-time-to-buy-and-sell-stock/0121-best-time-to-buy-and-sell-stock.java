class Solution {

    public int maxProfit(int[] prices) {
        int min_cp = prices[0];
        int max_sp = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            max_sp = Math.max(max_sp, prices[i] - min_cp);
            min_cp = Math.min(min_cp, prices[i]);
        }
        return max_sp < 0 ? 0 : max_sp;
    }
}
