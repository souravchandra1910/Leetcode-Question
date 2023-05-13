class Solution {

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) == true) {
                cnt += hm.get(nums[i]);
            }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        return cnt;
    }
}
