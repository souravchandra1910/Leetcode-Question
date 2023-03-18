//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        int inc=arr[0];
        int exc=0;
        for(int i=1;i<n;i++){
            int ninc=exc+arr[i];
            int nexc=Math.max(inc,exc);
            
            inc=ninc;
            exc=nexc;
        }
        return Math.max(inc,exc);
    }
}
// dp[0]=5
// dp[1]=5
// dp[2]=15
// dp[3]=
// dp[4]
// dp[5]