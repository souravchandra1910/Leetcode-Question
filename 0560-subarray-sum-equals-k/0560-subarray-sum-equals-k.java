class Solution {

    public int subarraySum(int[] nums, int k) {
        // idea is to keep on calculating prefix sum and store it in the map
        // if map.contains(sum-k)==true (if sum repeats)
        // cnt++;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int tsum = 0, cnt = 0;
        hm.put(0, 1);
        for (int val : nums) {
            tsum += val;
            int remaining_sum = tsum - k;
            if (hm.containsKey(remaining_sum) == true) {
                cnt += hm.get(remaining_sum);
            }
            hm.put(tsum, hm.getOrDefault(tsum, 0) + 1);
        }
        return cnt;
    }
}
