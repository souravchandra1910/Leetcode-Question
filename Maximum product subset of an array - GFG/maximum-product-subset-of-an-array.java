//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findMaxProduct(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int findMaxProduct(int n, int[] arr) {
        if(n==1)return arr[0];
        int m=(int)1e9+7;
        long prd=1;
		int zeros=0;
		int negative=0;
		int max_negative=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				zeros++;
				continue;
			}
			if(arr[i]<0) {
				negative++;
				max_negative=Math.max(max_negative,arr[i]);
			}
			prd=(prd%m*1L*arr[i]%m)%m;
		}
		if(zeros==n) {
		   return 0;
		}else if(negative==1 && zeros+negative==n) {
		   return 0;
		}else {
			if(negative%2==1) {
				prd/=max_negative;
			}
		    return (int)prd;
		}
	}
}
        
