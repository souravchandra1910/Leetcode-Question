class Solution {

    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int x = points[0][0];
        int y = points[0][1];
        if (n == 1) return 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int x_diff = Math.abs(points[i][0] - x);
            int y_diff = Math.abs(points[i][1] - y);

            ans += Math.max(x_diff, y_diff);

            x = points[i][0];
            y = points[i][1];
        }
        return ans;
    }
}
