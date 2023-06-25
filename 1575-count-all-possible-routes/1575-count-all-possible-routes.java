class Solution {
     int MOD = (int)1e9 + 7;
    public int countRoutes(int[] locations, int start, int finish, int fuel) {

        int l = locations.length;
        int[][] dp = new int[l + 1][fuel + 1];
        for(int[] num : dp){
            Arrays.fill(num, -1);
        } 
        return helper(locations, start, finish, fuel, dp);
    }

    private int helper(int[] locations, int start, int finish, int fuel, int[][] dp) {
        int result = 0;
        
        if(fuel < 0) return result;
        
        if(dp[start][fuel] != -1) return dp[start][fuel];
        
        if(start == finish) result++;
        
        for(int i = 0; i < locations.length; i++) {
            if(i == start) continue;
            int fuelConsumed = Math.abs(locations[start] - locations[i]);
            result += helper(locations, i, finish, fuel - fuelConsumed, dp);
            result %= MOD;
        }
        
        dp[start][fuel] = result;
        return result;
    }
}