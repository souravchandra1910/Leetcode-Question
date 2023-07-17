class Solution {

    public int minimumIndex(List<Integer> nums) {
        int maxF = 0;
        int maxE = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : nums) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
            int freq = hm.get(val);
            if (freq > maxF) {
                maxF = freq;
                maxE = val;
            }
        }
        int cnt = 0;
        int idx = -1;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int val = nums.get(i);
            if (val == maxE) {
                cnt++;
            }
            if (2 * cnt > i + 1 && 2 * (maxF - cnt) > (n - i - 1)) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
