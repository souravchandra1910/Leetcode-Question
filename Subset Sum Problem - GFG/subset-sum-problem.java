//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
         boolean [][]dp=new boolean [N][sum+1];
         
         for(int i=0;i<N;i++)dp[i][0]=true;
         
         dp[0][arr[0]]=true;
         
         for(int idx=1;idx<N;idx++){
             for(int tar=1;tar<=sum;tar++){
                  boolean notpick=dp[idx-1][tar];
                  boolean pick=false;
                  if(arr[idx]<=tar){
                      pick=dp[idx-1][tar-arr[idx]];
                  }
                  dp[idx][tar]=pick||notpick;
             }
             
         }
         return dp[N-1][sum];
         
    }
}