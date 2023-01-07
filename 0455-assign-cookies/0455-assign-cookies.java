class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0, cnt = 0;
        for (int i = 0; i < g.length && j < s.length;) {
            if (s[j] >= g[i]) {
                cnt++;
                i++;
            }
            j++;
        }
        return cnt;
    }
}
