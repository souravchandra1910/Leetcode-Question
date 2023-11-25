class Solution {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i] + suffix[i + 1];
        }
        int prefix = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            int val = Math.abs((nums[i] * idx) - prefix);
            int v = Math.abs(val + suffix[i] - (n - i) * nums[i]);
            ans[i] = v;
            // System.out.println(val + "   " + v + "  " + i + "  " + n + "   " + nums[i]);
            prefix += nums[i];
            idx++;
        }
        return ans;
    }
}
