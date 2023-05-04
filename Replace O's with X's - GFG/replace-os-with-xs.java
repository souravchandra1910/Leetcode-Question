//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[] dx = { -1, 0, 0, 1 };
    static int[] dy = { 0, -1, 1, 0 };
    static char[][] fill(int n, int m, char arr[][])
    {
      
        boolean[][] vis = new boolean[n][m];
        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 'O') {
                dfs(0, j, arr, vis, n, m);
            }
            if (arr[n - 1][j] == 'O') {
                dfs(n - 1, j, arr, vis, n, m);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 'O') {
                dfs(i, 0, arr, vis, n, m);
            }
            if (arr[i][m - 1] == 'O') {
                dfs(i, m - 1, arr, vis, n, m);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'O' && vis[i][j] == false) {
                    arr[i][j] = 'X';
                }
            }
        }
        return arr;
    }

   static void dfs(int i, int j, char[][] arr, boolean[][] vis, int n, int m) {
        vis[i][j] = true;
        for (int x = 0; x < 4; x++) {
            int nrow = i + dx[x];
            int ncol = j + dy[x];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && arr[nrow][ncol] == 'O') {
                dfs(nrow, ncol, arr, vis, n, m);
            }
        }
    }
}
 