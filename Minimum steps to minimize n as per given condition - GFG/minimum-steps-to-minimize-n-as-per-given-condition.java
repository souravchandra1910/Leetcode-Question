//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minSteps(n));
                    
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minSteps(int n) 
	{ 
	    int []dp=new int[n+1];
	    if(n>=1)dp[1]=0;
	    if(n>=2)dp[2]=1;
	    if(n>=3)dp[3]=1;
	    for(int i=4;i<=n;i++){
	        if(i%2==0 && i%3==0){
	            dp[i]=1+Math.min(dp[i/2],Math.min(dp[i/3],dp[i-1]));
	        }
	        else if(i%2==0){
	            dp[i]=1+Math.min(dp[i/2],dp[i-1]);
	        }else if(i%3==0){
	             dp[i]=1+Math.min(dp[i/3],dp[i-1]);
	        }else{
	            dp[i]=1+dp[i-1];
	        }
	    }
	    return dp[n];
	    
	} 
}
