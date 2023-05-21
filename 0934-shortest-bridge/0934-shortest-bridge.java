class Solution {
   public int shortestBridge(int[][] A) {
        Queue<int[]> queue = new LinkedList<>();
        boolean flag=false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    dfs(i, j, queue, A);
                    flag=true;
                    break;
                }
            }
            if(flag) break;
        }
        int step = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] dir : dirs) {
                    int x = dir[0] + point[0];
                    int y = dir[1] + point[1];
                    if (x >= 0 && y >= 0 && x < A.length && y < A[0].length && A[x][y] != -1) {
                        if (A[x][y] == 1) return step;
                        queue.offer(new int[]{x, y});
                        A[x][y] = -1;
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public void dfs(int x, int y, Queue<int[]> queue, int[][] A) {
        if (x < 0 || y < 0 || x == A.length || y == A[0].length || A[x][y] != 1) return;
        queue.offer(new int[]{x, y});
        A[x][y] = -1;
        dfs(x + 1, y, queue, A);
        dfs(x - 1, y, queue, A);
        dfs(x, y + 1, queue, A);
        dfs(x, y - 1, queue, A);
    }
}