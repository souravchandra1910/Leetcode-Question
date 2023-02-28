class Solution {

    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        if (n <= 1) return new int[]{0};
        int[] a = new int[n];
        int[] b = new int[n];
        a[1] = nums[0];
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + nums[i - 1];
        }

        System.out.println(Arrays.toString(a));
        b[n - 2] = nums[n - 1];
        for (int i = n - 3; i >= 0; i--) {
            b[i] = b[i + 1] + nums[i + 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(a[i] - b[i]);
        }
        System.out.println(Arrays.toString(b));
        return ans;
    }
}
