class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return AtMostK(nums, k) - AtMostK(nums, k - 1);
    }

    public int AtMostK(int[] nums, int k) {
        int cnt = 0;
        int i = 0, j = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            while (j <= i && hm.size() > k) {
                int freq = hm.get(nums[j]);
                if (freq == 1) {
                    hm.remove(nums[j]);
                } else {
                    hm.put(nums[j], freq - 1);
                }
                j++;
            }
            cnt += (i - j + 1);
        }

        return cnt;
    }
}
