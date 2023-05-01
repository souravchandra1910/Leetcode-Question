class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] arr = new ArrayList[n];
        for (int i = 0; i < n; i++) arr[i] = new ArrayList<>();
        for (int[] it : edges) {
            int u = it[0];
            int v = it[1];
            arr[v].add(u);
            arr[u].add(v);
        }
        boolean[] vis = new boolean[n];
        return dfsPaths(source, destination, arr, vis);
    }

    boolean dfsPaths(int src, int des, List<Integer>[] adj, boolean[] vis) {
        if (src == des) {
            return true;
        }
        vis[src] = true;
        for (int it : adj[src]) {
            if (vis[it] == false) {
               if(dfsPaths(it, des, adj, vis)==true)return true;
            }
        }
        return false;
    }
}
