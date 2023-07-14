class Solution {

    public int longestSubsequence(int[] arr, int diff) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 1;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i] - diff;
            cnt = hm.getOrDefault(val, 0)+1;
            hm.put(arr[i], hm.getOrDefault(val, 0) + 1);
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
