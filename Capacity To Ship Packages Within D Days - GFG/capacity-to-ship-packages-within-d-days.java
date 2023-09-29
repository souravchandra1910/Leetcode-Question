//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int low=arr[0],high=0;
        int ans=0;
        for(int i=0;i<n;i++){
            high+=arr[i];
            low=Math.min(low,arr[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canShip(arr,mid,n,d)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
           return ans;
    }
    static boolean canShip(int []arr,int mid,int n,int d){
        int sum=0;
        int cnt=1;
        for(int i=0;i<n;i++){
            if(arr[i]>mid)return false;
            sum+=arr[i];
            if(sum>mid){
                cnt++;
                sum=arr[i];
            }
        }
        return cnt<=d;
    }
};