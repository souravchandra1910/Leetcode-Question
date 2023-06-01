class Solution {

    public int findNumbers(int[] nums) {
        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            int val=(int)Math.log10(nums[i])+1;
            if(val%2==0)cnt++;
        }
        return cnt;
    }
}
