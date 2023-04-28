//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj) {
       boolean []vis=new boolean[n];
       for(int i=0;i<n;i++){
           if(vis[i]==false){
               if(bfsCycle(i,adj,vis)==true)return true;
           }
       }
       return false;
    }
    
    
    boolean bfsCycle(int node,ArrayList<ArrayList<Integer>>adj,boolean []vis){
        vis[node]=true;
        Queue<Pair>mq=new ArrayDeque<>();
        mq.add(new Pair(node,-1));
        
        while(mq.size()>0){
            Pair p=mq.poll();
            node=p.x;
            int parent=p.y;
            for(int it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    mq.add(new Pair(it,node));
                }else {
                    if(it!=parent){
                        return true;
                    }
                }
            }
            
        }
        return false;
    }
}