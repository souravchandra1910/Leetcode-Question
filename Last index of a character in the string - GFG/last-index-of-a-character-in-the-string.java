//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();
            char c = read.readLine().trim().charAt(0);
            Solution ob = new Solution();
            System.out.println(ob.LastIndex(s, c));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int LastIndex(String s, char p){
      return s.lastIndexOf(p);
    }
}
