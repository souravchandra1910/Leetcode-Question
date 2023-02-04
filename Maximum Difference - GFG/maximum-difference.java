// { Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int findMaxDiff(int a[], int n)
    {
		int max=0;
		int []l=nsel(a,n);
		int []r=nser(a,n);
		for(int i=0;i<n;i++){
		    max=Math.max(Math.abs(l[i]-r[i]),max);
		}
		return max;
    }
    
    int []nsel(int []arr,int n){
        Stack<Integer>st=new Stack<>();
        int []ans=new int[n];
        ans[0]=0;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i]<=st.peek()){
                st.pop();
            }
            if(st.size()==0)ans[i]=0;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    int []nser(int []arr,int n){
        Stack<Integer>st=new Stack<>();
        int []ans=new int[n];
        ans[n-1]=0;
         st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]<=st.peek()){
                st.pop();
            }
            if(st.size()==0)ans[i]=0;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}