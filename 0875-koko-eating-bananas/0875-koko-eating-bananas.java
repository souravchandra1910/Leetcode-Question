class Solution {

    public int minEatingSpeed(int[] arr, int h) {
        long low = 1;
        long high = 0;
        for (int i = 0; i < arr.length; i++) high += arr[i];

        // System.out.println(high);
        long ans = 1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canEat(arr, mid, h) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }

    private boolean canEat(int[] arr, long mid, int h) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i] / mid;
            if (arr[i] % mid != 0) cnt++;
        }
        return cnt <= h;
    }
}
