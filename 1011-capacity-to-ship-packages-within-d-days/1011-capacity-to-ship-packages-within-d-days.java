class Solution {

    public int shipWithinDays(int[] arr, int d) {
        int low = arr[0], high = 0;
        int ans = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            high += arr[i];
            low = Math.min(low, arr[i]);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(arr, mid, n, d) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canShip(int[] arr, int mid, int n, int d) {
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mid) return false;
            sum += arr[i];
            if (sum > mid) {
                cnt++;
                sum = arr[i];
            }
        }
        return cnt <= d;
    }
}
