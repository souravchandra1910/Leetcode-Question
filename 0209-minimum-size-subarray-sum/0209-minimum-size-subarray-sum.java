class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minLen=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>=target){
               while(sum>=target){
                   int len=i-j+1;
                   if(minLen==0 || len<minLen){
                       minLen=len;
                   }
                   sum-=nums[j++];
               } 
            }else{
                continue;
            }
        }
        return minLen;
   
    }
}
