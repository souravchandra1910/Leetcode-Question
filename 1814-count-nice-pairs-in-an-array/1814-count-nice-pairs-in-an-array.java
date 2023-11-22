class Solution {

    public int countNicePairs(int[] nums) {
        int m = 1_000_000_007;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int val : nums) {
            int pair = val - reverse(val);
            if (hm.containsKey(pair) == true) {
                int freq = hm.get(pair);
                freq = freq % m;
                ans = ans + freq;
                ans = ans % m;
            }
            hm.put(pair, hm.getOrDefault(pair, 0) + 1);
        }
        return ans;
    }

    private int reverse(int n) {
        int temp = n;
        int val = 0;
        while (temp > 0) {
            val = val * 10 + temp % 10;
            temp /= 10;
        }
        return val;
    }
}
// nums[i]-nums[j]==rev(nums[i])-rev(nums[j]);
// nums[i]-rev(nums[i])=nums[j]-rev(nums[j]);
