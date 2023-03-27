//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
       //1st step find the dip
       List<Integer>al=new ArrayList<>();
       if(n==1){
           al.add(arr[0]);
           return al;
       }
       int idx=-1;
       for(int i= n-2;i>=0;i--){
           if(arr[i]<arr[i+1]){
               idx=i;
               break;
           }
       }
       if(idx==-1){
           Arrays.sort(arr);
       }else{
           int mini=arr[idx+1];
           int minIdx=idx+1;
           for(int i=idx+1;i<n;i++){
               if(arr[i]>arr[idx]){
                   if(mini>arr[i]){
                       mini=arr[i];
                       minIdx=i;
                   }
               }
           }
           swap(arr,minIdx,idx);
           Arrays.sort(arr,idx+1,n);
           
       }
       for(int i=0;i<n;i++)al.add(arr[i]);
       return al;
    }
    public static void swap(int []arr,int i,int j){
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
}
}