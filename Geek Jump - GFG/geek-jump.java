//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int n){
       int []dp=new int[n];
       dp[0]=0;
       if(arr.length>1)dp[1]=Math.abs(arr[1]-arr[0]);
       for(int i=2;i<n;i++){
           int onestep=Math.abs(arr[i]-arr[i-1]);
           int twostep=Math.abs(arr[i]-arr[i-2]);
           dp[i]=Math.min(onestep+dp[i-1],twostep+dp[i-2]);
       }
       return dp[n-1];
    }
}