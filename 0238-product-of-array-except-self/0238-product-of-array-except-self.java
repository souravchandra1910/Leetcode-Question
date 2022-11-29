class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] rprd = new int[n];
        int prd = 1;
        for (int i = n - 1; i >= 0; i--) {
            prd *= nums[i];
            rprd[i] = prd;
        }

        int[] ans = new int[n];

        int lprd = 1;
        for (int i = 0; i < n - 1; i++) {
            int lt = lprd;
            int rt = rprd[i + 1];
            ans[i] = lt * rt;
            lprd *= nums[i];
        }
        ans[n - 1] = lprd;

        return ans;
    }
}
