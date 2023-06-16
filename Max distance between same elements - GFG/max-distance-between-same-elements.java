//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.maxDistance(arr,n));
		
		t--;
		}
	}
}
// } Driver Code Ends


// your task is to complete this function
class Solution
{
    int maxDistance(int arr[], int n)
    {
	  int max=0;
	  HashMap<Integer,Integer>hm=new HashMap<>();
	  for(int i=0;i<n;i++){
	      if(hm.containsKey(arr[i])==true){
	          max=Math.max(max,i-hm.get(arr[i]));
	      }else{
	          hm.put(arr[i],i);
	      }
	  }
	  return max;
    }
}
