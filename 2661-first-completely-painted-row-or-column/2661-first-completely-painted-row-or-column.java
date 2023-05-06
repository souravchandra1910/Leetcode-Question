class Solution {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length, m = mat[0].length;
        HashMap<Integer, int[]> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                hm.put(mat[i][j], new int[] { i, j });
            }
        }
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < arr.length; i++) {
            int[] d = hm.get(arr[i]);
            vis[d[0]][d[1]] = true;
            if (colored(vis, d[0], d[1], n, m) == true) return i;
        }
        return -1;
    }

    boolean colored(boolean[][] vis, int x, int y, int n, int m) {
        int ccnt = m, rcnt = n;
        for (int i = 0; i < m; i++) {
            if (vis[x][i] == true) ccnt--; else break;
        }
        for (int i = 0; i < n; i++) {
            if (vis[i][y] == true) rcnt--; else break;
        }
        return rcnt == 0 || ccnt == 0;
    }
}
