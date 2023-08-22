class Solution {

    public int[] productExceptSelf(int[] nums) {
        int prd = 1;
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            prd = prd * nums[i];
            suf[i] = prd;
        }
        prd = nums[0];
        pre[0] = suf[1];
        for (int i = 1; i < n - 1; i++) {
            pre[i] = prd * suf[i + 1];
            prd *= nums[i];
        }
        pre[n - 1] = prd;
        return pre;
    }
}
