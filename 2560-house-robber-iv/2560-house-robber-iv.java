class Solution {

    public int minCapability(int[] arr, int k) {
        int ans = 0;
        int low = 1, high = arr[0];
        for (int i = 1; i < arr.length; i++) high = Math.max(arr[i], high);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (blackBox(arr, mid, k) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean blackBox(int[] arr, int mid, int k) {
        int cnt = 0;
        int lastPicked = -2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) continue;
            if (i - lastPicked == 1) continue;
            cnt++;
            lastPicked = i;
        }
        return cnt >= k;
    }
}
