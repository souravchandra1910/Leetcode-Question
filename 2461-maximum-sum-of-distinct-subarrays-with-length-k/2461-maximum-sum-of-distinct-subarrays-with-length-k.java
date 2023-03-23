class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }
        long max = 0;
        if (hm.size() == k) max = sum;
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            int freq = hm.get(nums[j]);
            if (freq == 1) {
                hm.remove(nums[j]);
            } else {
                hm.put(nums[j], freq - 1);
            }
            sum -= nums[j++];
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
            if (hm.size() == k) {
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
