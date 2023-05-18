class Solution {

    public int countCompleteComponents(int n, int[][] edges) {
        //build the graph
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }

        int cnt = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                if (bfs(i, vis, graph) == true){
                  cnt++; 
                }
            }
        }
        return cnt;
    }

    boolean bfs(int node, boolean[] vis, List<Integer>[] graph) {
        int cnode = 1;
        int edge = 0;
        vis[node] = true;
        Queue<Integer> mq = new ArrayDeque<>();
        mq.add(node);
        while (mq.size() > 0) {
            int n = mq.poll();
            for (int it : graph[n]) {
                edge++;
                if (vis[it] == false) {
                    vis[it] = true;
                    cnode++; 
                    mq.add(it);
                }
            }
        }
        return edge == ((cnode * (cnode - 1)));
    }
}
