//{ Driver Code Starts
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
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   
    int countDistinctIslands(int[][] g) {
       int r=g.length;
        int c=g[0].length;
        Set<List<Integer>> set=new HashSet<>();
        
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(g[i][j]==1){
                    List<Integer> l=new ArrayList<>();
                    dfs(g,i,j,i,j,r,c,l);
                    set.add(l);
                }
            }
        }
        return set.size();
    }
    void dfs(int[][] g,int i,int j,int bi,int bj,int r,int c,List<Integer> l){
        if(i<0 || i>=r ||j<0 || j>=c || g[i][j]==0){
            return ;
        }
        g[i][j]=0;

        l.add(i-bi);l.add(j-bj);
        dfs(g,i+1,j,bi,bj,r,c,l);
        dfs(g,i-1,j,bi,bj,r,c,l);
        dfs(g,i,j-1,bi,bj,r,c,l);
        dfs(g,i,j+1,bi,bj,r,c,l);

    }
}