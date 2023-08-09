class Solution {

    public int minimizeMax(int[] v, int p) {
        int n = v.length;
        Arrays.sort(v);
        int lo = -1, hi = 1000000007;
        while (lo < hi - 1) {
            int mid = lo + (hi - lo) / 2;
            int a = 0;
            for (int i = 1; i < n; i++) {
                if (v[i] - v[i - 1] <= mid) {
                    i++;
                    a++;
                }
            }
            if (a >= p) {
                hi = mid;
            } else lo = mid;
        }
        return hi;
    }
}
