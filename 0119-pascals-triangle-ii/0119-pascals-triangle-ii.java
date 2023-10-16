class Solution {

    public List<Integer> getRow(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        long val = 1;
        for (int r = 0; r <= n; r++) {
            al.add((int) val);
            val = val * (n - r) / (r + 1);
        }
        return al;
    }
}
