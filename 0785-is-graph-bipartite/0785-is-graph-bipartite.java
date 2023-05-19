class Solution {

    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                if (bfsCheck(graph, color, i) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean bfsCheck(int[][] graph, int[] color, int node) {
       Queue<Integer>mq=new ArrayDeque<>();
        mq.add(node);
        color[node]=1;
        while(mq.size()>0){
            node=mq.poll();
            for(int it:graph[node]){
                if(color[it]==-1){
                    color[it]=1-color[node];
                    mq.add(it);
                }
                else if(color[node]==color[it]){
                    return false;
                }
            }
        }
                        
    
       return true;
    }
}
                     
