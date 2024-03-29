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
       int []dp=new int[n];
       dp[0]=Math.max(arr[0],0);
       for(int i=1;i<n;i++){
           int pick=arr[i];
           if(i>1)pick+=dp[i-2];
           int notpick=dp[i-1];
           
           dp[i]=Math.max(pick,notpick);
       }
       return dp[n-1];
    }
}
// dp[0]=5
// dp[1]=5
// dp[2]=15
// dp[3]=
// dp[4]
// dp[5]