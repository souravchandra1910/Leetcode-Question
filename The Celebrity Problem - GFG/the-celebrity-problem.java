//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
        Stack<Integer>st=new Stack<>();
    	for(int i=0;i<n;i++){
    	    st.push(i);
    	}
    	while(st.size()>=2){
    	    int i=st.pop();
    	    int j=st.pop();
    	    if(arr[i][j]==1){
    	        st.push(j);
    	    }else{
    	        st.push(i);
    	    }
    	}
    	int pot=st.pop();
    	for(int i=0;i<n;i++){
    	    if(pot!=i){
    	        if(arr[pot][i]==1 || arr[i][pot]==0){
    	            return -1;
    	        }
    	    }
    	}
    	return pot;
    }
}