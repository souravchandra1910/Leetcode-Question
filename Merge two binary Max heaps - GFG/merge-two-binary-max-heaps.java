// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static boolean isMerged(int[] a, int[] b, int[] merged){
        if(a.length + b.length != merged.length)
            return false;
        
        int[] m = new int[merged.length];
        int i = 0;
        for(int e : a)
            m[i++] = e;
        for(int e : b)
            m[i++] = e;
        Arrays.sort(m);
        int[] mergedCopy = Arrays.copyOf(merged, merged.length);
        Arrays.sort(mergedCopy);
        if(!Arrays.equals(m, mergedCopy))
            return false;
        
        for(i = 1; i < merged.length; i++){
            if(merged[i] > merged[(i-1)/2])
                return false;
        }
        
        return true;
    }
    
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int a[] = new int[n];
            int b[] = new int[m];
            int merged[];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            int[] copyA = Arrays.copyOf(a, a.length), copyB = Arrays.copyOf(b, b.length);
            merged = obj.mergeHeaps(a, b, n, m);
            
            boolean flag = isMerged(copyA, copyB, merged);
            System.out.println(flag ? 1 : 0);
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
         int []ans=new int[n+m];
         int idx=0;
         for(int i=0;i<n;i++)ans[idx++]=a[i];
         for(int i=0;i<m;i++)ans[idx++]=b[i];
         
         int N=n+m;
         for(int i=N/2;i>=0;i--){
             downHeapify(i,ans);
         }
         return ans;
    

    }
    
    void downHeapify(int pidx,int []ans){
        int mini=pidx;
        int left=2*pidx+1;
        int right=2*pidx+2;
        
        if(left < ans.length && ans[left]>ans[mini]){
            mini=left;
        }
        
        if(right < ans.length && ans[right]>ans[mini]){
            mini=right;
        }
        
        if(pidx!=mini){
            swap(mini,pidx,ans);
            downHeapify(mini,ans);
        }
    }
    void swap(int i,int j,int []ans){
        int temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }
}
//1.54 sec