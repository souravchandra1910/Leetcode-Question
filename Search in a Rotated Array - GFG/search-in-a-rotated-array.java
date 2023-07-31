//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int arr[], int l, int h, int x)
    
    {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)return mid;
            // left half is sorted
            else if(arr[mid]>=arr[low]){
                if(arr[low]<=x && arr[mid]>x){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
            // right half is sorted
            else if(arr[mid]<arr[high]){
                if(arr[mid]<=x && arr[high]>x){
                    low=mid+1;
                }else{
                    high=mid-1;  
                }   
            }
        }
        return -1;
    }
}