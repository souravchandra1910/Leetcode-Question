class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int c1=0;
        int c2=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)c2++;
            else c1++;
            if(c1==2){
                while(c1>1){
                    if(nums[j]==1){
                        c2--;
                    }else c1--;
                    j++;
                }
                
            }
            max=Math.max(max,i-j+1);
        }
        return max-1;
    }
}