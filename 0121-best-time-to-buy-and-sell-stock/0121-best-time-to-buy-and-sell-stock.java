class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_costPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            min_costPrice=Math.min(min_costPrice,prices[i]);
            max_profit=Math.max(prices[i]-min_costPrice,max_profit);
        }
        return max_profit;
    }
}