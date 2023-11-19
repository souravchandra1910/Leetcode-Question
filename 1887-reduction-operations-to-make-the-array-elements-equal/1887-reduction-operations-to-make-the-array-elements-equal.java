class Solution {

    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prevIdx = n - 1;
        int cnt = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] == nums[i]) continue; else {
                cnt += (prevIdx - i);
            }
        }
        return cnt;
    }
}
