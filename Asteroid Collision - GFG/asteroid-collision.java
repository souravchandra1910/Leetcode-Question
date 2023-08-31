//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int val:asteroids){
            if(val>0){
                st.push(val);
            }else{
                while(st.size()>0 && st.peek()>0 && st.peek()<-val){
                    st.pop();
                }
                if(st.size()>0 && st.peek()==-val){
                    st.pop();
                }
                else if(st.size()>0 && st.peek()>-val){
                    continue;
                }else{
                    st.push(val);
                }
            }
        }
        int []arr=new int[st.size()];
         int idx=arr.length-1;
         while(st.size()>0){
             arr[idx--]=st.pop();
         }
         return arr;
        
        
    }
}
