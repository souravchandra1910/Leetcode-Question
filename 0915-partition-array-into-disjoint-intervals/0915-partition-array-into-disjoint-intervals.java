class Solution {

    public int partitionDisjoint(int[] arr) {
        int n = arr.length;
        int[] suffix_min = new int[n];
        int[] prefix_max = new int[n];
        suffix_min[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix_min[i] = Math.min(suffix_min[i + 1], arr[i]);
        }
        prefix_max[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_max[i] = Math.max(prefix_max[i - 1], arr[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            if (prefix_max[i] <= suffix_min[i + 1]) {
                // System.out.println(prefix_max[i] + "  " + suffix_min[i + 1]);
                return i + 1;
            }
        }
        return n;
    }
}
