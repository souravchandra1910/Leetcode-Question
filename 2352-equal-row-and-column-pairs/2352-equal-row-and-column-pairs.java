class Solution {

    public int equalPairs(int[][] arr) {
        int r = 0, c = 0, n = arr.length;
        int ans = 0;
        while (c < n) {
            r = 0;
            while (r < n) {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[r][i] == arr[i][c]) {
                        cnt++;
                    } else {
                        break;
                    }
                    if (cnt == n) {
                        ans++;
                    }
                }
                r++;
            }
            c++;
        }
        return ans;
    }
}
