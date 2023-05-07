class Solution {

    public int[] colorTheArray(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] arr = new int[n];
        int cnt = 0;
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][0];
            int color = queries[i][1];
            int left = idx > 0 ? idx - 1 : -1;
            int right = idx < n - 1 ? idx + 1 : -1;
            if (arr[idx] != 0) {
                if (left != -1 && arr[left] == arr[idx]) cnt--;
                if (right != -1 && arr[right] == arr[idx]) cnt--;
            }
            arr[idx] = color;
            if (left != -1 && arr[left] == arr[idx]) cnt++;
            if (right != -1 && arr[right] == arr[idx]) cnt++;
            ans[i] = cnt;
        }
        return ans;
    }
}
