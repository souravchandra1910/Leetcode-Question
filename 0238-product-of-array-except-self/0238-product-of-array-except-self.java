class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }
        int prd = nums[0];
        ans[0] = suffix[1];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = prd * suffix[i + 1];
            prd *= nums[i];
        }
        ans[n - 1] = prd;
        return ans;
    }
}
