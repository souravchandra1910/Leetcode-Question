//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while(t-- > 0)
        {
            
            
            int R = sc.nextInt();
            
            int C = sc.nextInt();
            
           
            
            int hospital[][] = new int[R][C];
            
            int cnt=0;
            for(int i = 0; i < R; i++)
                {
                    for(int j=0; j < C; j++)
                {
                    hospital[i][j] = sc.nextInt();
                }
                    
                }
            
            Solution ob = new Solution();
            System.out.println(ob.helpaterp(hospital));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
     int[] dx = { -1, 0, 1, 0 };
     int[] dy = { 0, -1, 0, 1 };
     public class Pair{
    	int x,y,t;
    	Pair(int x,int y,int t){
    		this.x=x;
    		this.y=y;
    		this.t=t;
    	}
    }
     public int helpaterp(int[][] arr) {
       int n=arr.length,m=arr[0].length;
       int fresh=0;
       boolean [][]vis=new boolean[n][m];
       Queue<Pair>mq=new ArrayDeque<>();
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
             if(arr[i][j]==1){
                 fresh++;
             }else if(arr[i][j]==2){
                 mq.add(new Pair(i,j,0));
             }
          }
       }
       int cnt=0;
       while(mq.size()>0){
          Pair p=mq.poll();
          int row=p.x;
          int col=p.y;
          int t=p.t;
          cnt=Math.max(t,cnt);
          for(int i=0;i<4;i++){
              int nrow=row+dx[i];
              int ncol=col+dy[i];
              if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && arr[nrow][ncol]==1){
                  fresh--;
                  arr[nrow][ncol]=2;
                  mq.add(new Pair(nrow,ncol,t+1));
              }
          }
       }
       if(fresh==0)return cnt;
       return -1; 
    }
}
