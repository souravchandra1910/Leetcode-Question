class Solution {

    public List<List<Integer>> findWinners(int[][] matches) {
        int n = matches.length;
        int[] win = new int[1000005];
        int[] loss = new int[1000005];
        for (int i = 0; i < n; i++) {
            win[matches[i][0]]++;
            loss[matches[i][1]]++;
        }
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        for (int i = 0; i < win.length; i++) {
            if (win[i] > 0 && loss[i] == 0) al.add(i); else if (loss[i] == 1) bl.add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(al);
        ans.add(bl);

        return ans;
    }
}
