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
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    int m=(int)1e9+7;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
        int t[][]=new int[n+1][sum+1];
        int cnt=1;
        t[0][0]=1;
        for(int i=0;i<n;++i)
        {
            if(arr[i]==0)
            {
                cnt*=2;
                t[i+1][0]=cnt;
            }
            else
            {
                t[i+1][0]=t[i][0];
            }
            
        }
        int mod= (int)1e9+7;
        for(int i=1;i<n+1;++i)
        {
            for(int j=1;j<sum+1;++j)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=(t[i-1][j]+t[i-1][j-arr[i-1]])%mod;
                }
                else if(arr[i-1]>j)
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
       
	}
}