class Solution {
    int []dp=new int[1000];
    public int climbStairs(int n) {
      if(n<0)return 0;
      if(n==0)return 1;
      if(dp[n]!=0)return dp[n];
      int lt=climbStairs(n-1);
      int rt=climbStairs(n-2);
      return dp[n]=lt+rt;
    }
}
