class Solution {

    public long putMarbles(int[] arr, int k) {
        int n = arr.length;
        long[] pairs = new long[n - 1];
        for (int i = 1; i < n; i++) {
            pairs[i - 1] = arr[i - 1] + arr[i];
        }
        Arrays.sort(pairs);
        long min = 0;
        long max = 0;
        for (int i = 0; i < k - 1; i++) {
            min += pairs[i];
            max += pairs[n - i - 2];
        }
        return max - min;
    }
}
