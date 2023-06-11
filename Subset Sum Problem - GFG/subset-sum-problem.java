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
    static Boolean isSubsetSum(int n, int arr[], int tar){
   boolean[][] dp = new boolean[n + 1][tar + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= tar; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					dp[i][j] = true;
				} else {
					boolean pick = false;
					if (arr[i-1]<= j) {
						pick = dp[i - 1][j - arr[i-1]];
					}
					boolean notpick = dp[i - 1][j];
					dp[i][j] = pick || notpick;
				}
			}
		}
	  return dp[n][tar];
    }
}