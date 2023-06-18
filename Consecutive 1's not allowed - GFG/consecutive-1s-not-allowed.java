//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long mod=(long)1e9+7;
    long countStrings(int n) {
        //  long []ones=new long[n+1];
        //  long []zeros=new long[n+1];
        //  ones[1]=1;
        //  zeros[1]=1;
        //  for(int i=2;i<=n;i++){
        //      zeros[i]=(ones[i-1]%mod+zeros[i-1]%mod)%mod;
        //      ones[i]=zeros[i-1]%mod;
        //  }
        //  return (ones[n]%mod+zeros[n]%mod)%mod;
        
        long a=1;
        long b=1;
        for(int i=2;i<=n;i++){
            long c=(a%mod+b%mod)%mod;
            long d=a%mod;
            
            a=c;
            b=d;
        }
        return (a%mod+b%mod)%mod;
    }
}