//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] dx = { -1, 0, 0, 1 };
    int[] dy = { 0, -1, 1, 0 };
    public class Pair{
	int x,y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;
	 }
  }
    int numberOfEnclaves(int[][] arr) {
     Queue<Pair>mq=new ArrayDeque<>();
     int n=arr.length,m=arr[0].length;
     boolean[][] vis = new boolean[n][m];
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             if(i==0 || j==0 || j==m-1 || i==n-1){
                 if(arr[i][j]==1 && vis[i][j]==false){
                     vis[i][j]=true;
                     mq.add(new Pair(i,j));
                 }
             }
         }
       }
       while (mq.size() > 0) {
            Pair p = mq.poll();
            int row = p.x;
            int col = p.y;
            for (int i = 0; i < 4; i++) {
                int nrow = row + dx[i];
                int ncol = col + dy[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && arr[nrow][ncol] == 1) {
                    vis[nrow][ncol] = true;
                    mq.add(new Pair(nrow, ncol));
                }
            }
        }
        
        int ans=0;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(arr[i][j]==1 && vis[i][j]==false){
                    ans++;
                }
            }
        }
        return ans;
    }
}