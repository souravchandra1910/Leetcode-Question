class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length; // no of vertices
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++)graph[i]=new ArrayList<>();
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if (isConnected[u][v] == 1 && u != v) {
                    graph[u].add(v);
                    graph[v].add(u);
                }
            }
        }
        int cnt = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                cnt++;
                dfs(graph, vis, i);
            }
        }
        return cnt;
    }

    void dfs(ArrayList<Integer>[] adj, boolean[] vis, int node) {
        vis[node] = true;
        for (int it : adj[node]) {
            if (vis[it] == false) {
                dfs(adj, vis, it);
            }
        }
    }
}
