class Solution {

    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                ones++;
            }
        }
        if (ones> 0) {
            return n - ones;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int j = i + 1; j < n; j++) {
                num = gcd(num, nums[j]);
                if (num == 1) {
                    ans = Math.min(ans, j - i);
                    break;
                }
            }
            if (num != 1) {
                break;
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return n - 1 + ans;
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
