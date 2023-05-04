//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{ int[] dx = { -1, 0, 0, 1 };
    int[] dy = { 0, -1, 1, 0 };

    class Pair {
        int row, col, dis;

        Pair(int row, int col, int dis) {
            this.row = row;
            this.col = col;
            this.dis = dis;
        }
    }
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] mat)
    {
      
        int n = mat.length, m = mat[0].length;
        int[][] ans = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> mq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    vis[i][j] = true;
                    mq.add(new Pair(i, j, 0));
                }
            }
        }

        while (mq.size() > 0) {
            Pair p = mq.poll();
            int row = p.row;
            int col = p.col;
            int dis = p.dis;
            ans[row][col] = dis;
            for (int i = 0; i < 4; i++) {
                int nrow = row + dx[i];
                int ncol = col + dy[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && mat[nrow][ncol] == 0) {
                    vis[nrow][ncol] = true;
                    mq.add(new Pair(nrow, ncol, dis+1));
                }
            }
        }
        return ans;
    

    }
}