class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        ArrayList<Integer>[]arr=new ArrayList[n];
        for(int i=0;i<n;i++)arr[i]=new ArrayList<>();
        for(int []it:edges){
            int u=it[0];
            int v=it[1];
            arr[v].add(u);
            arr[u].add(v);
        }
        boolean []vis=new boolean[n+1];
        return dfs(arr,vis,src,des);
    }
    
    
    public boolean dfs(ArrayList<Integer>[]arr,boolean []vis,int src,int des){
        if(src==des)return true;
        vis[src]=true;
        for(int it:arr[src]){
            if(vis[it]==false){
            boolean val=dfs(arr,vis,it,des);
            if(val==true){
            return true;
            }
        }
        }
        return false;
    }
    
    
}