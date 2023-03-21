class Solution {

    public long zeroFilledSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        long cnt = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                i++;
                continue;
            }
            if (nums[i] == 0) {
                j = i;
                while (i < nums.length && nums[i] == 0) {
                    i++;
                }
                long len = i - j;
                cnt += ((len * 1L * (len + 1))/2);
            }
        }
        return cnt;
    }
}
