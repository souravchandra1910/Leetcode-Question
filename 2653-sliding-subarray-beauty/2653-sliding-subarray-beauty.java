class Solution {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int idx = 0;
        for (int i = k - 1; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            int cnt = 0;
            for (int j = -50; j <= 50; j++) {
                cnt += hm.getOrDefault(j, 0);
                if (cnt >= x) {
                    if (j > 0) ans[idx++] = 0; else {
                        ans[idx++] = j;
                    }
                    break;
                }
            }
            int freq = hm.get(nums[i - k + 1]);
            if (freq == 1) hm.remove(nums[i - k + 1]); else hm.put(nums[i - k + 1], freq - 1);
        }
        return ans;
    }
}
