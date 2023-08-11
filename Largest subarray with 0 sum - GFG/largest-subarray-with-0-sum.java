//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        int sum=0;
        int maxLen=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(sum,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)==true){
                // System.out.println(sum+"------>"+hm.get(sum)+"----->"+i);
                maxLen=Math.max(i-hm.get(sum),maxLen);
            }
           else hm.put(sum,i);
        }
        return maxLen;
    }
}