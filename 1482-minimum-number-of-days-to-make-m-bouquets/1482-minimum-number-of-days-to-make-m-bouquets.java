class Solution {

    public int minDays(int[] arr, int m, int k) {
        if (m *1L* k > arr.length) return -1;
        int low = arr[0], high = arr[0];
        for (int i = 0; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, mid, m, k) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] arr, int mid, int m, int k) {
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                cnt++;
            } else {
                ans += (cnt / k);
                cnt = 0;
            }
        }
        ans += (cnt / k);
        return ans >= m;
    }
}
