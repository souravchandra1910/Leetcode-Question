class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>al=new ArrayList<>();
        if(nums.length==1){
            al.add(nums[0]+"");
        return al;
                         }
        for(int i=0;i<nums.length;i++){
           int num=nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            if(num!=nums[i]){
                al.add(num +"->"+nums[i]);
            }else al.add(nums[i]+"");
        }
        return al;
    }
}