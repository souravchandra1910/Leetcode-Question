class Solution {
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, -1, 0, 1 };

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int [][]ans=image;
        int ic=image[sr][sc];
        dfs(ans,sr,sc,n,m,ic,color);
        return image;
    }

    void dfs(int[][] image, int i, int j, int n, int m, int ic, int color) {
         if (i < 0 || j < 0 || i >= n || j >= m || image[i][j] != ic || image[i][j]==color) return;

         image[i][j] = color;
         for (int x = 0; x < 4; x++) {
            dfs(image, i + dx[x], j + dy[x], n, m, ic, color);
        }
    }
}
