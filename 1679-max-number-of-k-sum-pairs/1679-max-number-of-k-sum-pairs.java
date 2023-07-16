class Solution {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : nums) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int p1 = nums[i];
            int p2 = k - p1;
            if (hm.containsKey(p2)) {
                if (p1 == p2) {
                    cnt += hm.get(p1) / 2;
                    hm.remove(p1);
                } else {
                    cnt += Math.min(hm.get(p1), hm.get(p2));
                    hm.remove(p1);
                    hm.remove(p2);
                }
            }
        }
        return cnt;
    }
}
