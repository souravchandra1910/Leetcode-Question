//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                sum-=1;
            }else sum++;
            
            if(hm.containsKey(sum)==true){
                ans+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}


