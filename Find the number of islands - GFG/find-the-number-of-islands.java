//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    class Pair{
        int row,col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    // Function to find the number of islands.
 
    int[] dx = { -1, 0, 1, 0, -1, 1, -1, 1 };
    int[] dy = { 0, -1, 0, 1, 1, -1, -1, 1 };

    public int numIslands(char[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int cnt = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '1' && vis[i][j] == false) {
                    cnt++;
                    bfs(i, j, n, m, arr, vis);
                }
            }
        }
        return cnt;
    }
    
    void bfs(int ro,int co,int n,int m,char [][]arr,boolean [][]vis){
        Queue<Pair>mq=new ArrayDeque<>();
        vis[ro][co]=true;
        mq.add(new Pair(ro,co));
        
        while(mq.size()>0){
        Pair p=mq.poll();
        int row=p.row;
        int col=p.col;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int nrow=row+i;
                int ncol=col+j;
                
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && arr[nrow][ncol]=='1' && vis[nrow][ncol]==false){
                    vis[nrow][ncol]=true;
                    mq.add(new Pair(nrow,ncol));
                }
            }
        }
      }
  }
}
