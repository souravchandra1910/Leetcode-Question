class Solution {

    public int minOperations(int[] nums, int x) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for (int val : nums) sum += val;
        int rem = sum - x;
        int n = nums.length;
        if (rem == 0) return n;
        hm.put(0, -1);
        int prefix = 0;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (hm.containsKey(prefix - rem) == true) {
                max = Math.max(max, i - hm.get(prefix - rem));
            }
            hm.put(prefix, i);
        }
        return max == -1 ? -1 : n - max;
    }
}
