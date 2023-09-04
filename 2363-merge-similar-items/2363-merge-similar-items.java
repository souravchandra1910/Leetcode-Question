class Solution {

    public List<List<Integer>> mergeSimilarItems(int[][] i1, int[][] i2) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(i1, (a, b) -> a[0] - b[0]);
        Arrays.sort(i2, (a, b) -> a[0] - b[0]);
        int i = 0;
        int j = 0;
        while (i < i1.length && j < i2.length) {
            List<Integer> al = new ArrayList<>();
            int v1 = i1[i][0];
            int v2 = i2[j][0];
            int w1 = i1[i][1];
            int w2 = i2[j][1];
            if (v1 == v2) {
                al.add(v1);
                al.add(w1 + w2);
                i++;
                j++;
            } else if (v1 < v2) {
                al.add(v1);
                al.add(w1);
                i++;
            } else {
                al.add(v2);
                al.add(w2);
                j++;
            }

            ans.add(al);
        }
        while (i < i1.length) {
            List<Integer> al = new ArrayList<>();
            al.add(i1[i][0]);
            al.add(i1[i][1]);
            ans.add(al);
            i++;
        }
        while (j < i2.length) {
            List<Integer> al = new ArrayList<>();
            al.add(i2[j][0]);
            al.add(i2[j][1]);
            j++;
            ans.add(al);
        }
        return ans;
    }
}
