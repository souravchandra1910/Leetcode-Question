class Solution {

    public boolean canFinish(int n, int[][] p) {
        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];
        ArrayList<Integer>[] adj = new ArrayList[n];
       for(int i = 0; i < n; i++){
        adj[i] = new ArrayList<>();
      }
        for (int[] it : p) {
            int u=it[1];
            int v=it[0];
            adj[u].add(v);
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                if (dfsCycleDG(i, vis, pathVis, adj) == true) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfsCycleDG(int node, boolean[] vis, boolean[] pathVis, ArrayList<Integer>[] adj) {
        vis[node] = true;
        pathVis[node] = true;
        for (int it : adj[node]) {
            if (vis[it] == false) {
                if (dfsCycleDG(it, vis, pathVis, adj) == true) return true;
            } else if (vis[it]==true && pathVis[it] == true) {
                return true;
            }
        }
        pathVis[node] = false;
        return false;
    }
}
