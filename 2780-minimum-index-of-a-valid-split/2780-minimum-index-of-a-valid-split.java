class Solution {

    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxE = 0;
        int maxF = 0;
        for (int val : nums) {
            int freq = hm.getOrDefault(val, 0) + 1;
            if (freq > maxF) {
                maxF = freq;
                maxE = val;
            }
            hm.put(val, freq);
        }
        // System.out.println(maxE);
        int n = nums.size();
        int cnt = 0;
        int idx = -1;
        boolean f1 = false, f2 = false;
        for (int i = 0; i < n; i++) {
            int val = nums.get(i);

            if (val == maxE) {
                cnt++;
                // System.out.println(cnt+" "+(maxF-cnt));
            }
            if ((2 * cnt > i + 1) && ((2 * (maxF - cnt)) > (n - i - 1))) {
                
                idx = i;
                break;
            }
        }
        return idx;
    }
}
