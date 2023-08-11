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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        int maxLen=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.containsKey(ch)==true){
                while(j<i && hm.get(ch)>1){
                    char ch1=s.charAt(j);
                    int freq=hm.get(ch1);
                    if(freq==1){
                       hm.remove(ch1); 
                    }
                    else{
                        hm.put(ch1,freq-1);
                    }
                    j++;
                }
            }
            maxLen=Math.max(maxLen,i-j+1);
            // System.out.println(maxLen);
        }
        return maxLen;
    }
}