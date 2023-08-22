//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}

// } Driver Code Ends


class GfG
{
    int max_sum(int arr[], int n)
    {
       int sum=0;
       int s0=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           s0+=(i*arr[i]);
       }
       int max=s0;
       for(int i=0;i<n-1;i++){
            int s=s0+sum-n*arr[n-i-1];
            max=Math.max(s,max);
            s0=s;
       }
       return max;
    }	
}

// find missing and repeating digit
// find maximum index of array
// find missing elements
// last unique character
// longest palindrome
// given a text and pattern find the pattern exist in the string or not
// rain water trapping
// longest common subsequence
// Max sum of i*arr[i] 