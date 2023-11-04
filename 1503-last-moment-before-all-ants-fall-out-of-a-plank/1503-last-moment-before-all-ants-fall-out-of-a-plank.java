class Solution {

    public int getLastMoment(int n, int[] left, int[] right) {
        int max=0;
        for (int val : left) max=Math.max(val,max);
        for (int val : right) max=Math.max(n-val,max);
        return max;
    }
}
