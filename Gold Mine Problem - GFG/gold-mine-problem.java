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
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int arr[][])
    {
        //  for(int []a:arr){
        //     System.out.println(Arrays.toString(a));
        // }
        // System.out.println("---------");
        int [][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            dp[i][m-1]=arr[i][m-1];
        }
        
       for(int j=m-2;j>=0;j--){
           for(int i=0;i<n;i++){
               if(i==0){
                   int v1=dp[i][j+1];
                   int v2=0;
                   if(i+1<n){
                      v2=dp[i+1][j+1];
                   }
                   dp[i][j]=arr[i][j]+Math.max(v1,v2); 
               }else if(i==n-1){
                   int v1=dp[i][j+1];
                   int v2=0;
                   if(i-1>=0){
                      v2=dp[i-1][j+1];
                   }
                   dp[i][j]=arr[i][j]+Math.max(v1,v2); 
               }else{
                   int v1=dp[i][j+1];
                   int v2=0;
                   int v3=0;
                   if(i-1>=0){
                      v2=dp[i-1][j+1];
                   }
                   if(i+1<n){
                      v3=dp[i+1][j+1];
                   }
                   dp[i][j]=arr[i][j]+Math.max(v3,Math.max(v1,v2));   
               }
              }
           }
         
        // for(int []a:dp){
        //     System.out.println(Arrays.toString(a));
        // }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i][0]);
        }
        return max;
    }
}