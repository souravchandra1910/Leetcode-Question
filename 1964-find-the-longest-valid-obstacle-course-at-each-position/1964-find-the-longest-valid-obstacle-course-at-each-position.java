class Solution {

    public int[] longestObstacleCourseAtEachPosition(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n + 1];
        Arrays.fill(lis, Integer.MAX_VALUE);
        lis[0] = Integer.MIN_VALUE;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int cur = nums[i];

            int left = 0;
            int right = n;
            int insert_idx = 1;

          
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (cur >= lis[mid]) {
                    insert_idx = Math.max(insert_idx, mid + 1);
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            lis[insert_idx] = cur;
            res[i] = insert_idx;
        }
        return res;
    }
}
