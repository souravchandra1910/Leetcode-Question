class Solution {

    public int subarrayGCD(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int g = 0;
            for (int j = i; j < nums.length; j++) {
                g = gcd(g, nums[j]);
                if (g == k) cnt++;
            }
        }
        return cnt;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
