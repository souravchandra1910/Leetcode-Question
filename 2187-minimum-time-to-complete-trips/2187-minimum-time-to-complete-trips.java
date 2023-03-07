class Solution {

    public long minimumTime(int[] time, int totalTrips) {
        return minTime(time, time.length, totalTrips);
    }

    static long findItems(int[] arr, int n, long temp) {
        long ans = 0;
        for (int i = 0; i < n; i++) ans += (temp / arr[i]);
        return ans;
    }

    static long bs(int[] arr, int n, int m, long high) {
        long low = 1;

        while (low < high) {
            long mid = (low + high) >> 1;

            long itm = findItems(arr, n, mid);

            if (itm < m) low = mid + 1; else high = mid;
        }

        return high;
    }

    static long minTime(int[] arr, int n, int m) {
        long maxval = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) maxval = Math.max(maxval, arr[i]);

        return bs(arr, n, m, maxval * m);
    }
}
