class Solution {

    public int shipWithinDays(int[] arr, int days) {
        int low = 0, high = 0;
        for (int i = 0; i < arr.length; i++) {
            low = Math.max(arr[i], low);
            high += arr[i];
        }
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (blackBox(arr, mid/*capacity we will be carrying everyday*/, days) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean blackBox(int[] arr, int estimated_capacity, int days) {
        int cnt = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > estimated_capacity) return false;
            sum += arr[i];
            if (sum > estimated_capacity) {
                sum = arr[i];
                cnt++;
            }
        }
        return cnt <= days;
    }
}
