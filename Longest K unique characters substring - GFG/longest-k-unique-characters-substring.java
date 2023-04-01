//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int i=0;
        int j=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int max=-1;
        int n=s.length();
        for(;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.size()<k)continue;
            if(hm.size()==k){
                max=Math.max(i-j+1,max);
            }else{
                while(j<i && hm.size()>k){
                char ch1=s.charAt(j);
                int freq=hm.get(ch1);
                if(freq==1){
                    hm.remove(ch1);
                }else{
                    hm.put(ch1,freq-1);
                }
                j++;
              }
            }
        }
        return max;
    }
}