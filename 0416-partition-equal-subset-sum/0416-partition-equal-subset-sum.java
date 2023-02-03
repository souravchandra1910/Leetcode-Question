class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        if(sum%2==1)return false;
        
        int k=sum/2;
        int n=nums.length;
        int [][]dp=new int[n][k+1];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        return f(n-1,nums,k,dp);
    }
    
    private boolean f(int idx,int []arr,int k,int [][]dp){
        if(k==0)return true;
        
        if(idx==0)return arr[0]==k;
        
        if(dp[idx][k]!=-1)return dp[idx][k]==0?false:true;
        
        boolean notPick=f(idx-1,arr,k,dp);
        
        boolean pick=false;
        if(arr[idx]<=k){
            pick=f(idx-1,arr,k-arr[idx],dp);
        }
        boolean val= pick|| notPick;
        dp[idx][k]=(val==true?1:0);
        return val;
        
    }
    
}