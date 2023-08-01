class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        res(ans, new ArrayList<Integer>(), 1, n, k);
        return ans;
    }

    public static void res(List<List<Integer>> ans, List<Integer> al, int idx, int n, int k) {
        if (k == 0) {
            List<Integer> temp = new ArrayList<>(al);
            ans.add(temp);
            return;
        }
        for (int i = idx; i <= n; i++) {
            al.add(i);
            res(ans, al, i + 1, n, k - 1);
            al.remove(al.size() - 1);
        }
    }
}
