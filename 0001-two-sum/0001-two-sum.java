class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int rem = target - nums[i];
            if (hm.containsKey(rem) == true && hm.get(rem) != i) {
                ans[0] = i;
                ans[1] = hm.get(rem);
                return ans;
            }
        }
        return ans;
    }
}
