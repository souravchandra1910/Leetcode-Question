class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            int v1 = count(mat, i);
            pq.add(new int[] { i, v1 });
        }
        int[] ans = new int[k];
        int idx = 0;
        while (k-- > 0) {
            ans[idx++] = pq.poll()[0];
        }
        return ans;
    }

    private int count(int[][] mat, int r) {
        int cnt = 0;
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[r][i] == 1) cnt++;
        }
        return cnt;
    }
}
