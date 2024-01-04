class Solution {

    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : nums) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        int ans = 0;
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if(freq==1)return -1;
            if (freq % 3 == 0 && freq % 2 == 0 || freq % 3 == 0) {
                ans += (freq / 3);
            } else if (freq % 2 == 0) {
                while (freq % 3 != 0 && freq != 0) {
                    freq = freq - 2;
                    ans++;
                }
                if (freq != 0) {
                    ans += freq / 3;
                }
            } else if (freq % 2 == 1) {
                while (freq % 3 != 0 && freq != 0) {
                    freq = freq - 2;
                    ans++;
                }
                if (freq != 0) {
                    ans += freq / 3;
                }
            }
        }
        return ans;
    }
}
