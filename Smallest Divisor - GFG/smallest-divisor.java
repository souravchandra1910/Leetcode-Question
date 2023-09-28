//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int K;
            K = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.smallestDivisor(nums, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int smallestDivisor(int[] nums, int k) {
        int low=1,high=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canDivide(nums,mid,k)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private static boolean canDivide(int []nums,int mid,int k){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=(nums[i]/mid);
            if(nums[i]%mid!=0)ans++;
        }
        return ans<=k;
    }
}