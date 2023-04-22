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
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    
    int []dx={0,-1,0,1};
    int []dy={-1,0,1,0};
    class Pair{
        int row,col,time;
        Pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
       int fresh=0;
       int tm=0;
       int n=grid.length;
       int m=grid[0].length;
       Queue<Pair>mq=new ArrayDeque<>();
       boolean [][]vis=new boolean[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(grid[i][j]==2){
                  mq.add(new Pair(i,j,0)); 
                  vis[i][j]=true;
               }else if(grid[i][j]==1){
                   fresh++;
               }
           }
       }
       int cnt=0;
       while(mq.size()>0){
           Pair p=mq.poll();
           int row=p.row;
           int col=p.col;
           int time=p.time;
           tm=Math.max(tm,time);
           for(int x=0;x<4;x++){
               int nrow=row+dx[x];
               int ncol=col+dy[x];
               if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==false){
                   vis[nrow][ncol]=true;
                   mq.add(new Pair(nrow,ncol,time+1));
                   cnt++;
               }
           }
       }
       if(cnt!=fresh)return -1;
       return tm;
    }
}