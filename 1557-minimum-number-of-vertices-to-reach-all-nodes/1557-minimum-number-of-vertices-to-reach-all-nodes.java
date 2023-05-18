class Solution {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // just check for indegrees
        // why?
        // if an edge only has outdegree it cannot be reached from any other node
        List<Integer> al = new ArrayList<>();
        boolean[] hasInDegree = new boolean[n];

        for (List<Integer> edge : edges) {
            hasInDegree[edge.get(1)] = true;
        }
        for (int i = 0; i < n; i++) {
            if (hasInDegree[i] == false) {
                al.add(i);
            }
        }
        return al;
    }
}
