class Solution {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int curr_val = arr[i];
            ans[i] = max;
            if (curr_val >= max) {
                max = curr_val;
            }
        }

        return ans;
    }
}
