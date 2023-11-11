class Solution {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] map = new int[101];
        for (int i = 0; i < k - 1; i++) {
            map[nums[i] + 50]++;
        }
        int idx = 0;
        for (int i = k - 1; i < n; i++) {
            map[nums[i] + 50]++;
            int cnt = 0;
            for (int j = -50; j <= 50; j++) {
                cnt += map[j + 50];
                if (cnt >= x) {
                    if (j > 0) ans[idx++] = 0; else {
                        ans[idx++] = j;
                    }
                    break;
                }
            }
            map[nums[i - k + 1] + 50]--;
        }
        return ans;
    }
}
