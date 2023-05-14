class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, k = n - 1; i <= j;) {
            int sq1 = nums[i] * nums[i];
            int sq2 = nums[j] * nums[j];
            if (sq1 > sq2) {
                ans[k] = sq1;
                i++;
                k--;
            } else {
                ans[k] = sq2;
                k--;
                j--;
            }
        }
        return ans;
    }
}
