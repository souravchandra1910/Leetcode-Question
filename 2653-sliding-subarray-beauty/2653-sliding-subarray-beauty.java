class Solution {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;
        int[] map = new int[50];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                int val = nums[i] + 50;
                map[val]++;
            }
            if (i - j + 1 == k) {
                int cnt = 0;
                boolean flag = true;
                for (int a = 0; a < 50; a++) {
                    if (map[a] != 0) {
                        if (map[a] + cnt >= x) {
                            ans[idx++] = a - 50;
                            flag = false;
                            cnt = 0;
                            break;
                        } else {
                            cnt += map[a];
                        }
                    }
                }
                if (flag) {
                    ans[idx++] = 0;
                    cnt = 0;
                }
                if (nums[j] < 0) {
                    int val = nums[j] + 50;
                    map[val]--;
                }
                j++;
            }
        }
        return ans;
    }
}
