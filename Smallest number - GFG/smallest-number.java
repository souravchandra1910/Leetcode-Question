//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestNumber(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String smallestNumber(int s, int d){
        if(9*d<s)return "-1";
        StringBuilder sb=new StringBuilder();
        for(int i=d-1;i>=0;i--){
            if(s>9){
                sb.append(9);
                s-=9;
            }else{
                if(i==0){
                   sb.append(s); 
                }else{
                    sb.append(s-1);
                    s-=(s-1);
                    while(i>1){
                        sb.append(0);
                        i--;
                    }
                }
            }
            
        }
        return sb.reverse().toString();
    }
}