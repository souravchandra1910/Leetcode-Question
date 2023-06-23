class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy_day=0;
        int sell_day=0;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>=prices[i-1]){
                sell_day++;
            }else{
                profit+=prices[sell_day]-prices[buy_day];
                buy_day=sell_day=i;
            }
        }
        profit+=prices[sell_day]-prices[buy_day];
        return profit;
    }
}