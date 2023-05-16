class Solution {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] map = new int[50];
        int j = 0, idx = 0;
        int n = nums.length;

        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                map[nums[i] + 50]++;
            }
            if (i - j + 1 == k) {
                int cnt = 0;
                boolean flag = false;
                for (int a = 0; a < 50; a++) {
                    if (cnt + map[a] >= x) {
                        ans[idx++] = a - 50;
                        cnt = 0;
                        flag = true;
                        break;
                    } else {
                        cnt += map[a];
                    }
                }
                if (flag == false) ans[idx++] = 0;
                if (nums[j] < 0) {
                    map[nums[j] + 50]--;
                }
                j++;
            }
        }
        return ans;
    }
}
