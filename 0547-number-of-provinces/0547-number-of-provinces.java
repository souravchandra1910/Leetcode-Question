class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<Integer>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++)adj[i]=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) { // i!=j is to for checking self loop there must not exist a self loop
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }

        int cnt = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                cnt++;
                dfs(adj, vis, i);
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
