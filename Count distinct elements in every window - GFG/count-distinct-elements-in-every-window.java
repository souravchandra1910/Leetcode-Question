//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int []arr, int n, int k)
    {
        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<k;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        al.add(hm.size());
        int j=0;
        for(int i=k;i<n;i++){
            int freq=hm.get(arr[j]);
            if(freq==1){
                hm.remove(arr[j]);
            }else{
                hm.put(arr[j],freq-1);
            }
            j++;
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            al.add(hm.size());
        }
        return al;
    }
}

