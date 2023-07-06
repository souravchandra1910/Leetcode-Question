class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int low = 1;
        int high = nums.length;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (blackBox(nums, nums.length, mid, target) == true) {
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean blackBox(int[] nums, int n, int k, int target) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        if (sum >= target) return true;
        int j = 0;
        for (int i = k; i < n; i++) {
            sum -= nums[j++];
            sum += nums[i];
            if (sum >= target) return true;
        }
        return false;
    }
}
