class Solution {

    public int trap(int[] arr) {
        if (arr.length <= 1) return 0;
        int n = arr.length;
        int[] lt = new int[n];
        int[] rt = new int[n];
        lt[0] = arr[0];
        rt[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            lt[i] = Math.max(lt[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rt[i] = Math.max(rt[i + 1], arr[i]);
        }

        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            area += Math.min(lt[i], rt[i]) - arr[i];
        }
        return area;
    }
}
