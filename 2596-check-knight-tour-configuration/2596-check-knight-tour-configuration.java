class Solution {
    int[] dx = { -2, -2, -1, 1, 2, 2, 1, -1 };
    int[] dy = { -1, 1, 2, 2, 1, -1, -2, -2 };

    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        int row = 0, col = 0;
        int val = 0;
        int max=n*n-1;
          while(true){
                int prev=val;
                for (int i = 0; i < 8; i++) {
                    int nrow = dx[i] + row;
                    int ncol = dy[i] + col;
                    if ((nrow >= 0 && nrow < n) && (ncol >= 0 && ncol < n)) {
                        if (grid[nrow][ncol] == val + 1) {
                            row = nrow;
                            col = ncol;
                            val++;
                            break;
                        }
                    }
                }
            if(val!=prev+1)return false;
             
             if(val==max)return true;
          }
        
        
    }
}
